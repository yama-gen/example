package jp.co.gfam.example.controller;

import jp.co.gfam.example.entity.Event;
import jp.co.gfam.example.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Event> get() {
//        eventRepository.save(new ArrayList<Event>() {{
//            add(new Event("第5回GFAM杯", "2015/10/10(土) 08:00", "2015/10/10(土) 16:00", "取手国際ゴルフ倶楽部", 20000L, 20L, 14L));
//            add(new Event("バーベキュー", "2015/10/24(土) 10:00", "2015/10/25(日) 10:00", "小田原", 5000L, 15L, 12L));
//            add(new Event("第5回GFAM杯", "2015/10/10(土) 08:00", "2015/10/10(土) 16:00", "取手国際ゴルフ倶楽部", 20000L, 20L, 14L));
//            add(new Event("バーベキュー", "2015/10/24(土) 10:00", "2015/10/25(日) 10:00", "小田原", 5000L, 15L, 12L));
//            add(new Event("第5回GFAM杯", "2015/10/10(土) 08:00", "2015/10/10(土) 16:00", "取手国際ゴルフ倶楽部", 20000L, 20L, 14L));
//            add(new Event("バーベキュー", "2015/10/24(土) 10:00", "2015/10/25(日) 10:00", "小田原", 5000L, 15L, 12L));
//            add(new Event("第5回GFAM杯", "2015/10/10(土) 08:00", "2015/10/10(土) 16:00", "取手国際ゴルフ倶楽部", 20000L, 20L, 14L));
//            add(new Event("バーベキュー", "2015/10/24(土) 10:00", "2015/10/25(日) 10:00", "小田原", 5000L, 15L, 12L));
//            add(new Event("第5回GFAM杯", "2015/10/10(土) 08:00", "2015/10/10(土) 16:00", "取手国際ゴルフ倶楽部", 20000L, 20L, 14L));
//            add(new Event("バーベキュー", "2015/10/24(土) 10:00", "2015/10/25(日) 10:00", "小田原", 5000L, 15L, 12L));
//            add(new Event("第5回GFAM杯", "2015/10/10(土) 08:00", "2015/10/10(土) 16:00", "取手国際ゴルフ倶楽部", 20000L, 20L, 14L));
//            add(new Event("バーベキュー", "2015/10/24(土) 10:00", "2015/10/25(日) 10:00", "小田原", 5000L, 15L, 12L));
//
//        }});

        return eventRepository.findAll();
    }
}
