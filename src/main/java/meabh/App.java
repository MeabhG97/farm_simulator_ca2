package meabh;

public class App {
    public static void main( String[] args ){
        MilkTank t =  new MilkTank();
        Shed s = new Shed(t);
        if(s.getMilkingMachine() == null){
            System.out.println("null");
        }  
    } 
}
