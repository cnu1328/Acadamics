
// Write an application to create a super class Vehicle with information vehicle number,insurance 
// number,color and methods getConsumption() displayConsumption(). Derive the sub-classes TwoWheeler and 
// FourWheeler with method maintenance() and average() to print the maintenance And average of Vehicle
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
class FourWheeler extends Vehicle{
    double maintenance;
    double average;
    FourWheeler(String vNUmber,String vInsurance,String color,double consumption,double maintenance,double average)
{
    super(vNUmber,vInsurance,color,consumption);
    this.average=average;
    this.maintenance=maintenance;
}
void getMaintaince()
{
    System.out.println("The Maintaince of Fourwheeler Vehicle is:"+this.maintenance);
}
void getAverage()
{
    System.out.println("The Average of Fourwheeler  vechicle is:"+this.average);


}
}

public class java05 {
    public static void main(String[] args) {
        
    }
}
