package com.newAgenda.web;

import com.newAgenda.web.Entity.Person;
import com.newAgenda.web.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringbootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringbootApplication.class, args);
    }

    @Autowired
    private PersonRepository repository;

    @Override
    public void run(String... args) throws Exception {
       
        /*Person person3 = new Person("amiiii", "12/123/123", "cris.gahur@hotmail.com", "3147146565");
        repository.save(person3);*/


    }

}
