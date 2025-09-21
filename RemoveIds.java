class RemoveIds {
	public static void main(String args[]) {
		String emailIds[] = {"abc@gmail.com","a111@gmail.com","a111@gmail.com","xyz@gmail.com","idk@gmail.com","abc@gmail.com"};
		String uniqueIds[] = new String[emailIds.length];
		int count = 0;
		for(int i=0;i<emailIds.length;i++) {
			boolean isDuplicate = false;
			for(int j=0;j<count;j++) {
				if(emailIds[i].equals(uniqueIds[j])) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				uniqueIds[count] = emailIds[i];
				count++;
			}
		}
		System.out.println("Unique Ids: ");
		for(int i=0;i<count;i++)
			System.out.println(uniqueIds[i]);
		
	}
		//loop1-emailIds 0-arraylenght 
			//boolean is duplicate - false
		//loop2-uniqueIds 0-uniquecount
			//isduplicate = true
		//if(!isduplicate)
		//addto uniqueIds - this is inside loop1
}