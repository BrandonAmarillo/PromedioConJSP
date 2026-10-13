package org.mycompany.models;

public class Student {
    private String name;
    private int note1;
    private int note2;
    private int note3;
    private double average;
    private String status;

    public Student() {

    }

    public Student(String name, int note1, int note2, int note3,
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

    public int getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public int getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public int getNote3() {
        return note3;
    }

    public void setNote3(int note3) {
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
}
