import java.util.*;
class Rectangle {
private double length;
private double width;
public Rectangle(double length, double width) {
  this.length = length;
  this.width = width;
}
public void setLength(double length) {
  this.length = length;
}
public void setWidth(double width) {
  this.width = width;
}
public double getArea() {
  return length * width;
}
public double getPerimeter() {
  return 2 * (length + width);
}
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Vaibhav Upreti \n");
  System.out.print("Enter the length of the rectangle: ");
  double length = scanner.nextDouble();
  System.out.print("Enter the width of the rectangle: ");
  double width = scanner.nextDouble();

  Rectangle rectangle = new Rectangle(length, width);
  System.out.println("The area of the rectangle is: " + rectangle.getArea());
  System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
  }
}
