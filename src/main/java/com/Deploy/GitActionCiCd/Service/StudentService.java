package com.Deploy.GitActionCiCd.Service;

import com.Deploy.GitActionCiCd.Dao.Studentdao;
import com.Deploy.GitActionCiCd.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentInter{
   @Autowired
    Studentdao studentdao;
    @Override
    public Student savedata(Student student) {
        return studentdao.save(student);
    }
}
