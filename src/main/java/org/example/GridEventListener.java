package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GridEventListener {

    @Autowired
    private GridEventQueryRepository gridEventQueryRepository;

    @KafkaListener(topics = "grid-events", groupId = "grid-group")
    public void handlerGridEventCreatedEvent(GridEventCreatedEvent event) {
        // on receiving the event, update the query database
        GridEventQuery gridEventQuery = new GridEventQuery();
        gridEventQuery.setId(event.getEventId());
        gridEventQuery.setDeviceId(event.getDeviceId());
        gridEventQuery.setEventType(event.getEventType());
        gridEventQuery.setEventData(event.getEventData);
        gridEventQuery.setTimestamp(event.getTimestamp());

        //save or update the event in the query database
        gridEventQueryRepository.save(gridEventQuery);
    }
}
