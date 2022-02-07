package com.dxc.javaconcepts.inheritance;


class Employee extends Student
{


    int employeeID;
    int salary;
    String department;


    public Employee(int age, String name, int id, String subject, String teacher, String sslcScore, int employeeID, int salary, String department) {
        super(age, name, id, subject, teacher, sslcScore);
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", teacher='" + teacher + '\'' +
                ", sslcScore='" + sslcScore + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
