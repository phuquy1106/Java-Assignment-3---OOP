package Model;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumScore;

    public Student() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    public void inputStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Student Information:");
        System.out.println("ID: ");
        this.id = sc.next().trim();
        System.out.println("Name: ");
        this.name = sc.next().trim();
        System.out.println("Age: ");
        this.age = sc.nextInt();
        System.out.println("Course: ");
        this.course = sc.next();
        System.out.println("Address: ");
        this.address = sc.next();
        System.out.println("Medium score: ");
        this.mediumScore = sc.nextFloat();
    }

    public void printStudent(){
        String st = "Student: "+
                " id: "+ this.id+
                " name: "+this.name+
                " age: "+this.age+
                " course: "+this.course+
                " address: "+this.address+
                " medium score: "+this.mediumScore;
        System.out.println(st);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }


}
