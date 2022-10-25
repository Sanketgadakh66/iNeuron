package com.ineuron.assignment;

public class Assignment_1_Q1 {

	public static void main(String[] args) {
		int n =10;
		
		for(int i = 0; i < n; i++) {
			//Letter I
			for(int j = 0; j < n; j++){
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter N
			for(int j = 0; j < n; j++){
				if(j==0 || i==j || j==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter E
			for(int j = 0; j < n; j++){
				if(j==0 || i==0 && j<=n-1 || i==(n-1)/2 && j<=n-1 || i==n-1 && j<=n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter U
			for(int j = 0; j < n; j++){
				if(j==0 && i<n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i<n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter R
			for(int j = 0; j < n; j++){
				if(j==0 || i==0 && j<n-1 || j==n-1 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 || i==j && 					i>(n-1)/2 && j>(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter O
			for(int j = 0; j < n; j++){
				if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 && i<n-1 || i==n-1 && j>0 && 					j<n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter N
			for(int j = 0; j < n; j++){
				if(j==0 || i==j || j==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print("   ");
			}
			
			//Letter S
			for(int j = 0; j < n; j++){
				if(i==0 && j>0 || j==0 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j>0 && j<n-1 || j==n-1 && i>(n-1)/2 					&& i<n-1 || i==n-1 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter A
			for(int j = 0; j < n; j++){
				if(j==0 && i!=0 || j==n-1 && i!=0 || i==0 && j!=0 && j!=n-1 || i==(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter N
			for(int j = 0; j < n; j++){
				if(j==0 || i==j || j==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter K
			for(int j = 0; j < n; j++){
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			
			//Letter E
			for(int j = 0; j < n; j++){
				if(j==0 || i==0 && j<=n-1 || i==(n-1)/2 && j<=n-1 || i==n-1 && j<=n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//space
			for(int j = 0; j<n/4; j++) {
				System.out.print(" ");
			}
			
			//Letter T
			for(int j = 0; j < n; j++){
				if(j==(n-1)/2 || i==0 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

}
