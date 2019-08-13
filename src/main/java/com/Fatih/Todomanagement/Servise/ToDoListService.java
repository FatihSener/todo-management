package com.Fatih.Todomanagement.Servise;

import com.Fatih.Todomanagement.Entity.ToDoList;
import com.Fatih.Todomanagement.dto.ToDoListDto;
import com.Fatih.Todomanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface ToDoListService {

    ToDoList save(ToDoList toDoList);

    ToDoListDto save(ToDoListDto toDoList);

    ToDoList getById(Long id);

    TPage<ToDoListDto> getAllPageable(Pageable pageable);

    Boolean delete(ToDoListDto toDoList);

    Boolean delete(ToDoList toDoList);
}
