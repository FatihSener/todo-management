package com.Fatih.Todomanagement.Servise.impl;

import com.Fatih.Todomanagement.Entity.ToDoListHistory;
import com.Fatih.Todomanagement.Repository.ToDoListHistoryRepository;
import com.Fatih.Todomanagement.Servise.ToDoListHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ToDoListHistoryServiceImpl implements ToDoListHistoryService {

    private final ToDoListHistoryRepository toDoListHistoryRepository;

    public ToDoListHistoryServiceImpl(ToDoListHistoryRepository toDoListHistoryRepository){
        this.toDoListHistoryRepository=toDoListHistoryRepository;
    }

    @Override
    public ToDoListHistory save(ToDoListHistory toDoListHistory) {
        if (toDoListHistory.getDate() == null) {
            throw new IllegalArgumentException("ToDoListHistory code cannot be null!");
        }

        return toDoListHistoryRepository.save(toDoListHistory);
    }

    @Override
    public ToDoListHistory getById(Long id) {
        return toDoListHistoryRepository.getOne(id);
    }

    @Override
    public Page<ToDoListHistory> getAllPageable(Pageable pageable) {
        return toDoListHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(ToDoListHistory toDoListHistory) {
        toDoListHistoryRepository.delete(toDoListHistory);
        return Boolean.TRUE;
    }
}
