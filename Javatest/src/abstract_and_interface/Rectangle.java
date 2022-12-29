/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_and_interface;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends Figure implements I_sides{
    private double length,breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length*breadth; //To change body of generated methods, choose Tools | Templates.
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", breadth=" + breadth + '}';
    }

    @Override
    double perimeter() {
       return 2*(length + breadth);
    }

    @Override
    public int number_of_sides() {
      return 4;
        
               }
    
    public double diagonal(){
        return Math.sqrt(length*length+breadth*breadth);
    }
}

