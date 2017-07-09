/**
 * Table of squares and cubes using only techniques covered so far 
 */

/**
 * @author Nick Christiny
 *
 */
public class SquareCubeTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("number\tsquare\tcube");
		System.out.println("0\t" + Math.round(Math.pow(0, 2)) + "\t" + Math.round(Math.pow(0, 3)));
		System.out.println("1\t" + 1 * 1 + "\t" + 1 * 1 * 1);
		System.out.println("2\t" + 2 * 2 + "\t" + 2 * 2 * 2);
		System.out.println("3\t" + 3 * 3 + "\t" + 3 * 3 * 3);
		System.out.println("4\t" + 4 * 4 + "\t" + 4 * 4 * 4);
		System.out.println("5\t" + 5 * 5 + "\t" + 5 * 5 * 5);
		System.out.println("6\t" + 6 * 6 + "\t" + 6 * 6 * 6);
		System.out.println("7\t" + 7 * 7 + "\t" + 7 * 7 * 7);
		System.out.println("8\t" + 8 * 8 + "\t" + 8 * 8 * 8);
		System.out.println("9\t" + 9 * 9 + "\t" + 9 * 9 * 9);
		System.out.println("10\t" + 10 * 10 + "\t" + Math.pow(10, 3));  // pow() gives float

	}

}
