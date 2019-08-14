package com.Fatih.Todomanagement.Servise;

import com.Fatih.Todomanagement.Entity.ToDoList;
import com.Fatih.Todomanagement.dto.ToDoListDto;
import com.Fatih.Todomanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface ToDoListService {

    ToDoListDto save(ToDoListDto toDoList);

    ToDoListDto getById(Long id);

    TPage<ToDoListDto> getAllPageable(Pageable pageable);

    Boolean delete(Long toDoList);

    ToDoListDto update(Long id, ToDoListDto project);
}
