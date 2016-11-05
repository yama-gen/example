package jp.co.gfam.example.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by tikK56028 on 2015/09/29.
 */
@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long taskId;

    private String name;

    private String status;

    private Date deadline;

    private String detail;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
