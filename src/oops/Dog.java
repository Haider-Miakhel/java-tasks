
package oops;

/**
 *
 * @author Toufeeq Fazli
 */
public class Dog extends Animal{

    private String color;
    
    // overrinding methods depict the polymorphism

    public Dog(String color) {
        this.color = color;
    }    
    
    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
    
    public void bark() {
        System.out.println("I can bark");
    }

    
    // the getters and setters depict the encapsulation because the object can only access the poperty through these methods instead of accessing dirctly variables.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
