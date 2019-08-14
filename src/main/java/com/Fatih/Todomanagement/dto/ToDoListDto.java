package com.Fatih.Todomanagement.dto;

import com.Fatih.Todomanagement.Entity.ToDoListEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "ToDoList History Data Transfer Object")
public class ToDoListDto {
    @ApiModelProperty(required =true,value = "ID")
    private Long id;
    @ApiModelProperty(required =true,value = "Description")
    private String description;
    @ApiModelProperty(required =true,value = "Details")
    private String details;
    @ApiModelProperty(required =true,value = "Date")
    private Date date;
    @ApiModelProperty(required =true,value = "ToDoList Enum")
    private ToDoListEnum toDoListEnum;
    @ApiModelProperty(required =true,value = "Assignee")
    private UserDto assignee;
    @ApiModelProperty(required =true,value = "Project")
    private ProjectDto project;

}
