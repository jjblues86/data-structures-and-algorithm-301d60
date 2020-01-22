package utilities;

import java.util.LinkedList;

public class AnimalShelter<Potato> {
//    Queue<Dog> dog;
//    Queue<Cat> cat;
//    LinkedList<Dog> dogs = new LinkedList<>();
//    LinkedList<Cat> cats = new LinkedList<>();

    LinkedList<Dog> dogs;
    LinkedList<Cat> cats;

    public AnimalShelter() {
        this.dogs = new LinkedList<>();
        this.cats = new LinkedList<>();
    }

    public void enqueue(Animal animal){
      if(animal.getClass() == Dog.class){
          dogs.add((Dog) animal);
      } else {
          cats.add((Cat) animal);
      }
    }

    public Object dequeue(Class<Cat> pref){
        if(pref.equals(Dog.class)){
            return pref.cast(dogs.remove());
        } else if(pref.equals(Cat.class)){
            return pref.cast(cats.remove());
        }
        return null;
    }

    //this checks to see which animal has been in the shelter/queue the longest
    public Animal dequeueAnimal(){
        if(dogs.size() == 0){
            return dequeueCats();
        } else if(cats.size() == 0){
            return dequeueDogs();
        }
        return null;
    }

    //this should remove the first dog in the queue
    public Dog dequeueDogs(){
        return dogs.poll();
    }

    //this should remove the first cat in the queue
    public Cat dequeueCats(){
        return cats.poll();
    }

    public Object dequeue(String kitty) {
        return null;
    }
}
