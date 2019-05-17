package com.jurbin.graphqldemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable = false)
    Integer id;

    @Column(name="firstName", nullable = false)
    String firstName;

    @Column(name="lastName", nullable = false)
    String lastName;

    @Column(name="age", nullable = false)
    Integer age;

    @Column(name="weight", nullable = false)
    Double weight;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
