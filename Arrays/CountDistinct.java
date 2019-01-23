import java.util.Scanner;
import java.util.Arrays;
class CountDistinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		countDistinct(arr); 
	}
	static void countDistinct(int arr[]){
		int count = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			while (i < arr.length - 1 &&  
                    arr[i] == arr[i + 1]) 
            { 
                i++; 
            } 
            count++; 
		}
		System.out.println("No. of distinct elements:"+ count);
	}
}