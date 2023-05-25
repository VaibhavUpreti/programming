import java.util.*;
import java.util.Scanner;
class MatrixAddition {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Vaibhav Upreti \n");
 System.out.print("Enter the number of rows and columns of the matrices: ");
 int rows = scanner.nextInt();
 int cols = scanner.nextInt();
 int[][] matrix1 = new int[rows][cols];
 int[][] matrix2 = new int[rows][cols];
 System.out.println("Enter the elements of matrix 1:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.print("Enter element (" + (i+1) + "," + (j+1) + "): ");
 matrix1[i][j] = scanner.nextInt();}
 }
 System.out.println("Enter the elements of matrix 2:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.print("Enter element (" + (i+1) + "," + (j+1) + "): ");
 matrix2[i][j] = scanner.nextInt();
 }
 }
 int[][] result = new int[rows][cols];
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 result[i][j] = matrix1[i][j] + matrix2[i][j];
 }
 }
 System.out.println("The sum of the matrices is:");
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.print(result[i][j] + " ");}
 System.out.println(); } }}

