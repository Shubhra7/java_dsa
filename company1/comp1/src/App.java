import com.exm.HelloBu;
import com.exm.Appp;

abstract class Animal {
    public Animal(){
        System.out.println("Animal calls...!");
    }
    abstract void sound();
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat's mew");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks..! ");
    }
}

interface Book{
    void Author();
    void Name();
}

class Science implements Book{
    public void Author(){
        System.out.println("Science book1");
    }
    public void Name(){
        System.out.println("Hc Verma");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HelloBu.hehe();
        Appp.debjit();
        Animal obj = new Cat();
        obj.sound();
        Animal obj1 = new Dog();
        obj1.sound();

        Science sc = new Science();
        sc.Author();
    }
}
