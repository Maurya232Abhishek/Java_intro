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
public class Manager extends Employee {

    public Manager(String post, int salary, String name, String address, String mobile, int age) {
        super(post, salary, name, address, mobile, age);
    }
//    @Override
    public int getsalary() {
        return (int)(salary*(115/100.0));
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString()+ '}';
    }
   
    public static void main(String args[])
    {
        Manager m= new Manager("Manager",10000,"Abcd","Xyz","829734232",34);
        System.out.println(m);
        System.out.println(m.getSalary());
        
        
    }
    
   
    
}
