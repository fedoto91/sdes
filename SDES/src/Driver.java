import java.util.*;

/**
 * Test the implementation of SDES
 * 
 * @author (Eugene Fedotov)
 * @version (October 16, 2014)
 */
public class Driver {
	public static void main(String[] args) {
		SDES sdes = new SDES();

		Scanner scanner = new Scanner(System.in);

		String plain = "x";
		System.out.println("Enter plain text, or hit 'Enter' to terminate");
		plain = scanner.nextLine();
		byte[] cipher;
		while (plain.length() > 0) {
			cipher = sdes.encrypt(plain);
			System.out.print("Cipher is ");
			sdes.show(cipher);
			// System.out.println(sdes.byteArrayToString(sdes.decrypt(cipher)));
			// System.out.println("Enter plain text, or hit 'Enter' to terminate");
			plain = scanner.nextLine();
		}
	}
}