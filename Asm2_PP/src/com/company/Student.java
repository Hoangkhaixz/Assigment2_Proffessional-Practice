package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String ID;

    public Student(String firstName, String lastName, int age, String ID)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getID()
    {
        return ID;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setFullName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return "ID: " + ID + ", Name: " +  firstName + "" + lastName + ", Age: " + age;
    }
}
