package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// Intersections are 2,4,7

				int [] arr1 = {3,2,11,4,6,7};
				int [] arr2 = {1,2,8,4,9,7};

				int arr1Len = arr1.length;
				int arr2Len = arr2.length;

				for (int i=0; i<arr1Len; i++) {
					for (int j=0; j<arr2Len; j++) {
						if (arr1[i]==arr2[j]) {
							System.out.println("Intersection value : " + arr1[i]);
							break; // comes out of j loop, when value matches in arr2 at least once.				
							}
						}
					}

	}

}
