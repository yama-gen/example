package jp.co.gfam.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jp.co.gfam.example.entity.Event;
import jp.co.gfam.example.entity.MemberEvent;
import jp.co.gfam.example.repository.EventRepository;
import jp.co.gfam.example.repository.MemberEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Event> get() {
        return eventRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody String body) throws Exception {
        Event entity = new ObjectMapper().readValue(body, Event.class);
        eventRepository.save(entity);

        MemberEvent memberEvent = new MemberEvent();
        memberEvent.setEventId(entity.getEventId());
        memberEvent.setMemberId(1L);
        memberEventRepository.save(memberEvent);
    }
}
