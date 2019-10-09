package alex.petclinic.petclinicstudy.model;

import javax.persistence.Entity;

@Entity
public class Person {

    private String firstName;

    private String lastName;

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }
}
