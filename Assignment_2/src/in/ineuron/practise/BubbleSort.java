package in.ineuron.practise;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[5];
		
		System.out.println("Enter numbers in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("This is array given by you");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("This is sorted array");
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
