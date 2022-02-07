package com.dxc.javaconcepts.inheritance;

public class Student extends PersonA
{
    int id;
    String subject;
    String teacher;
    String sslcScore;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", teacher='" + teacher + '\'' +
                ", sslcScore='" + sslcScore + '\'' +
                '}';
    }





    public Student(int age, String name, int id, String subject, String teacher, String sslcScore) {
        super(age, name);
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        this.sslcScore = sslcScore;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSslcScore() {
        return sslcScore;
    }

    public void setSslcScore(String sslcScore) {
        this.sslcScore = sslcScore;
    }
}