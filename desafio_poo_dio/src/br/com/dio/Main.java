package br.com.dio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Formação Java", "Descrição Formação Java", 8);

		Curso curso2 = new Curso("Formação JavaScript", "Descrição Formação JavaScript", 4);
		
		Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição Mentoria Java", LocalDate.now());
	
		System.out.println(mentoria1);
	}
}
