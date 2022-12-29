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
public class Circle extends Figure {
    private double radius;
    Circle(double r){
        this.radius=r;
    }

    @Override
    double area() {
        return 3.14*radius*radius;
    }
    @Override
    double perimeter()
    {
        return 2*3.14*radius;
    }
    
    
    
    
}
