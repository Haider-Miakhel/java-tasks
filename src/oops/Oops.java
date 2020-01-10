
package oops;

/**
 *
 * @author Toufeeq Fazli
 */
public class Oops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal a;
        
        // creating dog instance
        System.out.println("Dog Instance");
        a = new Dog("White");
        a.eat();
        a.walk();
        
        Dog d = new Dog("Black");
        d.bark();
        d.getColor();
        
        
        
        // creating cat instance
        System.out.println("Cat Instance");
        a = new Cat();
        a.eat();
        a.walk();
        
        Cat c = new Cat();
        c.eat("Bread");
    }
    
    
}
