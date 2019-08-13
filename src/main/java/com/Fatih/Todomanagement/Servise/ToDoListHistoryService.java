package com.Fatih.Todomanagement.Servise;

import com.Fatih.Todomanagement.Entity.ToDoListHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ToDoListHistoryService {
    ToDoListHistory save(ToDoListHistory toDoListHistory);

    ToDoListHistory getById(Long id);

    Page<ToDoListHistory> getAllPageable(Pageable pageable);

    Boolean delete (ToDoListHistory toDoListHistory);
}
