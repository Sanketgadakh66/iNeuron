package in.ineuron.practise;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {9,4,1,8,5,7};
		int n = arr.length;
		System.out.println("Given Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		quickSort(arr,0,n-1);
		System.out.println("sorted array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int pidx= partition( arr,l,h);
			
			quickSort(arr, l, pidx-1);
			quickSort(arr, pidx+1, h);
		}
	}

	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		
		for (int j = l; j < h; j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i]= pivot;
		arr[h] = temp;
		return i;
	}
}
