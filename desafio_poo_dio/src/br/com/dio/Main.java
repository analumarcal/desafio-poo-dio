package br.com.dio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {

	public static void main(String[] args) {

		Conteudo curso1 = new Curso("Introdução à Plataforma Java", "Descrição Introdução à Plataforma Java", 1);

		Conteudo curso2 = new Curso("Ambiente de Desenvolvimento Java", "Descrição Ambiente de Desenvolvimento Java", 1);

		Conteudo curso3 = new Curso("Aprendendo a Sintaxe Java", "Descrição Aprendendo a Sintaxe Java", 5);
		
		Conteudo mentoria1 = new Mentoria("Fundamentos de Java", "Descrição Fundamentos de Java", LocalDate.now());
		
		Bootcamp bootcamp1 = new Bootcamp("Bootcamp Java", "Aprenda do zero a linguagem Java");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(curso3);
		bootcamp1.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev("Ana");
		dev1.inscreverBootcamp(bootcamp1);
		System.out.println(dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println(dev1.calcularTotalXp());
		System.out.println(dev1.getConteudosInscritos());
		System.out.println(dev1.getConteudosConcluidos());
		dev1.progredir();
		dev1.progredir();
		System.out.println(dev1.calcularTotalXp());
		System.out.println(dev1.getConteudosInscritos());
		System.out.println(dev1.getConteudosConcluidos());
		
		System.out.println(bootcamp1.getDevsInscritos());
	}
}
