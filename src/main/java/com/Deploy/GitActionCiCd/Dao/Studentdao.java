package com.Deploy.GitActionCiCd.Dao;

import com.Deploy.GitActionCiCd.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentdao extends JpaRepository<Student, Integer> {
}
