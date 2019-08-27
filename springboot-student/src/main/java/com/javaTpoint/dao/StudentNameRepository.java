package com.javaTpoint.dao;

import org.springframework.data.repository.CrudRepository;

import com.javaTpoint.model.StudentName;

public interface StudentNameRepository extends CrudRepository<StudentName, String>
{
StudentName findById(int id);
void deleteById(int id);

}
