package com.Fatih.Todomanagement.api;


import com.Fatih.Todomanagement.Servise.impl.ToDoListServiceImpl;
import com.Fatih.Todomanagement.dto.ProjectDto;
import com.Fatih.Todomanagement.dto.ToDoListDto;
import com.Fatih.Todomanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.ToDoListCtrl.CTRL)
@Api(value = ApiPaths.ToDoListCtrl.CTRL, description = "ToDoList APIs")
public class ToDoListController {

    private final ToDoListServiceImpl toDoListServiceImpl;

    public ToDoListController(ToDoListServiceImpl toDoListServiceImpl) {
        this.toDoListServiceImpl = toDoListServiceImpl;
    }

    @GetMapping("/id")
    @ApiOperation(value = "Get By Id Operation", response = ToDoListDto.class)
    public ResponseEntity<ToDoListDto> getById(@PathVariable(value = "id", required = true) Long id) {
        ToDoListDto toDoListDto = toDoListServiceImpl.getById(id);
        return ResponseEntity.ok(toDoListDto);
    }

    @PostMapping
    @ApiOperation(value = "Create Operation", response = ToDoListDto.class)
    public ResponseEntity<ToDoListDto> createProject(@Valid @RequestBody ToDoListDto project) {
        return ResponseEntity.ok(toDoListServiceImpl.save(project));
    }

    @PutMapping
    @ApiOperation(value = "Update Operation", response = ToDoListDto.class)
    public ResponseEntity<ToDoListDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody ToDoListDto project) {
        return ResponseEntity.ok(toDoListServiceImpl.update(id, project));
    }

    @DeleteMapping("/id")
    @ApiOperation(value = "Delete Operation", response = ToDoListDto.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(toDoListServiceImpl.delete(id));
    }
}
