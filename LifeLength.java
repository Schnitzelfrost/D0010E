package Lab1;

import javax.swing.Spring;

public class LifeLength {

	public static void main(String[] args) {

		// cleanup task 1
		switch (Integer.parseInt(args[0])) {
		// task 1
		case 1:
			System.out.println(f1(Integer.parseInt(args[1])));
			break;
		// task 2.1
		case 2:
			System.out.println(f2(Integer.parseInt(args[1])));
			break;
		// task 2.2
		case 3:
			System.out.println(f4(Integer.parseInt(args[1])));
			break;
		// task 2.3
		case 4:
			System.out.println(f8(Integer.parseInt(args[1])));
			break;
		// task 2.4
		case 5:
			System.out.println(f16(Integer.parseInt(args[1])));
			break;
		// task 2.5
		case 6:
			System.out.println(f32(Integer.parseInt(args[1])));
			break;
		// task 3
		case 7:
			System.out.println(iterateF(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
			break;

		// task 4
		case 8:
			System.out.println(intsToString(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
			break;

		// task 6
		case 9:
			System.out.println(recLifeLength(Integer.parseInt(args[1])));
			break;

		// ifall man knappar in felaktiga värden för vilket case man vill ha
		default:
			System.out.println("knappa in något bättre");
			break;
		}

	}

	// first task
	public static int f1(int a0) {

		if (a0 == 1) {
			return 1;
		}

		else if (a0 % 2 == 0) {
			return a0 / 2;
		}

		else {
			return ((3 * a0) + 1);
		}
	}

	// second task
	public static int f2(int a0) {
		int a1 = f1(a0);
		int a2 = f1(a1);
		//return f1(f1(a0));
		return a2;
	}

	public static int f4(int a0) {
		int a3 = f2(a0);
		int a4 = f2(a3);
		return a4;
	}

	public static int f8(int a0) {
		int a6 = f4(a0);
		int a8 = f4(a6);
		return a8;
	}

	public static int f16(int a0) {
		int a12 = f8(a0);
		int a16 = f8(a12);
		return a16;
	}

	public static int f32(int a0) {
		int a24 = f16(a0);
		int a32 = f16(a24);
		return a32;
	}

	// third task
	public static int iterateF(int a0, int n) {
		if (n == 0) {
			return a0;
		} else {
			for (int i = n; i > 0; i--) {
				a0 = f1(a0);

			}
			return a0;
		}

	}

	// fourth task
	public static String intsToString(int x, int y) {
		return "The life length of " + x + " is " + y + ".";
	}

	public static int iterLifeLength(int a0) {
		int count = 0;
		int z = a0;
		while (z > 1) {
			count = count + 1;
			z = f1(z);
		}
		return count;
	}
	
	//for(int x = 1; x <= 15; x = x + 1){
    	//System.out.println(intsToString(x, iterLifeLength(x)));
//}

	// sixth task
	public static int recLifeLength(int a0) {
		if (a0 == 1) {
			return 0;
		} else {
			return 1 + recLifeLength(f1(a0));
		}

	}

}
