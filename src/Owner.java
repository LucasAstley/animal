import java.util.ArrayList;

public class Owner {

    private String name;
    private ArrayList<Animal> animals;

    public Owner(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
