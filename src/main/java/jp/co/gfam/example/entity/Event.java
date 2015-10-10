package jp.co.gfam.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long eventId;

    private String name;

    private String startDatetime;

    private String endDatetime;

    private String place;

    private Long cost;

    private Long capacity;

    private String detail;

    @OneToMany(mappedBy="event")
    private List<MemberEvent> memberEventList;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<MemberEvent> getMemberEventList() {
        return memberEventList;
    }

    public void setMemberEventList(List<MemberEvent> memberEventList) {
        this.memberEventList = memberEventList;
    }
}
