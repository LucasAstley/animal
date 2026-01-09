public class Cat extends Animal implements Pet, Wild {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a yarn ball !");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting a mouse !");
    }
}
