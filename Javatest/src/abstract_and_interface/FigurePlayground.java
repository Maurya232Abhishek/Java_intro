package abstract_and_interface;

/*
-> object cannot be created from Abstract class
-> if any fucntion is abstract then it's class must be abstract
-> abstract class may have abstract and non abstract fucntion
->abstract function is forced to be overriden in extended class
 */
public class FigurePlayground {

    public static void main(String[] args) {

        Figure f = new Rectangle(9, 7);
        f=new Circle(7);
        Rectangle r = new Rectangle(9, 7);
        I_sides i = new Rectangle(9, 7);
        System.out.println(f instanceof Object);
        System.out.println(f.getClass().getSuperclass().getSuperclass().getSuperclass());
    }

}
