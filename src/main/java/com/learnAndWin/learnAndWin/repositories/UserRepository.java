package com.learnAndWin.learnAndWin.repositories;

import com.learnAndWin.learnAndWin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
