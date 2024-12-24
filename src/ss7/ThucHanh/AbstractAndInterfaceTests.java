package ss7.ThucHanh;


import ss7.ThucHanh.animal.Animal;
import ss7.ThucHanh.animal.Chicken;
import ss7.ThucHanh.animal.Tiger;
import ss7.ThucHanh.edible.Edible;
import ss7.ThucHanh.fruit.Fruit;
import ss7.ThucHanh.fruit.Orange;
import ss7.ThucHanh.fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}