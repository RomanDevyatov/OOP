package com.NetCracker;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getID(){
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String getName(){
        return this.firstName+" "+this.lastName+", annualSalary="+this.salary*12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percent){
        return (int) (this.salary*(1.0+(double)(percent/100)));
    }
    public String toString(){
        return "Employee[id="+Integer.toString(this.id)+", name="+this.firstName + " " + this.lastName + ", salary="+ this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        return result;
    }
}
