package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	protected String titulo;
	protected String descricao;
	
	protected static final double XP_PADRAO = 10d;
	
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static double getXpPadrao() {
		return XP_PADRAO;
	}

	public abstract double calcularXP();
}
