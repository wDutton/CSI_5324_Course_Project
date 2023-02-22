package com.baylor.timeline.demo.data;
import org.springframework.data.repository.CrudRepository;

import com.baylor.timeline.demo.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
    
}
