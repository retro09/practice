class CntStrEndPtrn {
	public static void main(String[] args) {
		String arr[] ={"Geeks", "for", "Geeks", "if" , "Geeks"};
		String str = "ks";
		countString(arr,str); 
	}
	static void countString(String arr[],String str){
		int count=0;
		String newstr = "";
		for(int i=0;i<arr.length;i++){
			newstr = arr[i].toString();
			String newstr2 = newstr.substring(newstr.length()-2);
			if(newstr2.equals(str)){
				System.out.println(newstr2);
				count= count+1;
				i++;
			}
			else{
					i++;
				}
		} 
		System.out.println(count);	
	}
}