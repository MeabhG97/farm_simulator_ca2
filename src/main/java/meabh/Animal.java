package meabh;

public abstract class Animal implements Comparable<Animal> {
    private int id;
    private static int idCount = 0;

    public Animal(){
        this.id = idCount;
        idCount++;
    }

    public int getAnimalId(){
        return id;
    }

    abstract double getValue();

    @Override
    public String toString() {
        return this.getClass().getName() + " [id=" + id + "]";
    }

    @Override
    public int compareTo(Animal otherAnimal){
        return Double.compare(this.getValue(), otherAnimal.getValue());
    }
    
}
