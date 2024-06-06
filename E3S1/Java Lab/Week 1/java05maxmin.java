import java.util.Scanner;

import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class java05maxmin {
    public static void main(String[] args) {
        System.out.println("Enter Five Numbers:");
        Scanner scanning = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
        
            nums[i]=scanning.nextInt();

        }
        int mx=nums[0],mn=nums[0];
        for(int i=1;i<5;i++)
        {
            if(mx<nums[i])
            mx=nums[i];
            if(mn>nums[i])
            mn=nums[i];
        }
        System.out.println("Max and Min are: "+mx+" "+mn);

    }
}
