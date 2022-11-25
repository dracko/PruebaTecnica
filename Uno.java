package m2;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Uno {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String cadena = in.nextLine();
		
cadena =  Normalizer.normalize(cadena, Normalizer.Form.NFD);
cadena = cadena.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

String[] listWord = cadena.split("[, ?.@ -]+"); 
listWord = cadena.toLowerCase().split("[, ?.@ -]+");
Set<String> palabras = new HashSet<>(Arrays.asList(listWord));
System.out.print("{");
for(String word : palabras){

    int count = 0;
    
	for (int j = 0; j < listWord.length; j++) {
        if (listWord[j].equals(word)) {
            count++;
        }
    }
    if (count >= 1) {
    	
        System.out.println('\"'+word +'\"'+':'+ ' ' + count+',');
    } 
    else {

    }

    count = 0;
} 
System.out.print("}");
	}
}
