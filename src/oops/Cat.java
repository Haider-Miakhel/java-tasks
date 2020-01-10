
package oops;

/**
 *
 * @author Toufeeq Fazli
 */
public class Cat extends Animal {
    
    @Override
    public void eat() {
        System.out.println("I can eat veg as well as meat");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
    
    // this is known as method overloading which also depicts the polymorphism
    public void eat(String food) {
        System.out.println("I am can eat "+food);
    }
    
}
