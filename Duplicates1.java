package week1.day2;

public class Duplicates1 {

	public static void main(String[] args) {
int[] arr = {12,15,16,12,10,5,12,5,17};
		
		int len =arr.length;
		int count;
		
		for (int i=0; i < len; i++) {
			count=0; //set count = 0 for next iteration i.e for new i value
			for(int j=i+1; j<len; j++) {
				if (arr[i]==arr[j]) {
					count=count+1; //no.of Occurrence of duplicate
				}
			}
			
			if(count>0) {
				System.out.println(arr[i] + "-" +count +"time(s)");
				
		}

	}


	}

}
