public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void makeSound(String sound) {
        System.out.println(name + " says: " + sound);
    }

    public static void sleep() {
        System.out.println("The animal is sleeping...");
    }
}
