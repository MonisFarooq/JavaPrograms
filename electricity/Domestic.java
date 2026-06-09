package electricity;

public class Domestic implements Billcalculator{
    private String cName;
    private int cID;
    private int unitsConsumed;

    public Domestic(String cName, int cID, int unitsConsumed){
        this.cName=cName;
        this.cID=cID;
        this.unitsConsumed=unitsConsumed;
    }

   
    public double calculateBill(){
        return unitsConsumed*6;
    }

    public void displayBill(){
        System.out.println("----Domestic Consumer Bill-----");
        System.out.println("consumer name: " +cName);
        System.out.println("Consumer Id: " +cID);
        System.out.println("Units Consumed: " +unitsConsumed);
        System.out.println("Rate per Unit : Rs 6");
        System.out.println("Total Bill: " +calculateBill());
    }
}
