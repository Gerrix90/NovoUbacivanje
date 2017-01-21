package com.example.gerrix.versioncontrol;

/**
 * Created by Gerrix on 21.1.2017..
 */

public class ViewController {

    private Student student;
    private ViewClass viewClass;

    public ViewController(Student student, ViewClass viewClass) {
        this.student = student;
        this.viewClass = viewClass;
    }

    public void display(){
        this.viewClass.displey(this.student.getName());
    }
}
