class SmlPrfSqr {
	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, 7 };
		int n = arr.length;
		System.out.println(minPerfectSquare(arr,n));
	}
	static int minPerfectSquare(int arr[],int n){
    int minPerfectSq; 
    int lcm = findLcm(arr, n); 
    minPerfectSq = (int)lcm; 
    int cnt = 0; 
    while (lcm > 1 && lcm % 2 == 0) { 
        cnt++; 
        lcm /= 2; 
    } 
    if (cnt % 2 != 0) 
        minPerfectSq *= 2; 
    int i = 3; 
    while (lcm > 1) { 
        cnt = 0; 
        while (lcm % i == 0) { 
            cnt++; 
            lcm /= i; 
        }  
        if (cnt % 2 != 0) {
            minPerfectSq *= i; 
        }
        i += 2; 
    } 
    return minPerfectSq; 

	}
	static int findLcm(int arr[],int n){
		if (n < 1) {
        	return 0; 
		}
    	int lcm = arr[0];

    	for (int i = 1; i < n; i++) {
        	lcm = (lcm * arr[i]) / gcd(lcm, arr[i]);  
    	}
        
        return lcm;
	}
	static int gcd(int a, int b) { 
    	if (b == 0){
    		return a;
    	} 
    	else{
        	return gcd(b, a % b); 
    	}
} 
}