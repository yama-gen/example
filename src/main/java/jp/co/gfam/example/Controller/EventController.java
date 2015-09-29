package jp.co.gfam.example.controller;

import jp.co.gfam.example.entity.Event;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Event> get() {
        return new ArrayList<Event>() {{
            add(new Event("��5��GFAM�t", "2015/10/10(�y) 08:00", "2015/10/10(�y) 16:00", "��荑�ۃS���t��y��", 20000L, 20L, 14L));
            add(new Event("�o�[�x�L���[", "2015/10/24(�y) 10:00", "2015/10/25(��) 10:00", "���c��", 5000L, 15L, 12L));
        }};
    }
}
