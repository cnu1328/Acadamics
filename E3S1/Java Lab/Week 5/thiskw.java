class thiskw
{ 
Week5(int x,int y,int z) 
{ 
this(x,y); 
System.out.println("Value of z:"+z); 
}
Week5(int x,int y) 
{ 
this(x); 
System.out.println("Value of y:"+y); 
}
Week5(int x) 
{ 
System.out.println("Value of z:"+x); 
} 
}
class Demo 
{ 
public static void main(String aa[]) 
{ 
Week5 e=new Week5(5,10,15); 
} 
}