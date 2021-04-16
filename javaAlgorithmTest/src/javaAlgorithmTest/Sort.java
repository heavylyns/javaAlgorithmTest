package javaAlgorithmTest;

public class Sort {
		
	public int[] bubbleSort(int[] params) {
		int n = params.length;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(params[j-1] > params[j]) {
					temp = params[j-1];
					params[j-1] = params[j];
					params[j] = temp;
				}
			}
		}
		return params;
	}
}