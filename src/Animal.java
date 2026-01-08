public class Animal {

    private String name;
    public int age;
    protected String color;

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

    public void eat() {
        System.out.println(name + " is eating food");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void eat(String food, int quantity) {
        System.out.println(name + " is eating " + quantity + " units of " + food);
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void secretMethod() {
        System.out.println("This is a secret method");
    }
}
