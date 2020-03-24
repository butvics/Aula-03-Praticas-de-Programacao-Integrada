package br.usjt.OO;

public class Pais {
	public static int idPais;
	public String nomePais;
	public long populacaoPais;
	public double areaPais;

	public Pais() {
	}

	@Override
	public String toString() {
		return "Pais [idPais=" + idPais + ", nomePais=" + nomePais + ", populacaoPais=" + populacaoPais + ", areaPais=" 
				+ areaPais + "]";
	}

	public Pais(int idPais, String nomePais, long populacaoPais, double areaPais) {
		//this.idPais = idPais;
		this.nomePais = nomePais;
		this.populacaoPais = populacaoPais;
		this.areaPais = areaPais;
	}

	public static int getIdPais() {
		return idPais;
	}

	public static void setIdPais(int idPais) {
		
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public long getPopulacaoPais() {
		return populacaoPais;
	}

	public void setPopulacaoPais(long populacaoPais) {
		this.populacaoPais = populacaoPais;
	}

	public double getAreaPais() {
		return areaPais;
	}

	public void setAreaPais(double areaPais) {
		this.areaPais = areaPais;
	}

	public void setPopulacaoPais(String pPopulacaoPais) {
	}

	public void setAreaPais(String pAreaPais) {
	}
}