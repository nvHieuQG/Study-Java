package Hoc_java;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("số thứ nhất : ");
		int a = scanner.nextInt();
		System.out.println("số thứ hai : ");
		int b = scanner.nextInt();
		System.out.println("Số nhỏ nhất là : " + Math.min(a, b));
	}
}
