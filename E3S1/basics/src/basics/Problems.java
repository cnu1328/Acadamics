package basics;
import java.util.Arrays;

public class Problems {
	public static void main(String[] args) {
		//Sort 
		
		int[] num = {-99, -12, 45, 12, 0, 23, 1, 5, 9, 7};
		
		System.out.print("Before Sort : ");
		for(int i : num) {
			System.out.print(i + ", ");
		}
		
		Arrays.sort(num );
		System.out.println();
		System.out.print("After Sort : ");
		
		for(int i : num) {
			System.out.print(i + ", ");
		}
	}
}
