package org.artofcoding.dockerize.repo;

import org.artofcoding.dockerize.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {


}
