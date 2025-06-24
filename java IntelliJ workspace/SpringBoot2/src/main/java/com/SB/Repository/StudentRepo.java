package com.SB.Repository;

import com.SB.Entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

//    List<Student> findByNameContainingIgnoreCase(String name);
//    List<Student> findByNameStartingWithIgnoreCase(String prefix);


//    @Query("SELECT s FROM Student s WHERE LOWER(s.name) LIKE LOWER(CONCAT('%', :name, '%'))")
//    List<Student> searchByName(@Param("name") String name);

    @Query("SELECT s FROM Student s WHERE LOWER(s.name) LIKE LOWER(CONCAT(:prefix, '%'))")
    List<Student> findByNameStartingWithIgnoreCase2(@Param("prefix") String prefix);

    @Query("SELECT s FROM Student s WHERE LOWER(s.name) LIKE LOWER(CONCAT(:prefix, '%'))")
    Page<Student> findByNameStartingWithIgnoreCase2(@Param("prefix") String prefix, Pageable pageable);
//    List<Student> findByNameStartingWithIgnoreCase2(@Param("prefix") String prefix, Pageable pageable);


}
