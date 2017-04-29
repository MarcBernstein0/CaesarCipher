package LetterToNumberEncipher;

public class ConvertStringToNumbers {
	static LetterToNumber singleChar = new LetterToNumber();
	String s;
	
	public ConvertStringToNumbers(String s){
		this.s = s;
	}
	
	public String convertString(){
		
		return convertStringUtil(s);
	}
	
	private static String convertStringUtil(String s){
		StringBuilder ret = new StringBuilder();
		if(s.isEmpty())
			return ret.toString();
		else{
			Character c = s.charAt(0);
			ret.append(singleChar.letterValue[singleChar.convertLetterToNumber(c)]);
			convertStringUtil(s.substring(1));
			if(c.equals(' '))
				convertStringUtil(s.substring(1));
		}
		return ret.toString();
	}

}
