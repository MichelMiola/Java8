package br.com.java8.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenarStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Collections.sort(palavras, comparador);

		//
		// Classe Anonima
		//
		
		/*palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});*/
		//-----------------------------------------
		
		//
		// Lambda
		//
		
		//palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

		//palavras.sort(Comparator.comparing(s -> s.length()));
		//------------------------------------------

		//
		//Method Reference
		//
		
		palavras.sort(Comparator.comparing(String::length));
		//------------------------------------------
		
		
		// System.out.println(palavras);
		
		// for (String p : palavras) { System.out.println(p); }
		 
		//
		// Lambda
		//
		
		Consumer<String> c = s -> System.out.println(s);
		palavras.forEach(c);
		//palavras.forEach(t -> System.out.println(t));
		//---------------------------------------
		
		
		//
		//Method Reference
		//
		
		palavras.forEach(System.out::println);
		//---------------------------------------
		
		
		/*new Thread(() -> {
			System.out.println("Executando um Runnable");
		}).start();*/

	}
}
