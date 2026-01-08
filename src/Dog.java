public class Dog extends Animal implements Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        makeSound("Woof woof !");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is munching a lot of " + food);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball !");
    }
}
