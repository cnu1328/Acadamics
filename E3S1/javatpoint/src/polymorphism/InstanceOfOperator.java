package polymorphism;

class Animals {
	
}

class Dogss extends Animals {
	
	static void method(Animals a) {
		
		//Downcasting with instanceof
		if(a instanceof Dogss) {
			Dogss d = (Dogss) a;
			
			System.out.println("Downcasting is perofrmed " + d);
		}
		
		//Downcasting without instanceof
		
		Dogss d = (Dogss)a;
		
		System.out.println("Ok  DownCasting is performed " + d);
	}
	
}

interface Printable {
	
}

class Action implements Printable {
	void a() {
		System.out.println("A method");
	}
}

class Block implements Printable {
	void b() {
		System.out.println("B Method");
	}
}

class Call {
	
	void invoke(Printable p) { //UpCasting
		
		if(p instanceof Action) {
			Action a = (Action)p;
			a.a();
		}
		
		if(p instanceof Block) {
			Block b = (Block)p;
			b.b();
		}
		
	}
}

public class InstanceOfOperator {
	
//	The java instanceof (also type Comparsion Operator) operator is used to test whether 
//	the object is an instance of the specified type (class or subclass or interface).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceOfOperator s = new InstanceOfOperator();
		
		System.out.println(s instanceof InstanceOfOperator); //true
		
		Dogss d = new Dogss();
		Dogss d1 = null;
		
		System.out.println(d instanceof Dogss); //true;
		
		System.out.println(d instanceof Animals); //true;
		
		System.out.println(d1 instanceof Dogss); //false
		
		
		//If the reference variable of Child class refers to the
		//object of Parent class, it is known as downcasting.
		
//		Dogss d2 = new Animals(); //compilation Error
		
//		Dogss d2 = (Dogss)new Animals(); //ClassCastException
		
		
		Animals a = new Dogss(); //Upcasting
		
		Dogss.method(a);
		
		//Animals a1 = new Animals();
		
		//Dogss.method(a1); //ClassCastException
		
		
		Printable p = new Block();
		
		Call c = new Call();
		
		c.invoke(p);
		
		p = new Action();
		
		c.invoke(p);
	}

}
