// Extend the above TwoWheeler class with methods getType() and getName() which gives the information 
// about the type and the name of the company.Create sub-classes Geared and NonGeared with method average() 
// to print the average of a geared and non-geared two wheeler
class Vehicle{
    String vNumber;
    String vInsurance;
    String color;
    double consumption;
    Vehicle(String vNUmber,String vInsurance,String color,double consumption)
    {
        this.vNumber=vNUmber;
        this.vInsurance=vInsurance;
        this.color=color;
        this.consumption=consumption;
    }
    double getConsumption()
    {
        return this.consumption;
    }
    void displayConsumption()
    {
        System.out.println("The Consumption of the vehicle is"+this.consumption);
    }
    
    }
    
    
    class TwoWheeler extends Vehicle{
        double maintenance;
        double average;
        TwoWheeler(String vNUmber,String vInsurance,String color,double consumption,double maintenance,double average)
    {
        super(vNUmber,vInsurance,color,consumption);
        this.average=average;
        this.maintenance=maintenance;
    }
    void getMaintaince()
    {
        System.out.println("The Maintaince of Twowheeler is:"+this.maintenance);
    }
    void getAverage()
    {
        System.out.println("The Average of Twowheeler is:"+this.average);
    
    
    }
    }
    class Geared extends TwoWheeler{
        Geared(String vNUmber,String vInsurance,String color,double consumption,double maintenance,double average)
    {
        super(vNUmber,vInsurance,color,consumption,maintenance,average);
       
    }
    void getAverage()
    {
        System.out.println("The Average of  Geared Twowheeler is:"+this.average);
    
    
    }
    
    }
    class NonGeared extends TwoWheeler{
        NonGeared(String vNUmber,String vInsurance,String color,double consumption,double maintenance,double average)
    {
        super(vNUmber,vInsurance,color,consumption,maintenance,average);
       
    }
    void getAverage()
    {
        System.out.println("The Average of  Non Geared Twowheeler is:"+this.average);
    
    
    }
    
    }
public class java06 {
    public static void main(String[] args) {
        
    }
}
