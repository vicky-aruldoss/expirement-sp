package com.example.sptutorial.model;

public class Student {
    public int ID;
    public String Name;
    public int Age;
    public String Gender;
    public String Email;
    public String Phone;
    public String Address;

    public Student(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Student name is " + Name + ", ID is " + ID;
    }
}
