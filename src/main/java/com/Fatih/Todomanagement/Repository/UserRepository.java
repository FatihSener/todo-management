package com.Fatih.Todomanagement.Repository;

import com.Fatih.Todomanagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
