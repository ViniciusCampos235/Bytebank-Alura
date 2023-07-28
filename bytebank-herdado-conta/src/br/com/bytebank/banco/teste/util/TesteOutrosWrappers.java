package br.com.bytebank.banco.teste.util;

import java.util.*;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double bRef = Double.valueOf(3.2);
		System.out.println(bRef.doubleValue());

		Boolean dRef = Boolean.FALSE;
		System.out.println(dRef.booleanValue());

		Number refNumero = Float.valueOf(29.9f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
	}

}
