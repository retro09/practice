import java.util.Scanner;
import java.util.*;
class MRUApps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter most recently app used:");
		int k = sc.nextInt();
		if(k >= arr.length){
			int count = k - arr.length;
			arrangeMRU(arr,count);
		}
		else{
			arrangeMRU(arr,k);
		}
	}
	static void arrangeMRU(int arr[], int k){
		List<Integer> lst = new ArrayList<Integer>();
		int ptr = arr[k];
		lst.add(ptr);

		// System.out.println(lst);

		for(int i = 0; i<arr.length; i++){
			if(arr[i] != ptr){
				lst.add(arr[i]);
			}
		}
		System.out.println(lst);

	}
}