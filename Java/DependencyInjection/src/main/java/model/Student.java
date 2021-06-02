package model;

import java.util.Objects;

public class Student {
    public String name = "";
    public float mark = 0.0f;

    public Student() {
    }

    public Student(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString(){
        return "Student " + "name: " + name + " mark: " + mark;
    }
}
