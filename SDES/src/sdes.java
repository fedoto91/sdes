public class sdes {
	/**
	 * Encrypt the given string using SDES Each character produces a byte of
	 * cipher.
	 * 
	 * @param msg
	 * @return An array of bytes representing the cipher text.
	 */
	public byte[] encrypt(java.lang.String msg) {
		byte[] a = { 1, 2, 3, 4 };
		return a;
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
