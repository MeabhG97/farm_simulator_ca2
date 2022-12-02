package meabh;

public abstract class Animal {
    private int id;
    private static int idCount = 0;

    public Animal(){
        this.id = idCount;
        idCount++;
    }

    public int getAnimalId(){
        return id;
    }
}
