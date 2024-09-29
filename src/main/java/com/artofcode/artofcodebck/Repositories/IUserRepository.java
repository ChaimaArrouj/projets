package com.artofcode.artofcodebck.Repositories;

import com.artofcode.artofcodebck.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {


}
