package com.hezhu.hibernate;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Alien {
    private int id;
    private String name;
    private String color;

}
