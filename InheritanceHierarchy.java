import java.util.Scanner;

abstract class Shape {
  abstract void calculateArea();
}

class TwoDim extends Shape {
  double area;
  void calculateArea() {
    System.out.println("Calculating area for 2D shape...");
  }
}

class ThreeDim extends Shape {
  double area;
  void calculateArea() {
    System.out.println("Calculating area for 3D shape...");
  }
}

class Square extends TwoDim {
  double side;
  void calculateArea() {
    super.calculateArea();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the side length of the square: ");
    side = scanner.nextDouble();
    area = side * side;
    System.out.println("Area of square: " + area);
  }
}

class Triangle extends TwoDim {
  double base;
  double height;
  void calculateArea() {
    super.calculateArea();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the base length of the triangle: ");
    base = scanner.nextDouble();
    System.out.print("Enter the height of the triangle: ");
    height = scanner.nextDouble();
    area = (base * height) / 2;
    System.out.println("Area of triangle: " + area);
  }
}

class Sphere extends ThreeDim {
  double radius;
  void calculateArea() {
    super.calculateArea();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius of the sphere: ");
    radius = scanner.nextDouble();
    area = 4*Math.PI*(radius*radius);
    System.out.println("area of sphere: " + area);
  }
}

class Cube extends ThreeDim {
  double side;
  void calculateArea() {
    super.calculateArea();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the side length of the cube: ");
    side = scanner.nextDouble();
    area= Math.pow(side, 6);
    System.out.println("area of cube: " + area);
  }
}

public class InheritanceHierarchy{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("1. Calculate area of square");
      System.out.println("2. Calculate area of triangle");
      System.out.println("3. Calculate area of sphere");
      System.out.println("4. Calculate area of cube");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      System.out.println();
      switch (choice) {
        case 1:
          Square square = new Square();
          square.calculateArea();
          break;
        case 2:
          Triangle triangle = new Triangle();
          triangle.calculateArea();
          break;
        case 3:
          Sphere sphere = new Sphere();
          sphere.calculateArea();
          break;
        case 4:
          Cube cube = new Cube();
          cube.calculateArea();
          break;
        case 5:
          System.out.println("Exiting program.");
          break;
        default:
          System.out.println("Invalid choice.");
      }
      System.out.println();
    }
    while (choice != 0);
    scanner.close();
  }
}
