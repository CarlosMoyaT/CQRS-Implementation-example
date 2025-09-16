package org.example;


import java.time.LocalDateTime;


//for publishing to kafka

public class GridEventCreatedEvent {

    private Long eventId;
    private String deviceId;
    private String eventType;
    private LocalDateTime timestamp;

    public GridEventCreatedEvent(Long eventId, String deviceId, String eventType, LocalDateTime timestamp) {
        this.eventId = eventId;
        this.deviceId = deviceId;
        this.eventType = eventType;
        this.timestamp = timestamp;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
