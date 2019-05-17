package com.jurbin.graphqldemo.Resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.jurbin.graphqldemo.Entity.Person;
import com.jurbin.graphqldemo.Repository.PersonRepository;

public class MutationResolver implements GraphQLMutationResolver {
    private PersonRepository personRepository;

    public MutationResolver(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createOrUpdatePerson(Person person) {
        return personRepository.save(person);
    }

    public String deleteAPerson(Person person){
        personRepository.delete(person);
        return "Person: " + person + " deleted";
    }
}
