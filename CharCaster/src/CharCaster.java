/**
 * To cast Char type to Int
 */

/**
 * @author Nick Christiny
 *
 */
public class CharCaster {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		char chr1 = 'A';
		char chr2 = 'B';
		char chr3 = 'C';
		char chr4 = 'a';
		char chr5 = 'b';
		char chr6 = 'c';
		char chr7 = '0';
		char chr8 = '1';
		char chr9 = '2';
		char chr10 = '$';
		char chr11 = '*';
		char chr12 = '+';
		char chr13 = '/';
		char chr14 = ' ';
		
		char chr15 = '%';
		char chr16 = '\t';
		char chr17 = '\n';
		char chr18 = '\r';
		char chr20 = '\f';
		char chr19 = '\\';
		char chr21 = '\b';
		char chr22 = '\'';
		char chr23 = '\"';
		char chr24 = '/';
		char chr25 = 0;
		char chr26 = 1;   
		char chr27 = 2;   

		System.out.printf("Char: %c to int is %d.%n", chr1, (int) chr1);
		System.out.printf("Char: %c to int is %d.%n", chr2, (int) chr2);
		System.out.printf("Char: %c to int is %d.%n", chr3, (int) chr3);
		System.out.printf("Char: %c to int is %d.%n", chr4, (int) chr4);
		System.out.printf("Char: %c to int is %d.%n", chr5, (int) chr5);
		System.out.printf("Char: %c to int is %d.%n", chr6, (int) chr6);
		System.out.printf("Char: %c to int is %d.%n", chr7, (int) chr7);
		System.out.printf("Char: %c to int is %d.%n", chr8, (int) chr8);
		System.out.printf("Char: %c to int is %d.%n", chr9, (int) chr9);
		System.out.printf("Char: value 0 to int is %d.%n", (int) chr25);
		System.out.printf("Char: value 1 to int is %d.%n", (int) chr26);
		System.out.printf("Char: value 2 to int is %d.%n", (int) chr27);
		System.out.printf("Char: %c to int is %d.%n", chr10, (int) chr10);
		System.out.printf("Char: %c to int is %d.%n", chr11, (int) chr11);
		System.out.printf("Char: %c to int is %d.%n", chr12, (int) chr12);
		System.out.printf("Char: %c to int is %d.%n", chr13, (int) chr13);
		System.out.printf("Char: %c (  whitespace) to int is %d.%n", chr14, (int) chr14);
		System.out.printf("Char: %c to int is %d.%n", chr15, (int) chr15);
		System.out.printf("Char: %c to int is %d.%n", chr24, (int) chr24);
		System.out.println("");
		System.out.println("Escape characters:");
		System.out.printf("Char: %c (\\t tab) to int is %d.%n", chr16, (int) chr16);
		System.out.printf("Char: %c (\\n newline) to int is %d.%n", chr17, (int) chr17);
		System.out.printf("Char: %c (\\r carriage return) to int is %d.%n", chr18, (int) chr18);
		System.out.printf("Char:  (\\f formfeed) to int is %d.%n", (int) chr20);     
		System.out.printf("Char: %c (\\b backspace) to int is %d.%n", chr21, (int) chr21);
		System.out.printf("Char: %c (\\') to int is %d.%n", chr22, (int) chr22);
		System.out.printf("Char: %c (\\\") to int is %d.%n", chr23, (int) chr23);
		System.out.printf("Char: %c (\\\\ escaped backslash)to int is %d.%n", chr19, (int) chr19);
		System.out.println("");
		System.out.println("Using (int) char in expressions:");
		System.out.printf("(int) %c subtracted by (int) %c is %d.%n", (int) chr2, (int) chr1,(int) chr2 - (int) chr1 );
		System.out.printf("(int) %c multiplied by (int) %c is %d.%n", (int) chr10, (int) chr6,(int) chr10 * (int) chr6 );
		// Parens not necessary for determining result, but improve legibility 
		String result = ((int) chr1 > (int) chr2) ? "(int) A is larger than (int) B" : "(int) A is smaller than (int) B";
		System.out.printf("%s%n", result);
		
		System.out.printf("(int) (int) A is still %d.%n",(int) (int) chr1);
		System.out.printf("The integer 65 to int is of course %d.%n", (int) 65);

	}

}
