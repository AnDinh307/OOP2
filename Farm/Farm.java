import java.util.List;
import java.util.ArrayList;


public class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void Add(Animal animal) {
        animals.add(animal);
    }

    public void printCanSwimandCanWalk() {
        List<Animal> animalCanSwinAndWalk = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal.canSwim() || animal.canWalk() ) {
                animalCanSwinAndWalk.add(animal);
            }
        }
        for(Animal animal : animalCanSwinAndWalk) {
            System.out.println(animal.name + " can swim: " + animal.canSwim() + ", can walk: " + animal.canWalk());
        }
    }

public static void main(String[] args) {
    Farm farm = new Farm();
    farm.Add(new Pig("Pig"));
    farm.Add(new Duck("Duck"));
    farm.Add(new Fish("Fish"));
    farm. printCanSwimandCanWalk();
    }
}