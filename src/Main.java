public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Bridget", 4);
        System.out.println(cow.getName());
        cow.moo();

        Animal.sleep();

        cow.eat("grass");

        Dog dog = new Dog("Seymour", 2);
        dog.bark();
        dog.eat("bones");
    }
}
