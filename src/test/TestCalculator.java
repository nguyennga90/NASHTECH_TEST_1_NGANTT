package test;

import java.util.InputMismatchException;
import java.util.Scanner;

import core.Calculator;

public class TestCalculator extends Calculator {

	static int a, b, total;

	public static void main(String[] args) {

		setDiff(20);
		setDiff(10);
		total = sum();
		System.out.println("result of function sum: " + total);

		System.out.println("===============================");
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("input first number: ");
			a = input.nextInt();
			System.out.println("input second number: ");
			b = input.nextInt();
			total = Sum(a, b);
			System.out.println("result of function Sum: " + total);
		} catch (InputMismatchException e) {
			System.out.println("wrong format");
		}

	}

}
