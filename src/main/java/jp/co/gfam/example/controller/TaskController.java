package jp.co.gfam.example.controller;

import jp.co.gfam.example.entity.Task;
import jp.co.gfam.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Task> get() {
        Task entity = new Task();
        entity.setName("資料作成");
        entity.setStatus("新規");
        entity.setDetail("テストテストテスト");
        entity.setDeadline(new Date());
        taskRepository.save(entity);

        return taskRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Task entity) throws Exception {
        taskRepository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Task entity) throws Exception {
        taskRepository.save(entity);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void delete(@PathVariable Long id) throws Exception {
        taskRepository.delete(id);
    }

}
