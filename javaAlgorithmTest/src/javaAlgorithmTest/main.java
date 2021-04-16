package javaAlgorithmTest;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3,60,35,2,45,320,5}; 
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        Sort sort = new Sort();
        arr = sort.bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
	}

}
