package com.next.user_service.repository;

import com.next.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Boolean existsUserByUserNameAndPassword(String userName, String password);
}
