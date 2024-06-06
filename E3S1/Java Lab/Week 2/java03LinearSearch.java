
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class java03LinearSearch {
    public static int linearSearch(int nums[],int size, int key) {
        // int x=-1;
        for(int i=0;i<size;i++)
        {
            if(nums[i]==key)
            return i;
        }
        return -1;

    }
    public static int  binarySearch(int nums[],int low,int high,int key)

    {
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(key==nums[mid])
                return mid;
                if(nums[mid]>key)
                return binarySearch(nums,low,mid-1,key);
                else
                return binarySearch(nums, mid+1, high, key);

            }
            return -1;
        
    }

    public static void main(String[] args) {
        System.out.print("Enter List Size:");

        Scanner scanning = new Scanner(System.in);

        int size = scanning.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter List Elements");

        for (int i = 0; i < size; i++) {

            nums[i] = scanning.nextInt();

        }
        System.out.print("Enter Key to Search: ");
        int key = scanning.nextInt();
        if(linearSearch(nums, size, key)!=-1)
        System.out.println(key+"  is Found at Index " + linearSearch(nums,size, key));
        else
        System.out.println(key+" is Not Found");
        if(binarySearch(nums, 0, size-1, key)!=-1)
        System.out.println(key+"  is Found at Index " + binarySearch(nums, 0, size-1, key));
        else
        System.out.println(key+" is Not Found");

    }

}
