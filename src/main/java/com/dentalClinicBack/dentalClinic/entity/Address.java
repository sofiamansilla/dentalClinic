package com.dentalClinicBack.dentalClinic.entity;

import javax.persistence.*;

@Entity
@Table(name = "DOMICILIOS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50)
    private String street;
    @Column(length = 50)
    private int number;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String province;



    /*Builders (an empty one, a full one and another without id*/

    public Address() {
    }

    public Address(String street, int number, String city, String province) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.province = province;
    }

    public Address(Long id, String street, int number, String city, String province) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
        this.province = province;
    }


    /*Getter & Setters*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    /*To String*/

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
