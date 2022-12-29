/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author LENOVO
 */
public class Overloading {

    static int add(int a, int b) {
        System.out.println("Frist_add");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Second_add");
        return a + b + c;
    }

    static int add(int a, float b) {
        System.out.println(b);
        System.out.println("float overloadedd");
        return (int) (a + b);
    }
    //Note only changing return type will show error 
    static double add(double a, double b)
    {
        System.out.println("Overloaded with different arguements (also different return type) ");
        return a+b;
    }
    

    public static void main(String args[]) {
        System.out.println("Hello World");
        System.out.println(add(1, 2));
        System.out.println(add(2, 4,3));
        System.out.println(add(2,44.992345f));
        System.out.println(add(2.3,4.34));
    }

}
