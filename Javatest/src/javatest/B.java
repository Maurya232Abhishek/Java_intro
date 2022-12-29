
package javatest;

public class B extends A{
    static {
        System.out.println("B Static block 1");
    }
    static {
        System.out.println("B Static block 1");
    }
    {
        System.out.println("B Object block 1");
        
    }
    
}
