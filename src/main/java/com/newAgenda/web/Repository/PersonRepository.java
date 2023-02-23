package com.newAgenda.web.Repository;

import com.newAgenda.web.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author usuario
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
