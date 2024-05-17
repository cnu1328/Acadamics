import java.util.Scanner; 
class Account 
{ 
//instance variables 
String Accountant_name; 
int Account_number; 
double ammount,withdraw,deposit; 
Account(String s,double a,int i,double w,double d) 
{ 
Accountant_name=s; 
ammount=a; 
Account_number=i; 
withdraw=w; 
deposit=d; 
} 
void debit(double w) 
 { 
if(ammount>w) 
{ 
ammount=(ammount-w); 
System.out.println("Total ammount after withdrawed "+withdraw+" 
is:"+ammount); 
double M=(ammount-withdraw)+deposit; 
System.out.println("Current Balance in Account:"+M); 
} 
else 
{ 
System.out.println("Insufficent accunt balance"); 
System.out.println("Enter amount below:"+ammount); 
} 
} 
void credit(double d) 
{ 
ammount=(ammount+d); 
System.out.println("Accountant Name:"+Accountant_name); 
System.out.println("Account Number:"+Account_number); 
System.out.println("Total ammount after deposited "+deposit+" 
is:"+ammount); 
} 
} 
class Bank 
{ 
public static void main(String args[]) 
{ 
Scanner s=new Scanner(System.in); 
System.out.println("Enter accountant name:"); 
String name=s.nextLine(); 
System.out.println("Enter Account Number:"); 
int i=s.nextInt(); 
System.out.println("Enter amount"); 
double a=s.nextDouble(); 
System.out.println("Enter withdraw ammount"); 
double w=s.nextDouble(); 
System.out.println("Enter deposit ammount"); 
double d=s.nextDouble(); 
System.out.println("Account Details:"); 
Account Ac=new Account(name,a,i,w,d); 
Ac.credit(d); 
Ac.debit(w); 
} 
}