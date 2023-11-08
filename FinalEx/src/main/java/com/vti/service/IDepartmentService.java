package com.vti.service;

import com.vti.entity.Department;
import org.springframework.data.domain.Page;

public interface IDepartmentService {
    Page<Department> getAllDepartment();

    void createDepartment();
    void updateDepartment();

    void deleteDepartmentById(int id);


}
