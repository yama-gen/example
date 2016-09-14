package jp.co.gfam.example.controller;

import jp.co.gfam.example.entity.Event;
import jp.co.gfam.example.entity.MemberEvent;
import jp.co.gfam.example.repository.EventRepository;
import jp.co.gfam.example.repository.MemberEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private MemberEventRepository memberEventRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> get() {
        return eventRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Event entity) throws Exception {
        eventRepository.save(entity);

        MemberEvent memberEvent = new MemberEvent();
        memberEvent.setEventId(entity.getEventId());
        memberEvent.setMemberId(1L);
        memberEventRepository.save(memberEvent);
    }
}
