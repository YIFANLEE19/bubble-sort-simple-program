/*
 * Two steps
 * 1. Compare two items 
 * 2. Swap two items
 * 
 * Start from right, compare two number
 * first round = n-1 
 * second round = n-2 
 * ......
 * The formula = (n-1)+(n-2)+(n-3)+...+1 = n*(n-1)/2 = n^2/2 
 * O(n^2)
 */
public class bubbleSort {
	
	void bs(int arr[]) {
		//get n length
		int n = arr.length;
		//nested for loop
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap if A larger than B
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}//end swap method
			}
			System.out.print((i+1)+ " " + " ");
			printArr(arr);
		}
	}//end bubble sort method
	
	static void printArr(int arr[]) {
		//foreach loop
		for(int array:arr)
			System.out.print(array + " ");
			System.out.println();
	}//end print Array
	
	public static void main(String[] args) {
		bubbleSort ob = new bubbleSort();
		int arr[] = {12,76,32,89,67,21,77,100,28,77,88};
		System.out.print(0+ " "+" ");
		printArr(arr);
		ob.bs(arr);
	}//end main method
}
