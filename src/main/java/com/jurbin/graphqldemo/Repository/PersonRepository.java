package com.jurbin.graphqldemo.Repository;

import com.jurbin.graphqldemo.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
