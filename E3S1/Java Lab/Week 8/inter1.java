package interfaces;
interface inter11{
	void sum(double a,double b);
	 void avg(double a,double b);
}
public class inter1 implements inter11{
	public void sum(double a,double b){
		System.out.println("Sum of two numbers="+(a+b));
	}
	public void avg(double a,double b){
		System.out.println("avg of two numbers="+((a+b)/2));
	}
}

