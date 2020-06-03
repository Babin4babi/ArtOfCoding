package org.artofcoding.dockerize.valueobjects;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PersonVO implements Serializable {

    private Integer personId=0;
    private String personName="";
    private String personAddress="";
    private Integer version=0;


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
