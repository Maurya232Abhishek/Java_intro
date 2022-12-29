/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author LENOVO
 */
public class Employee extends Person {

    String post;
    int salary;

    public Employee(String post, int salary, String name, String address, String mobile, int age) {
        super(name, address, mobile, age);
        this.post = post;
        this.salary = salary;
    }

    public int getSalary() {
        return (int) Math.round(salary * 110 / 100.0);
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee{" + "post=" + post + ", salary=" + salary + '}';
    }
    public static void main(String args[])
    {
        Employee emp = new Employee("SDE",12345,"ABCD","230455445","10455434",45);
        System.out.println(emp);
        
        
    }

}
