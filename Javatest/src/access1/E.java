/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access1;

import access.A;
import access.C;

/**
 *
 * @author LENOVO
 */
public class E extends A {
    public static void main(String args[])
    {
        A a= new A();
        //a.func1();
        a.func2();
        //a.func4();
        C c= new C();
        System.out.println("C hello");
        //c.func1();
        c.func2();
        //c.func4();
        E e= new E();
        e.func2();
        e.func4();
                
    }
    
}
