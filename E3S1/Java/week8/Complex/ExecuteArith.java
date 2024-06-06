import complex.Arith;


public class ExecuteArith {
    public static void main(String[] args) {
    	Arith a1 = new Arith(10, 5);
    	Arith a2 = new Arith(3, 6);
    	
    	Arith a3 = new Arith();
    	
    	a3.add(a1, a2);
    	System.out.println("Added Value : " + a3.rpValue() + " + " + a3.ipValue() + "i");
    	
    	a3.sub(a1, a2); 
    	
    	System.out.println("Added Value : " + a3.rpValue() + " + (" + a3.ipValue() + "i)");
    }
}
