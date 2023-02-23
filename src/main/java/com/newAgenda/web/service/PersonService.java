package com.newAgenda.web.service;

import com.newAgenda.web.Entity.Person;
import java.util.List;

/**
 *
 * @author Cristian Gallego
 */
public interface PersonService {
    
    public List<Person> listAllPeople();
            
    public Person savePerson(Person person);
    
    public Person getPersonById(Long id);
    
    public Person updatePerson(Person person);
    
    public void deletePerson(Long id);
    
}
