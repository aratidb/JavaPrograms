class MoveZeroes {
	public static void main(String args[]) {
		int numbers[] = {2,5,0,0,4,-1,0};
		int temp = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				if(numbers[i] == 0) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}					
			}
		}	
		System.out.println("Array after Move zeroes to end");
		for(int i=0;i<numbers.length;i++)
			System.out.print(numbers[i]+" ");
	}
}