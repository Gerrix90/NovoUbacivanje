package com.example.gerrix.versioncontrol;

/**
 * Created by Gerrix on 21.1.2017..
 */

public class Student {
    private String name;
    private String prezime;

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
