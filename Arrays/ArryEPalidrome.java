import java.util.Scanner;
import java.util.*;
class ArryEPalidrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		palidrome(arr,n);
	}
	static void palidrome(int arr[],int n){
		int count =0;
		for(int i=0; i<n;i++){
			String str = "";
			str = str+ arr[i];
			String str2 = "";
			for(int j = str.length()-1; j>=0 ; j--){
				str2 = str2 + str.charAt(j);
			}
			if(str.equals(str2)){
				count++;
			}
		}
		System.out.println(count);
		if(count == n){
			System.out.println("Array is palindrome");
		}
		else {
			System.out.println("Array is not palindrome");	
		}
    }
}