package com.dentalClinicBack.dentalClinic.entity;
import java.time.LocalDate;


public class Patient {

    private Long id;
    private String name;
    private String lastName;
    private String dni;
    private LocalDate dateOfEntry;
    private Address address;

    /*Builders (an empty one, a full one and another without id*/

    public Patient() {
    }

    public Patient(String name, String lastName, String dni, LocalDate dateOfEntry, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.dateOfEntry = dateOfEntry;
        this.address = address;
    }

    public Patient(Long id, String name, String lastName, String dni, LocalDate dateOfEntry, Address address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.dateOfEntry = dateOfEntry;
        this.address = address;
    }

    /*Getter & Setters*/

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /*To String*/

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", dateOfEntry=" + dateOfEntry +
                ", address=" + address +
                '}';
    }
}






