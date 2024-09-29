package com.artofcode.artofcodebck.Repositories;

import com.artofcode.artofcodebck.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("SELECT c FROM Category c")
    List<Category> findAllWithoutTutorials();
}
