package org.artofcoding.dockerize.controller;

import org.artofcoding.dockerize.service.PersonService;
import org.artofcoding.dockerize.valueobjects.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;

    @RequestMapping(value ="employee.json",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonVO addPerson(@RequestParam(name = "name") String name, @RequestParam(name = "address") String address){
        return personService.addPerson(name,address);
    }

    @RequestMapping(value ="employee/{id}.json",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonVO updatePerson(@PathVariable("id")Integer id, @RequestParam(name = "name") String name, @RequestParam(name = "address") String address){
        return personService.updatePerson(id,name,address);
    }

    @RequestMapping(value ="employee/{id}.json",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void  deletePerson(@PathVariable("id")Integer id){
        personService.removePerson(id);
    }


    @RequestMapping(value ="employee/{id}.json",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonVO  fetchPersonDetails(@PathVariable("id")Integer id) {
        return personService.fetchPersonDetails(id);
    }







}
