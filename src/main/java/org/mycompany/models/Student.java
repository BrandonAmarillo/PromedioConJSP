package org.mycompany.models;

public class Student {
    private String name;
    private double note1;
    private double note2;
    private double note3;
    private double average;
    private String status;

    public Student() {

    }

    public Student(String name, double note1, double note2, double note3,
            double average, String status) {

        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.average = average;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override 
    public String toString() {
        return "Student{" + "name=" + name + ", note1=" + note1 + ", note2=" + note2 + ", note3=" + note3 + ", average=" + average + ", status=" + status + '}';
    }
}
