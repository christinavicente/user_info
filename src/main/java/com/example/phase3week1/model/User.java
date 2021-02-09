package com.example.phase3week1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "user")
@Entity
public class User implements Serializable {
    @Column(name="entry")
    @GeneratedValue
    int ident;
    @Column(name="id")
    String  id;
    @Column(name="username")
    String name;

    public User(String name, String id){
        this.name=name;
        this.id=id;
    }

    public int getIdent(){return ident;}
    public String getName(){return name;}

    public String getID(){return id;}

    public void setId(String id){
        this.id=id;

    }
    public void setName(String name){
        this.name= name;
    }
}
