public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Bridget", 4);
        System.out.println(cow.getName());
        cow.moo();

        Animal.sleep();
    }
}
