package com.shuting.redis.entity;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Student implements Serializable {
    private String name;
    private int age;
    private double score;
    private Date birthday;
}
