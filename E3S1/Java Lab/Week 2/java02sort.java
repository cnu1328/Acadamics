
import java.security.cert.PKIXBuilderParameters;
import java.util.Scanner;

public class java02sort {
    public static void merge(int nums[], int low, int mid, int high) {
        int i = low, k = low, j = mid + 1;
        int[] b = new int[high + 1];
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                b[k] = nums[i];
                ++i;
                ++k;
            } else {
                b[k] = nums[j];
                ++j;
                ++k;
            }
        }
        while (i <= mid) {
            b[k] = nums[i];
            ++i;
            ++k;
        }
        while (j <= high) {
            b[k] = nums[j];
            ++j;
            ++k;
        }
        for (int z = low; z <= high; z++)
            nums[z] = b[z];

    }

    public static void mergeSort(int nums[], int low, int high) {
        if (low <high) {
            // System.out.println("Entered into merge sort" + low + " " + high);
            int mid = (low + high) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);

            merge(nums, low, mid, high);
        }

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
        mergeSort(nums, 0, size - 1);

        for (int i = 0; i < size; i++) {

            // nums[i]=scanning.nextInt();
            System.out.print(nums[i] + " ");

        }

    }
}
