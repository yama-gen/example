package jp.co.gfam.example.entity;

import javax.persistence.Entity;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@Entity
public class Event {

    public Event() {}

    public Event(String name, String startDatetime, String endDatetime, String place, Long cost, Long capacity, Long participant) {
        this.name = name;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.place = place;
        this.cost = cost;
        this.capacity = capacity;
        this.participant = participant;
    }

    private String name;

    private String startDatetime;

    private String endDatetime;

    private String place;

    private Long cost;

    private Long capacity;

    private Long participant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getParticipant() {
        return participant;
    }

    public void setParticipant(Long participant) {
        this.participant = participant;
    }
}
