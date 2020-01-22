package datastructures.Structures;

import org.junit.Before;
import org.junit.Test;
import utilities.Animal;
import utilities.AnimalShelter;
import utilities.Cat;
import utilities.Dog;

import static org.junit.Assert.*;


public class AnimalShelterTest {
    AnimalShelter animalShelter;

    @Before
    public void start() {
        animalShelter = new AnimalShelter();
    }

    @Test
    public void testDequeueDog() {
        Dog bingo = new Dog("Bingo");
        animalShelter.enqueue(bingo);
        assertEquals("This should remove one item from the queue", bingo, animalShelter.dequeue(Dog.class));
    }
    @Test
    public void testDequeueFirstDog() {
        Dog jumpy = new Dog("jumpy");
        animalShelter.enqueue(jumpy);
        assertEquals("This should remove the first dog item in the queue", jumpy, animalShelter.dequeueDogs());
    }
    @Test
    public void testDequeueFirstCat() {
        Cat roto = new Cat("roto");
        animalShelter.enqueue(roto);
        assertEquals("This should remove the first cat item in the queue", roto, animalShelter.dequeueCats());
    }


    @Test
    public void testEnqueue() {
        Dog bingo = new Dog("Bingo");
        animalShelter.enqueue(bingo);
        assertEquals("Checking to see if the added value is equal to the Dog class properties", false, animalShelter.equals(Dog.class));
        System.out.println("animalShelter.equals(Dog.class) = " + animalShelter.equals(Dog.class));
    }

    @Test public  void testDequeueCat(){
        Cat sneaky = new Cat("sneaky");
        animalShelter.enqueue(sneaky);
        assertEquals("This should remove one cat from the queue", sneaky, animalShelter.dequeue(Cat.class));
    }
    @Test public void testWrongPref(){
        Dog halo = new Dog("halo");
        animalShelter.enqueue(halo);
        assertNull("This should return null for the wrong pref", animalShelter.dequeue("kitty"));
        System.out.println("animalShelter.dequeue(\"kitty\") = " + animalShelter.dequeue("kitty"));
    }

    @Test public void testNotDogOrCat(){
        Animal lion = new Animal("lion");
        animalShelter.enqueue(lion);
        assertEquals("This should remove whatever animal is in the queue", lion, animalShelter.dequeueAnimal());
    }
//    @Test public void testSize(){
//        Dog bingo = new Dog("Bingo");
//        animalShelter.enqueue(bingo);
//        assertEquals("This should remove one item from the queue", bingo, animalShelter.);
//    }
}
