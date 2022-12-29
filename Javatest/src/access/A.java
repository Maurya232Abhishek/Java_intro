/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author LENOVO
 */
public class A {
    void func1()
    {
        System.out.println("By defualt ");
    }
    public void func2()
    {
        System.out.println("This is public fucntion");
        
    }
    private void func3()
    {
        System.out.println("This is private function");
    }
    protected void func4()
    {
        System.out.println("This is a protected function");
    }
    public static void main(String args[])
    {
        A a= new A();
        a.func1();
        a.func2();
        a.func3();
        a.func4();
    }
    
}
