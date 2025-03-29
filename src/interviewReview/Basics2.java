package interviewReview;

public class Basics2 {

	/**
	 * This class uses most of the java concepts . Easy for brushup and interview
	 * prep
	 * 
	 */

	public Basics2() {

		System.out.println("constructor called");
		System.out.println("*************************");

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Basics2 b = new Basics2();

		b.reverseastring("aymeR");
		System.out.println("*************************");
		b.junkremoval();
		System.out.println("*************************");
		int Sum = b.sumofarray();
		System.out.println(Sum);
		System.out.println("*************************");
		b.minmaxOfArray();
		System.out.println("*************************");
		b.swapwithtemp();
		System.out.println("*************************");
		b.swapwithouttemp();
		System.out.println("*************************");
		b.pyramid();
		System.out.println("*************************");
		b.minmaxOfMultiarray();
		System.out.println("*************************");
		b.fibanocci();
		System.out.println("*************************");
		b.primeNumber(11);

		System.out.println("*************************");
		// b.findduplicatesanduniquenumber();
	}

	private int sumofarray() {

		int sum = 0;

		int[] a = { 1, 3, 4, 6, 4 };

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}

		return sum;
	}

	private void junkremoval() {

		String a = "dghfdet$%^^%%^%^&^&";
		a = a.replaceAll("[^a-z A-Z]", " ");
		System.out.println(a);

	}

	private void reverseastring(String s) {

		String rev = " ";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
	}

	public void swapwithtemp() {

		int a = 2;
		int b = 4;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);

	}

	public void swapwithouttemp() {

		int a = 2;
		int b = 4;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

	public void pyramid() {

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
				System.out.print("\t");

			}
			System.out.println("");
		}

	}

	public void fibanocci() {

		// 0,1,1,2,3,5,8,13,....

		int a = 0;
		int b = 1;
		int fib = 0;

		for (int i = 0; i < 9; i++) {

			fib = a + b; // fib=1
			a = b;
			b = fib;

			System.out.print(fib);
			System.out.print(" ");
		}

	}

	public void primeNumber(int val) {

		for (int i = 2; i <= val; i++) {

			if (!(val % i == 0)) {

				System.out.println(val + "is a prime number");
				break;
			}

		}

	}

	public void minmaxOfArray() {

		int[] a = { 3, 2, 45, 6, 7, 8 };

		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}
			if (a[i] < min) {

				min = a[i];

			}

		}
		System.out.println(min);
		System.out.println(max);

	}

	public void minmaxOfMultiarray() {

		int[][] a = { { 1, 2, 3 }, { 4, 2, 9 }, { 2, 9, 4 } };

		int min = a[0][0];
		int mincolumn = 0;
		int max = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (a[i][j] < min) {

					min = a[i][j];
					mincolumn = j;

				}

				max = a[0][j];

				for (int k = 0; k < 3; k++) {

					if (a[k][j] < max) {

						max = a[k][j];

						System.out.println(max + " is max value");

					}

				}

			}

		}
		System.out.println(min + " is min value");
		System.out.println(max + " is max value");

	}
}
