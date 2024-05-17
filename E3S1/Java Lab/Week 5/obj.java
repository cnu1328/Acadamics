class obj
{ 
int age=23; 
void change_age(Week5 c1) 
{ 
age=age+10;// cahnges will be done in the local variable only 
System.out.println("age in local:"+age); 
} 
public static void main(String aa []) 
{ 
Week5 c1=new Week5(); 
System.out.println("age before change:"+c1.age); 
c1.change_age(c1);// passinf object through called method 
System.out.println("age after change"+c1.age); 
} 
}