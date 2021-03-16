package search;

/**
 * Search class is used to search an element(integer) in the integer array
 * It has two methods - Linear for Linearly search an element
 * Binary Search - For Binary Search an element 
 * Recursion is used in these Searches
 * @author yash.porwal_metacube
 *
 */
public class Search {
	
	static int index = 0;
	static int flag = 0;
	
	/**
	 * Constructor used in the Linear method for Linearly Searching an element 
	 */
	Search() {
		index = 0;
		flag = 0;
	}
	
	/**
	 * Linear method is linearly searching an element in the integer array
	 * Using Recursion
	 * @param arr input integer array from which an element is searched
	 * @param element integer which is being searched 
	 * @return the index of that element in an array otherwise return -1.
	 */
	public int Linear(int arr[], int element){

			if(index >= arr.length){
				System.out.println("Element not found");
				System.exit(0);
			}
			else if(arr[index] == element) {
				flag =1;
			}
			else {
				index++;
				Linear(arr, element);
		}
		if(flag  == 1){
			return index;
		}
		else {
			return -1;
		}
	}
	
	/**
	 * Binary Search is used to Search an element from a sorted array
	 * Array must be of sorted i.e., element is sorted in ascending order 
	 * Using Recursion
	 * @param arr sorted input integer array from which an element is searched
	 * @param element which is to be searched in a sorted array
	 * @param size of the array
	 * @param firstElementIndex the index of the first element of an sorted array
	 * @return the index of the element in the array which is to be searched
	 * 		   otherwise -1.
	 */
	public static int Binary(int arr[], int element, int size, int firstElementIndex){
		
		if(size >= 0) {
			int mid = (firstElementIndex + (size))/2  ; 
			if(arr[mid] == element) {
				return mid;
			}
			else if(arr[mid] > element) {
				return Binary(arr, element, mid-1, firstElementIndex);
			}
			else{
				return Binary(arr, element, size, mid+1);
			}
		}	
		return -1;
	}
}
