package com.jurbin.graphqldemo.Resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.jurbin.graphqldemo.Entity.Person;
import com.jurbin.graphqldemo.Repository.PersonRepository;

import java.util.Optional;

public class QueryResolver implements GraphQLQueryResolver {
    private PersonRepository personRepository;

    public QueryResolver(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public Person getAPerson(Integer id) {
        Optional<Person> optionalPerson = personRepository.findById(id);

        if (optionalPerson.isPresent()) {
            return optionalPerson.get();
        }

        return null;
    }
}
