class largest {
	public static void main(String args[]) {
		
		
		
	int n1 = 10;
	
	int n2 = 30;
	
	int n3 = 5;
	
	int n=3;
	int arr[]=new int[n];
	
	arr[0]=n1;
	arr[1]=n2;
	arr[2]=n3;
	
	int highest = 0;
	
	for (int i =0 ; i < n; i++) {
		
		if(arr[i] > highest ) {
			highest = arr[i];
		}
		
	}
	
	System.out.print(highest);
	
	}
}