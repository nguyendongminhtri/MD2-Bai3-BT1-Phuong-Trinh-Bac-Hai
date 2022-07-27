package rikkei.academy.view;

import rikkei.academy.model.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        Person person = new Person("Chi",18);
//        Person person1 = new Person("Nam",20,"Hà Nội");
//
////        System.out.println("person -> "+person);
//        System.out.println("person1 -> "+person1.name);
        System.out.println("---------------GIẢI PHƯƠNG TRÌNH BẬC HAI--------------");
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
      double a = scanner.nextDouble();
        while (a<0){
            System.out.println("Nhập lại a, a phải là số lớn hơn 0: ");
             a = scanner.nextDouble();
        }
        quadraticEquation.setA(a);
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        quadraticEquation.setB(b);
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        quadraticEquation.setC(c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("delta === "+delta);
        if(delta<0){
            System.out.println("Phương trình vô nghiệm");
        } else if(delta==0){
            System.out.println("Phương trình có nghiệm kép: ");
            double x = quadraticEquation.getRoot1();
            System.out.println("x = "+x);
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("x1 = "+quadraticEquation.getRoot1());
            System.out.println("x2 = "+quadraticEquation.getRoot2());
        }
    }
}