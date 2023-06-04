package org.arrayExcercise;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] ar = {99,56,79,90,99,90,57,56};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			int n = ar[i];
			int count =1;
			for (int j = i+1; j < ar.length; j++) {
				if (n ==ar[j]) {
					ar[j]=-1;
					count++;
				}
			}
			if (ar[i] != -1) {
				System.out.println(n + " count is --> "+count);
			}
			
		}
	}

}
