interface vehicle{
    String getColor(); int getNumber();
    int getConsumption();
    }
    class twoWheeler_04 implements vehicle{ String name;
    String color; int number;
    int consumption;
    twoWheeler_04(String name, String color, int number,int consumption){
    this.name=name; this.color=color; this.number=number; this.consumption=consumption;
    }
    @Override
    public int getConsumption() { return consumption;
    }
    @Override
    public int getNumber() {
    return number;
    }
    @Override
    public String getColor() {
    return color;
    }
    }
    class FourWheeler_04 implements vehicle{ String name;
    String color; int number;
    int consumption;
    FourWheeler_04(String name, String color, int number,int consumption){
     
    this.name=name; this.color=color; this.number=number; this.consumption=consumption;
    }
    @Override
    public int getConsumption() { return consumption;
    }
    @Override
    public int getNumber() { return number;
    }
    @Override
    public String getColor() { return color;
    }
    }
    public class java04 {
    public static void main(String[] args) {
    twoWheeler_04 t1= new twoWheeler_04("Yamaha","Green",1718,15); 
    System.out.println("Vehicle name: "+t1.name); System.out.println("Fuel consumed by "+t1.name+":"+t1.getConsumption());
    System.out.println("color of "+t1.name+": "+t1.getColor());
    
    FourWheeler_04 f1= new FourWheeler_04("Toyota","white",1718,25);
    System.out.println("Vehicle name: "+f1.name); 
    System.out.println("Fuel consumed by "+f1.name+":"+f1.getConsumption());
    System.out.println("color of "+f1.name+": "+f1.getColor());
    }
    }
    