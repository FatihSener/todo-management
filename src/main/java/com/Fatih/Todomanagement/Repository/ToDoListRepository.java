package com.Fatih.Todomanagement.Repository;

import com.Fatih.Todomanagement.Entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {

}
