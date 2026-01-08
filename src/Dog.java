public class Dog extends Animal {

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
}
