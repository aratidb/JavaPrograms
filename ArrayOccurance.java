class ArrayOccurance {
	public static void main(String  args[]) {
		
		String arr[] = {"login","logout","login"};
		boolean arrchk[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arrchk[i])
				continue;
			int count = 0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arrchk[j] = true;
				}
			}
			System.out.println(arr[i]+" occure "+count+" times");
		} 
	}
}