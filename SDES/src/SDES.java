import java.util.ArrayList;
import java.util.Scanner;

public class SDES {
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
		byte[] a = { 1, 2, 3, 4 };
		return a;
	}

	/**
	 * Get a 10 bit key from the keyboard, such as 1010101010.
	 * 
	 * @param scanner
	 */
	public void getKey10(java.util.Scanner scanner) {
		System.out.println("Enter a 10-bit key, such as 1010101010.");
		String key = scanner.nextLine();
		while (key.length() != 10){
			System.out.println("Error: incorrect length. Re-enter the key:");
			key = scanner.nextLine();
		}
		String[] temp = new String[10];
		temp = key.split("");
		ArrayList<Integer> keyArray = new ArrayList<Integer>(10);
		for (int i = 0; i < temp.length; i++)
			keyArray.add(Integer.parseInt(temp[i]));
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
