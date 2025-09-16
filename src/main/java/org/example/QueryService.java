package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryService {

    @Autowired
    private GridEventQueryRepository gridEventQueryRepository;

    public List<GridEventQuery> getAllGridEvents() {
        return gridEventQueryRepository.findAll();
    }

    public GridEventQuery getGridEventById(Long id) {
        return gridEventQueryRepository.findById(id).orElse(null);
    }
}
