package Hoc_java;

import java.util.Scanner;

public class lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Chiều dài HCN: ");
		int length = scanner.nextInt();
		System.out.println("Chiều rộng HCN: ");
		int width = scanner.nextInt();

		System.out.println("Chu vi HCN: " + 2 * (length + width));
		System.out.println("Diện tích HCN: " + length * width);
		System.out.println("Cạnh nhỏ nhất: " + Math.min(length, width));

	}
}
