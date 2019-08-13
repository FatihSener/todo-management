package com.Fatih.Todomanagement.Repository;

import com.Fatih.Todomanagement.Entity.ToDoListHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListHistoryRepository extends JpaRepository<ToDoListHistory, Long> {
}
