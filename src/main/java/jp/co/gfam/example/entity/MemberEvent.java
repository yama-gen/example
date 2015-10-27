package jp.co.gfam.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@Entity
public class MemberEvent {

    @Id
    @GeneratedValue
    private Long memberEventId;

    private Long memberId;

    private Long eventId;

    @ManyToOne
    private Event event;

    @ManyToOne
    private Member member;

    public Long getMemberEventId() {
        return memberEventId;
    }

    public void setMemberEventId(Long memberEventId) {
        this.memberEventId = memberEventId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
