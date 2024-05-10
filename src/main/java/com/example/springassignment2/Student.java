package com.example.springassignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("${student.id}")
    private int id;

    @Value("${student.name}")
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Address getAdd() {
        return add;
    }
}
