package com.javatpoint.springbootexample3;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Pojo, Integer>
{

}
