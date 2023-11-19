package com.dentalClinicBack.dentalClinic.entity;

public class Dentist {

private Long id;
private String licenceNumber;
private String name;
private String lastName;


    /*Builders (an empty one, a full one and another without id*/


    public Dentist() {
    }

    public Dentist(String licenceNumber, String name, String lastName) {
        this.licenceNumber = licenceNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public Dentist(Long id, String licenceNumber, String name, String lastName) {
        this.id = id;
        this.licenceNumber = licenceNumber;
        this.name = name;
        this.lastName = lastName;
    }

    /*Getter & Setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
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

    /*To String*/

    @Override
    public String toString() {
        return "Dentist{" +
                "id=" + id +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
