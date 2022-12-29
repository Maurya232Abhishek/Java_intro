package javatest;
//static block run first (only when if there is main :after jdk 1.8 )
//object block run will execute only when constructor is called
//
public class A {
    

    static {
        System.out.println("A Static Block 1");
        
    }

    static {
        System.out.println("A Static Block 2");
    }

    {
        System.out.println("A Object Block 1");
    }

    {
        System.out.println("A Object Block 2");
    }

    public A() {

        System.out.println("A Zero parameter constructor ");

    }

    public A(int n) {

        System.out.println("A One parameter constructor ");

    }

    public static void main(String args[]) {
        System.out.println("Main");
        //new A();
        new A(9);
    }

}

