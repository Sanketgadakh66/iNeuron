package in.ineuron.practise;

public class SubsetOfArray {

	public static Boolean isSubset(int[] arr1,int[]arr2) {
		int j=0;
		for (int i = 0; i < arr2.length; i++) {
			for (j = 0; j < arr1.length; j++) 
				if (arr2[i]==arr1[j]) 
					break;
				
			if (j==arr1.length) 
				return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5,6};
		int[]arr2= {1,2,3,4};
		if (isSubset(arr1, arr2)) {
			System.out.println("Array2 is subset of Array1");
		}
		else {
			System.out.println("Array2 is not subset of Array1");
		}
	}
}
