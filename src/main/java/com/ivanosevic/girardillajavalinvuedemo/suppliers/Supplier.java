package com.ivanosevic.girardillajavalinvuedemo.suppliers;

import java.time.Instant;
import java.util.Objects;

public class Supplier {
    private Integer id;
    private String name;
    private String lastname;
    private String fullname;
    private String email;
    private String country;
    private Integer deliveryTime;
    private Instant joinedAt;

    public Supplier(Integer id, String name, String lastname, String country, Integer deliveryTime) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.country = country;
        this.deliveryTime = deliveryTime;
    }

    public Supplier(Integer id, String name, String lastname, String fullname, String email, String country, Integer deliveryTime, Instant joinedAt) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.fullname = fullname;
        this.email = email;
        this.country = country;
        this.deliveryTime = deliveryTime;
        this.joinedAt = joinedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(id, supplier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
