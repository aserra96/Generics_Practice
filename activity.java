package Generics;

public class activity<E> {

	public static void main(String[] args) {
		Integer[] integers = {4 , 8, 3, 8, 13};
		String[] strings = {"Carrot", "Dog", "Whistle", "WHAT", "Friends"};
		Double[] doubles = {4.0, 9.0, 6.0, 2.0, 1.0};
		//print arrays
		System.out.println("before sort");
		printArray(doubles);
		printArray(strings);
		printArray(integers);
		//sorting
		sort(doubles);
		sort(strings);
		sort(integers);
		//printing sort
		System.out.println("after sort");
		printList(doubles);
		printList(strings);
		printList(integers);
	}
	
	public static <E> void printArray(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;
		
		for (int i = 0; i < list.length - 1; i++) {
			currentMin = list[i];
			currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
