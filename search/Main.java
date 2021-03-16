package search;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Search linearObj = new Search();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total no of elements: ");
		int maxElement = sc.nextInt();
		int arr[] = new int[maxElement];
		System.out.println("Enter the elements: ");
		for(int i=0; i<maxElement; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the element you want to search: ");
		int element = sc.nextInt();
		System.out.println("1. For Linear Search \n2. Binary Search");
		int choice = sc.nextInt();
		if(choice == 1){
			System.out.println(linearObj.Linear(arr, element));
		}
		else if(choice == 2){
			System.out.println(Search.Binary(arr, element, maxElement, 0));
		}
		else {
			System.out.println("Enter correct choice");
		}
	}

}
