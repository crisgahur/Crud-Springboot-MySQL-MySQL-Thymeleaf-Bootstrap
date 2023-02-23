package com.newAgenda.web.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Cristian Gallego
 */
@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "borndate", nullable = false)
    private String borndate;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "number", nullable = false, unique = true)
    private String number;
    
    public Person() {
    }

    public Person(Long id, String name, String borndate, String email, String number) {
        super();
        this.id = id;
        this.name = name;
        this.borndate = borndate;
        this.email = email;
        this.number = number;
    }

    public Person(String name, String borndate, String email, String number) {
        super();
        this.name = name;
        this.borndate = borndate;
        this.email = email;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", borndate=" + borndate + ", email=" + email + ", number=" + number + '}';
    }

}
