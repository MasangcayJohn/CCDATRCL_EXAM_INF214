import java.util.*;

public class Array
{
	public static void main(String[] args) {
		String[] wordList = {"MASANGCAY"};
		String str = wordList[0];
		for (int i = 0; i < wordList.length; i++) {
			String word = wordList[i];
			word = new StringBuilder(word).reverse().toString();
			wordList[i] = word;
		}  
		
		for (int i = 0;i < str.length(); i++){
			System.out.println(str.charAt(i));
		}
		char f, l;
		f=str.charAt(0);
		l= str.charAt(str.length()-1);
		String s = new StringBuilder("").append(f).append(l).toString();
	      System.out.println(s);
		
		System.out.println(wordList[0]);
	}
}