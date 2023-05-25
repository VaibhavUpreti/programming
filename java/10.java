import java.util.*;
class BubbleSort {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.print("Vaibhav Upreti \n");
 System.out.print("Enter the number of elements: ");
 int n = scanner.nextInt();
 int[] numbers = new int[n];
 for (int i = 0; i < n; i++) {
 System.out.print("Enter number " + (i+1) + ": ");
 numbers[i] = scanner.nextInt();
 }
 for (int i = 0; i < n-1; i++) {
 for (int j = 0; j < n-i-1; j++) {
 if (numbers[j] > numbers[j+1]) {
 // Swap the two elements
 int temp = numbers[j];
 numbers[j] = numbers[j+1];
 numbers[j+1] = temp;
 }
 }
 }
 System.out.print("Sorted array: ");
 for (int number : numbers) {
 System.out.print(number + " ");
 }
 System.out.println();
 }
}

