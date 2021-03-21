/* Encryption with the Caesar Cipher */
/* Goodrich, Tamassia, Goldwasser */
import java.lang.*;

public class RandomCipher{

	protected char[] encoder = new char[26]; // Encryption Array 
	protected char[] decoder = new char[26]; // Decryption array

	/* The constructor initializes the  encryption and decryption arrays*/

	public RandomCipher(int random_rotation){

        
		for(int k=0; k<26; k++){

			encoder[k] = (char)('A' + (k+random_rotation)%26);
			decoder[k] = (char)('A' + (k-random_rotation + 26)%26);

		}
	}

	public String encrypt(String message){

		/*return String representing the encrypted message */
		return transform(message, encoder);

	}


	public String decrypt(String secret){

		return transform(secret, decoder); 

	}

	private String transform(String original, char[] code){

		char[] msg = original.toCharArray();
		for(int k=0; k< msg.length; k++){

			if(Character.isUpperCase(msg[k])){

				int j = msg[k] - 'A';
				msg[k] = code[j];

			}
		}

		return new String(msg);
	}

	public static void main(String[] args){
		/* main method for testing the Caesar Cipher*/

        int rand = (int)(Math.random()*((26-1)+1))+1;
        if (rand == 0){
            rand = (int)(Math.random()*((26-1)+1))+1;
        }
		RandomCipher cip = new RandomCipher(rand);
		System.out.println("Encryption code = "+ new String(cip.encoder));
		System.out.println("Decryption code = "+ new String(cip.decoder));
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S";
		String coded = cip.encrypt(message);
		System.out.println("Secret: "+ coded);
		String answer = cip.decrypt(coded);
		System.out.println("Message: " + answer);

	}
}