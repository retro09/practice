import java.util.Scanner;
class SumNonPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		nprimesum(arr);
	}
	static void nprimesum(int arr[]){
		int sum =0;
		for(int i=0; i<arr.length; i++){
			int j =2;
			while(j< arr[i]){
				if(arr[i]<=2) {
					break;
				}
				else if (arr[i]%j==0){
					sum = sum + arr[i];
					break;
				}
				else {
					j++;
				}
			}
		}
		System.out.println("Sum:"+sum);
	}
}