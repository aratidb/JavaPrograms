class MoveZeroesOptimize {
	public static void main(String args[]) {
		int numbers[] = {2,5,0,0,4,-1,0};
		int index = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] != 0) {
				numbers[index] = numbers[i];
				index++;
			}					
		}
		//for(int i=index;i<numbers.length;i++) 
		While(index < numbers.length)
			numbers[i++] = 0;
			

		System.out.println("Array after Move zeroes to end");
		for(int i=0;i<numbers.length;i++)
			System.out.print(numbers[i]+" ");
	}
}