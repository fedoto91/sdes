import java.util.Arrays;

/**
 * SDES
 * 
 * @author (Eugene Fedotov)
 * @version (October 16, 2014)
 */

public class SDES {

	void show(byte[] byteArray)
	{
		System.out.println(Arrays.toString(byteArray));
	}
	
	void show(boolean[] inp)
	{
		System.out.println(Arrays.toString(inp));
	}
	
	byte[] encrypt(String msg)
	{
		byte[] block = msg.getBytes();
		
		for(int i = 0; i < block.length; i++)
		{
			block[i] = encryptByte(block[i]);
		}

		return block;
	}
	
	byte[] decrypt(byte[] cipher)
	{
		byte[] plain = new byte[8];
		
		for(int i = 0; i < cipher.length; i++)
		{
			plain[i] = decryptByte(cipher[i]);
		}
		
		return plain;
	}
	
	byte decryptByte(byte b)
	{
		
		boolean[] bitArray = byteToBitArray(b, 8);
		
		boolean[] ip = {
				bitArray[1],
				bitArray[5],
				bitArray[2],
				bitArray[0],
				bitArray[3],
				bitArray[7],
				bitArray[4],
				bitArray[6],
		};
		
		boolean[] k1 = {
				bitArray[0],
				bitArray[6],
				bitArray[8],
				bitArray[3],
				bitArray[7],
				bitArray[2],
				bitArray[9],
				bitArray[5],
		};
		
		boolean[] k2 = {
				bitArray[7],
				bitArray[2],
				bitArray[5],
				bitArray[4],
				bitArray[9],
				bitArray[1],
				bitArray[8],
				bitArray[0],
		};
		
		bitArray = f(bitArray, k2); // round 1
		bitArray = concat(rh(bitArray), lh(bitArray)); // switch
		bitArray = f(bitArray, k1); // round 2
		
		boolean[] byteCipher = {
				bitArray[3],
				bitArray[0],
				bitArray[2],
				bitArray[4],
				bitArray[6],
				bitArray[1],
				bitArray[7],
				bitArray[5],
			};

		return bitArrayToByte(byteCipher);
	}
	
	byte encryptByte (byte b)
	{
		boolean[] bitArray = byteToBitArray(b, 8);
		
		boolean[] ip = {
				bitArray[1],
				bitArray[5],
				bitArray[2],
				bitArray[0],
				bitArray[3],
				bitArray[7],
				bitArray[4],
				bitArray[6],
		};
		
		boolean[] k1 = {
				bitArray[0],
				bitArray[6],
				bitArray[8],
				bitArray[3],
				bitArray[7],
				bitArray[2],
				bitArray[9],
				bitArray[5],
		};
		
		boolean[] k2 = {
				bitArray[7],
				bitArray[2],
				bitArray[5],
				bitArray[4],
				bitArray[9],
				bitArray[1],
				bitArray[8],
				bitArray[0],
		};
		
		bitArray = f(bitArray, k1); // round 1
		bitArray = concat(rh(bitArray), lh(bitArray)); // switch
		bitArray = f(bitArray, k2); // round 2
		
		boolean[] byteCipher = {
			bitArray[3],
			bitArray[0],
			bitArray[2],
			bitArray[4],
			bitArray[6],
			bitArray[1],
			bitArray[7],
			bitArray[5],
		};
		
		return bitArrayToByte(byteCipher);
	}
	
	boolean[] byteToBitArray(byte b, int size)
	{
		// stub
		boolean[] t = new boolean[10]; 
		return t;
	}
	
	boolean[] f(boolean[] x, boolean[] k)
	{
		// stub
		return x;
	}
	
	boolean[] lh(boolean[] inp)
	{
		// stub
		return inp;
	}
	
	boolean[] rh(boolean[] inp)
	{
		// stub
		return inp;
	}
	
	boolean[] concat(boolean[] x, boolean[] y)
	{
		// stub
		return x;
	}
	
	byte bitArrayToByte(boolean[] inp)
	{
		//stub
		byte b = 0;
		return b;
	}
	
}
