class sum 
{
	public static void main(String args[]) 
	{
		
		// sum of N numbers = 100
		// 1+ 2 + 3 + ... 100
		// n (n+1)/2 == 100 * 101 /2 = 101 * 50 = 5050
		
		int sum = 0;
		
		for (int i = 1; i<= 10000; i= i +1) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}