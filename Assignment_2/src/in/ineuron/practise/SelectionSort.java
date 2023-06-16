package in.ineuron.practise;

public class SelectionSort {
	public static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last =arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
	}
	
	public static int getMaxIndex(int[]arr, int first, int last) {
		int max=first;
		for (int i = first; i < last; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
		
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp =arr[first];
		arr[first]=arr[second];
		arr[second]= temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,6,3,7,4};
		System.out.println("given array ");
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("sorted array ");
		selection(arr);
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
