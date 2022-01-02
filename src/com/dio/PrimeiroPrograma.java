package com.dio;

/*
 * Autor: Marcelo Junior
 * 
 * Data:02/01/2022
 * 
 * Versão: 1.0
 * 
 */
import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros(); 
		
		System.out.println(gato);
		System.out.println(livros); 
		
	}

}

class Livros {
	private String nome;
	private String npag;
}