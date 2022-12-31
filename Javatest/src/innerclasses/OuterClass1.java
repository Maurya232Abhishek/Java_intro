/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author Abhi
 */
public class OuterClass1 {
    public static class StaticInner
    {
        private int hello=767657;
    }
    public static void main(String args[])
    {
        OuterClass1.StaticInner si= new OuterClass1.StaticInner();
        System.out.println(si.hello);
    }
            
    
}
