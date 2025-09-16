package org.example;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    @Autowired
    private GridEventCommandRepository gridEventCommandRepository;

    @Autowired
    private KafkaTemplate<String, GridEventCreatedEvent> kafkaTemplate;

    private static final String TOPIC = "grid-events";

    @Transactional
    public GridEventCommand createdGridEvent(GridEventCommand gridEventCommand) {
        // save the event to the write database
        GridEventCommand savedEvent = gridEventCommandRepository.save(gridEventCommand);

        // create an event and publish it to kafka
        GridEventCreatedEvent eventCreatedEvent = new GridEventCreatedEvent(
                savedEvent.getId(),
                savedEvent.getDeviceId(),
                savedEvent.getEvenType(),
                savedEvent.getEventData(),
                savedEvent.getTimestamp()
        );

        //Publish the event to kafka
        kafkaTemplate.send(TOPIC, eventCreatedEvent);

        return savedEvent;
    }
}
