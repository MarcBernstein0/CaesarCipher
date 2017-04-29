package LetterToNumberEncipher;

/*
 * only works for lower case letters
 */
public class LetterToNumber {
	char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	double[] letterValue = new double[letters.length];
	
	public int convertLetterToNumber(Character c){
		int beg = 0;
		int end = letters.length;
		while(end >= beg){
			int mid = (beg + end)/2; 
			if(c.equals(letters[mid])){
				letterValue[mid] = Math.random(); 
				return mid;
			}
			else if(c.compareTo(letters[mid]) < 0)
				end = mid - 1;
			else if(c.compareTo(letters[mid]) > 0)
				beg = mid + 1;
		}
		return -1;
	}
	public char convertNumberToLetter(double letterNum) throws NoLetterException{
		for(int x = letterValue.length - 1; x != -1; x--){
			if(letterValue[x] == letterNum)
				return letters[x];
		}
		throw new NoLetterException("This number does not correlate to any letter");
	}
}


