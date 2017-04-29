package LetterToNumberEncipher;

public class ConvertStringToNumbers {
	static LetterToNumber singleChar = new LetterToNumber();
	static String[] encripted;
	static String encriptedString = "";
	static String decriptedString = "";
	String s;
	
	
	public ConvertStringToNumbers(String s){
		this.s = s.toLowerCase();
	}
	
	public String convertString(){
		
		return convertStringUtil(s);
	}
	
	private static String convertStringUtil(String s){
		encripted = new String[s.length()];
		for(int index = 0; index < s.length(); index++){
			Character c = s.charAt(index);
			if(c.equals(' '))
				encripted[index] = " ";
			else{
				int letVal = singleChar.convertLetterToNumber(c);
				encripted[index] = Integer.toString(singleChar.letterValue[letVal]);
			}	
		}
		for(int x = 0; x < encripted.length; x++)
			encriptedString += encripted[x] + " ";
		return encriptedString;
	}
	
	public String convertBack() throws NoLetterException{
		return convertBackUtil(encripted);
	}
	
	private static String convertBackUtil(String[] encripted) throws NoLetterException{
		for(int index = 0; index < encripted.length; index++){
			if(encripted[index].equals(" "))
				decriptedString += " ";
			else{
				int d = Integer.parseInt(encripted[index]);
				decriptedString += singleChar.convertNumberToLetter(d);
			}	
			//System.out.println(decriptedString);
		}
		return decriptedString;
	}

}
