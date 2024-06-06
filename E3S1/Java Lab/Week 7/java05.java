interface Fare{
    float getAmount();
    }
     
    class bus implements Fare{ float perKm=1.5f; float distance; bus(float distance){
    this.distance=distance;
    }
    @Override
    public float getAmount() { return perKm*distance;
    }
    }
    class train implements Fare{ float perKm=1.0f;
    float distance; train(float distance){
    this.distance=distance;
    }
    @Override
    public float getAmount() { return perKm*distance;
    }
    }
    public class java05 {
    public static void main(String[] args) { bus b1= new bus(85);
    System.out.println("Fare amount by Bus: "+b1.getAmount()); train t1= new train(85);
    System.out.println("Fare amount by Train: "+t1.getAmount());
    }
    }
    