package LetterToNumberEncipher;

public class Driver {

	public static void main(String[] args) throws NoLetterException {
		// TODO Auto-generated method stub
		LetterToNumber n = new LetterToNumber();
		int x = n.convertLetterToNumber('a');
		System.out.println(x);
		System.out.println(n.letterValue[0]);
		System.out.println(n.convertNumberToLetter(n.letterValue[0]));
		System.out.println(n.convertNumberToLetter(0));
	}

}
