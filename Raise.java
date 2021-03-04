package Lab1;

public class Raise {

	public static void main(String[] args) {

		
		
		  for (int i = 1; i <= 15; i++) {
				System.out.println("Half: " + recRaiseHalf(1.000001, i) + " = " + count2);
				System.out.println("One: " + recRaiseOne(1.000001, i) + " = " + count1);
	            count1 = 0;
	            count2 = 0;
		  }
	}

	static int count1; // count för raiseone
	static int count2;	// count för raisehalf

	public static double recRaiseOne(double x, int k) {

		count1++;

		if (k == 0) {

			return 1.0;
		}

		else {

			return x * recRaiseOne(x, k - 1);

		}

	}

	public static double recRaiseHalf(double x, int k) {

		count2++;

		if (k == 0) {

			return 1;
		}

		else if (k % 2 == 0) {

			double rec = recRaiseHalf(x, k / 2);
			return (rec * rec);
		}

		else {

			double rec = recRaiseHalf(x, k / 2);
			return (x * rec * rec);
		}

	}

}
