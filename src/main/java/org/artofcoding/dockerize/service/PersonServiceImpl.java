package org.artofcoding.dockerize.service;

import org.artofcoding.dockerize.entities.Person;
import org.artofcoding.dockerize.repo.PersonRepository;
import org.artofcoding.dockerize.valueobjects.PersonVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    @Override
    @Transactional
    public PersonVO addPerson(String name, String address){
        Person person =personRepository.save(new Person(name,address));
        PersonVO personVO=new PersonVO();
        BeanUtils.copyProperties(person,personVO);
        return personVO;
    }

    @Override
    @Transactional
    public PersonVO updatePerson(Integer personId,String name,String address){
        Person person = personRepository.findById(personId).get();
        person.setPersonName(name);
        person.setPersonAddress(address);

        person=personRepository.save(person);
        PersonVO personVO=new PersonVO();
        BeanUtils.copyProperties(person,personVO);
        return personVO;
    }

    @Override
    @Transactional
    public void removePerson(Integer personId){
        personRepository.deleteById(personId);
    }

    @Override
    @Transactional
    public PersonVO fetchPersonDetails(Integer personId){
        Person person =personRepository.findById(personId).get();
        PersonVO personVO=new PersonVO();
        BeanUtils.copyProperties(person,personVO);
        return personVO;
    }
}
