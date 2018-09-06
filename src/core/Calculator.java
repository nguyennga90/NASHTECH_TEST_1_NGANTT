package core;

public class Calculator {
	public static int sum, diff;

	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum) {
		Calculator.sum = sum;
	}

	public static int getDiff() {
		return diff;
	}

	public static void setDiff(int diff) {
		Calculator.diff = diff;
	}

	public static int sum() {
		return getSum() + getDiff();
	}

	public static int Sum(int a, int b) {
		return a + b;
	}

}
