package com.jurbin.graphqldemo;

import com.jurbin.graphqldemo.Repository.PersonRepository;
import com.jurbin.graphqldemo.Resolver.MutationResolver;
import com.jurbin.graphqldemo.Resolver.QueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GraphqlDemoApplication {
    PersonRepository personRepository;

    @Autowired
    GraphqlDemoApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(GraphqlDemoApplication.class, args);
    }

    @Bean
    public QueryResolver query(PersonRepository personRepository) {
        return new QueryResolver(personRepository);
    }

    @Bean
    public MutationResolver mutation(PersonRepository personRepository) {
        return new MutationResolver(personRepository);
    }
}
