import remote.RemoteControls;

import java.util.Scanner;

class OperateRemote {
    public static void main(String[] args) {
        RemoteControls rc = new RemoteControls();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nRemote Buttons : \n1 - switch On \n 2 - switch Off \n 3 - Start Sports Channel \n 4 - NGC Channel \n 5 - Discovery Channel \n6 - Start movies Channel\n");
        
        while(true) {
            int inputValue = sc.nextInt();
            boolean flag = false;
            
            switch(inputValue) {
            	case 1: 
            		System.out.println(rc.switchOn());
            		System.out.println(rc.spc());
            		break;
            		
            	case 2:
            		if(rc.checkSwichedOn) {
            		    System.out.println(rc.switchOff());
            		    flag = true;
            		    
            		} else {
            		     System.out.println("Remote Alert : Plase, Switch on the TV First!!!");
            		}
            		break;
               case 3:
            		if(rc.checkSwichedOn) {
            		    System.out.println(rc.spc());
            		   
            		} else {
            		     System.out.println("Remote Alert : Please, Switch on the TV First");
            		}
            		break;
            		
               case 4:
            		if(rc.checkSwichedOn) {
            		    System.out.println(rc.ngc());
            		   
            		} else {
            		     System.out.println("Remote Alert : Please, Switch on the TV First");
            		}
            		break;
            	
            	case 5:
            		if(rc.checkSwichedOn) {
            		    System.out.println(rc.dc());
            		   
            		} else {
            		     System.out.println("Remote Alert : Please, Switch on the TV First");
            		}
            		break;
            		
            	 case 6:
            		if(rc.checkSwichedOn) {
            		    System.out.println(rc.smc());
            		   
            		} else {
            		     System.out.println("Remote Alert : Please, Switch on the TV First");
            		}
            		break;
            		
            	 default:
            	 	System.out.println("Remote Alert : Invalid Input");
            		
            }
            
            if(flag) break;
        }
        
        
        
    }

}
