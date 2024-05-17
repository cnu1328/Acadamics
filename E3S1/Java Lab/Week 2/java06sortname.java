import java.util.*;
import java.lang.*;



public class java06sortname {
    public static void main(String[] args) {
        int n;
        Scanner scannning = new Scanner(System.in);
        n = scannning.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scannning.next();
        }
        for (int i = 0; i < names.length-1; i++) {
            for (int j = 0;j<n-i-1;j++) {
                if(names[j+1].compareTo(names[j])<0){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
        }
         
    }
    

}
