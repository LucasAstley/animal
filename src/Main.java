public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Bridget", 4);
        System.out.println(cow.getName());
        cow.moo();

        Animal.sleep();

        cow.eat();

        Dog dog = new Dog("Seymour", 2);
        dog.bark();
        dog.eat("bones");
        dog.eat("steak", 3);

        // Si on essaye d'accéder directement à l'attribut name, on obtient une erreur (car l'attribut est private) :
        //System.out.println(dog.name);
        // Saperlipopette ! Donc à la place on utilise un getter public :
        System.out.println(dog.getName());

        // En revanche, on peut accéder directement à l'attribut age (car l'attribut est public) :
        System.out.println(dog.age);

        dog.setColor("brown");

        // De la même façon, on peut accéder directement à l'attribut color
        // (car l'attribut est protected et que Main est dans le même package que Animal) :
        System.out.println(dog.color);

        // On peut également appliquer ces règles d'accès aux méthodes :
        //dog.secretMethod(); // Erreur : la méthode est private
    }
}
