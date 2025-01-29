class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Inheritance_hierarchical {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        Cat myCat=new Cat();
        myCat.eat();
        myCat.meow();
    }
}


