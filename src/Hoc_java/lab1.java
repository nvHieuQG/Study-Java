package Hoc_java;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Họ tên Sinh Viên: ");
		String name = scanner.nextLine();
		System.out.println("Điểm trung bình của Sinh Viên: ");
		Double point = scanner.nextDouble();

		System.out.println(name + " có điểm " + point);
	}
}
