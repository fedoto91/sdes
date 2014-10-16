import java.util.ArrayList;
import java.util.Scanner;

/**
 * SDES
 * 
 * @author (Eugene Fedotov)
 * @version (October 16, 2014)
 */

public class SDES {
	private boolean[] inp = new boolean[10];

	/**
	 * Encrypt the given string using SDES Each character produces a byte of
	 * cipher.
	 * 
	 * @param msg
	 * @return An array of bytes representing the cipher text.
	 */
	public byte[] encrypt(java.lang.String msg) {
		Scanner scanner = new Scanner(System.in);
		getKey10(scanner);
		int[] epv = { 2, 4, 1, 6, 3, 9, 0, 8, 7, 5 };
		expPerm(inp, epv);
		byte[] a = { 1, 2, 3, 4 }; // stub
		return a;
	}

	/**
	 * Expand and/or permute and/or select from the bit array, inp, producing an
	 * expanded/permuted/selected bit array
	 * 
	 * @param inp
	 * @param epv
	 */
	public boolean[] expPerm(boolean[] inp, int[] epv) {
		boolean[] p10 = new boolean[10];
		for (int i = 0; i < 10; i++)
			p10[i] = inp[epv[i]];
		/**
		 * circular left shift by one bit separately on first 5 bits and second
		 * 5 bits
		 */
		boolean temp;
		temp = lh(inp)[0];
		for (int i = 0, j = 1; i < 4; i++, j++)
			p10[i] = lh(inp)[j];
		p10[4] = temp;
		temp = rh(inp)[0];
		for (int i = 5, j = 1; i < 9; i++, j++)
			p10[i] = rh(inp)[j];
		p10[9] = temp;
		/** done **/
		
		
		return inp;
	}

	/**
	 * Left half of x, L(x)
	 * 
	 * @param inp
	 * @return
	 */
	boolean[] lh(boolean[] inp) {
		boolean[] temp = new boolean[4];
		for (int i = 0; i < 5; i++)
			temp[i] = inp[i];
		return temp;
	}

	/**
	 * Right half of x, R(x)
	 * 
	 * @param inp
	 * @return
	 */
	boolean[] rh(boolean[] inp) {
		boolean[] temp = new boolean[4];
		for (int i = 5; i < 9; i++)
			temp[i] = inp[i];
		return temp;
	}

	/**
	 * Get a 10 bit key from the keyboard, such as 1010101010.
	 * 
	 * @param scanner
	 */
	public void getKey10(java.util.Scanner scanner) {
		System.out.println("Enter a 10-bit key, such as 1010101010.");
		String key = scanner.nextLine();
		while (key.length() != 10) {
			System.out.println("Error: incorrect length. Re-enter the key:");
			key = scanner.nextLine();
		}
		String[] temp = new String[10];
		temp = key.split("");
		for (int i = 0; i < 10; i++)
			if (temp[i].equals("1"))
				inp[i] = true;
			else
				inp[i] = false;
	}

	/**
	 * Decrypt the given byte array.
	 * 
	 * @param cipher
	 *            An array of bytes representing the cipher text.
	 * @return An array of bytes representing the original plain text.
	 */
	public byte[] decrypt(byte[] cipher) {
		return cipher;
	}

	/**
	 * Encrypt a single byte using SDES
	 * 
	 * @param b
	 * @return
	 */
	public byte encryptByte(byte b) {
		return b;
	}

	/**
	 * Decrypt a single byte using SDES
	 * 
	 * @param b
	 * @return
	 */
	public byte decryptByte(byte b) {
		return b;
	}

	/**
	 * Send the byteArray to stdout
	 * 
	 * @param byteArray
	 */
	public void show(byte[] byteArray) {

	}

	/**
	 * Send the bitArray to stdout as 1's and 0's
	 * 
	 * @param inp
	 */
	public void show(boolean[] inp) {

	}
}
