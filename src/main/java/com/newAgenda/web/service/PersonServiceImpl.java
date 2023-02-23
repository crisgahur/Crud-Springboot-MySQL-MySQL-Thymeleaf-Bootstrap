package com.newAgenda.web.service;

import com.newAgenda.web.Entity.Person;
import com.newAgenda.web.Repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristian Gallego
 */
@Service
public class PersonServiceImpl implements PersonService {
    
    @Autowired
    private PersonRepository repository;
    
    @Override
    public List<Person> listAllPeople() {
        return repository.findAll();
    }
    
    @Override
    public Person savePerson(Person person) {
        return repository.save(person);
    }
    
    @Override
    public Person getPersonById(Long id) {
        return repository.findById(id).get();
    }
    
    @Override
    public Person updatePerson(Person person) {
        return repository.save(person);
    }
    
    @Override
    public void deletePerson(Long id) {
        repository.deleteById(id);
    }
    
}
