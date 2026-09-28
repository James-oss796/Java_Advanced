package generics.inheritance;
import java.util.List;
public class AnimalUtils {
    public static void makeAnimalSounds(List<? extends Animal> animals){
        for(Animal animal : animals){
            animal.makeSound();
        }

    }

    public static void addDogs(List<? super Dog> animals){
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Dog());
    }

    public static void main(String[] args){
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        AnimalUtils.makeAnimalSounds(dogs);
        AnimalUtils.makeAnimalSounds(cats);
    }
}
