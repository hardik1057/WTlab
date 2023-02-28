class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    //@Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class lab7_q9 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        myAnimal.makeSound(); 
        myDog.makeSound(); 
    }
}
