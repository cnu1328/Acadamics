abstract class employee{
    abstract void getAmount();
    }
    class weeklyEmployed extends employee{ float weekPay=15000;
    int no_of_weeks; weeklyEmployed(int no_of_weeks){
    this.no_of_weeks= no_of_weeks;
    }
    @Override
    void getAmount() {
    System.out.println("Total Pay "+weekPay*no_of_weeks);
    }
     
    }
    class hourlyEmployed extends employee{ float hourPay= 100;
    int no_of_hours; hourlyEmployed(int no_of_hours){
    this.no_of_hours= no_of_hours;
    }
    @Override
    void getAmount() {
    System.out.println("Total Pay "+hourPay*no_of_hours);
    }
    }
    public class java02 { public static void main(String[] args) {
    weeklyEmployed w1= new weeklyEmployed(5); w1.getAmount();
    hourlyEmployed h1= new hourlyEmployed(30); h1.getAmount();
    }
    }
    