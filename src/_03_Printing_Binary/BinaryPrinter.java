package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		System.out.println(b);
		int n = b;
		int[] binaryNum = new int[1000];
    int i = 0;
    while (n > 0) 
    {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
    }
    String[] output = new String[1000];
    for(int m = 0; m < binaryNum.length; m++) {
    		output[m] = binaryNum[m]+"";
    }
    String p = "";
    for (int j = i - 1; j >= 0; j--) {
    		p += output[j];
    }
    System.out.println(p);
	}
	
	public void printShortBinary(short s) {
		int n = s;
		int[] binaryNum = new int[1000];
    int i = 0;
    while (n > 0) 
    {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
    }
    String[] output = new String[1000];
    for(int m = 0; m < binaryNum.length; m++) {
    		output[m] = binaryNum[m]+"";
    }
    String p = "";
    for (int j = i - 1; j >= 0; j--) {
    		p += output[j];
    }
    System.out.println(p);
	}
	
	public void printIntBinary(int i) {
		int n = i;
		int[] binaryNum = new int[1000];
    while (n > 0) 
    {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
    }
    String[] output = new String[1000];
    for(int m = 0; m < binaryNum.length; m++) {
    		output[m] = binaryNum[m]+"";
    }
    String p = "";
    for (int j = i - 1; j >= 0; j--) {
    		p += output[j];
    }
    System.out.println(p);
	}
	
	public void printLongBinary(long l) {
		long n = l;
		int[] binaryNum = new int[1000];
    int i = 0;
    while (n > 0) 
    {
        binaryNum[i] = (int) (n % 2);
        n = n / 2;
        i++;
    }
    String[] output = new String[1000];
    for(int m = 0; m < binaryNum.length; m++) {
    		output[m] = binaryNum[m]+"";
    }
    String p = "";
    for (int j = i - 1; j >= 0; j--) {
    		p += output[j];
    }
	}
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		byte a = 68;
		bp.printByteBinary(a);
		short b = 5;
		bp.printShortBinary(b);
		int c = 123;
		bp.printIntBinary(c);
		long d = 123453653;
		bp.printLongBinary(d);
	}
}
