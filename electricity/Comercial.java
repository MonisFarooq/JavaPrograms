
package electricity;

public class Comercial implements Billcalculator{
    private String cName;
    private int cID;
    private int unitsConsumed;

    public Comercial( String cName,int cID, int unitsConsumed){
        this.cName=cName;
        this.cID=cID;
        this.unitsConsumed= unitsConsumed;
    }
  

    public double calculateBill() {
        return unitsConsumed * 9;
    }

    public void displayBill(){


   
    System.out.println("------Commercial Consumer------");
    System.out.println("Consumer name: "+ cName);
    System.out.println("Consumer ID: "+ cID);
    System.out.println("Units Consumed: "+ unitsConsumed);
    System.out.println("Rate per unit: Rs 9");
    System.out.println("Total Bill: Rs " +calculateBill());

    }

    
}
