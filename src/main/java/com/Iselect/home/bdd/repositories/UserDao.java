package com.Iselect.home.bdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Iselect.home.bdd.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}