package com.Fatih.Todomanagement.dto;

import com.Fatih.Todomanagement.Entity.ToDoListEnum;
import lombok.Data;

import java.util.Date;

@Data
public class ToDoListDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private ToDoListEnum toDoListEnum;
    private UserDto assignee;
    private ProjectDto project;

}
