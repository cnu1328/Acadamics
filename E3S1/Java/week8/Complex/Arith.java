package complex;

public class Arith {
    public int rp, ip;
    
    public Arith() {
         rp = 0;
         ip = 0;
    }
    
    public Arith(int rp, int ip) {
    	this.rp = rp;
    	this.ip = ip;
    }
    
    public void add(Arith a1, Arith a2) {
    	rp = a1.rp + a2.rp;
    	ip = a1.ip + a2.ip;
    }
    
    public void sub(Arith a1, Arith a2) {
    	rp = a1.rp - a2.rp;
    	ip = a1.ip - a2.ip;
    }
    
    public int rpValue() {
   	return rp;	
    }
    
    public int ipValue() {
    	return ip;
    }
   
   
}
