package org.artofcoding.dockerize.service;

import org.artofcoding.dockerize.valueobjects.PersonVO;

public interface PersonService {

    public PersonVO addPerson(String name,String address);
    public PersonVO updatePerson(Integer personId,String name,String address);
    public void removePerson(Integer personId);
    public PersonVO fetchPersonDetails(Integer personId);

}
