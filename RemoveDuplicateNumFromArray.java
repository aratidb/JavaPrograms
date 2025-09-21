class RemoveDuplicateNumFromArray {
   public static void main(String args[]) {
	int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int count = 0;
       int unique[] = new int[nums.length];
       for(int i = 0;i<nums.length;i++) {
            boolean flag = false;
            for(int j = 0;j<count;j++) {
                if(nums[i] == unique[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                unique[count] = nums[i];
                count++;
            }
        }
        System.out.println("Count: "+count);
	System.out.println("Unique Ids: ");
		for(int i=0;i<count;i++)
			System.out.println(unique[i]);
		
    }
}




          int count = 0;
                int unique[] = new int[nums.length];
                unique[0] = nums[0];
                for(int i = 0;i<nums.length;i++) {
                    boolean flag = false;
                    for(int j = i;j<nums.length;j++) {
                        if(nums[i] == unique[j]) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        unique[count] = nums[i];
                        count++;
                    }
                }
                for(int i = 0; i<count; i++)
                    nums[i] = unique[i];
                return count;
            }
        }
  