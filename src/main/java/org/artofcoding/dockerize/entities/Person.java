package org.artofcoding.dockerize.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Component("Person")
@Scope("prototype")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID",columnDefinition = "INT(11) DEFAULT 0")
    private int personId=0;


    @Column(name = "PERSON_NAME")
    private String personName="";


    @Column(name = "PERSON_ADDRESS")
    private String personAddress="";



    public Person(String personName,String personAddress){
        this.personName=personName;
        this.personAddress=personAddress;
    }

    public Person(){

    }


    @Version
    private int version=0;


    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }



}
