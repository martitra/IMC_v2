package com.example.indicedemasacorporal;

public class IndiceMasaCorporal {
	
	/**
	 * Recordatorio: Clases inmutables.
	 */
	private Integer altura;
	private Double peso;
	
/**
	 * 
	 */
	public IndiceMasaCorporal() {
		// TODO Auto-generated constructor stub
		this.altura = new Integer(0);
		this.peso = new Double(0.0);
	}
/**
 * Constructor	
 * @param altura
 * @param peso
 */
public IndiceMasaCorporal(Integer altura, Double peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}
/**
 * @return the altura
 */
public Integer getAltura() {
	return altura;
}
/**
 * @param altura the altura to set
 */
public void setAltura(Integer altura) {
	this.altura = altura;
}
/**
 * @return the peso
 */
public Double getPeso() {
	return peso;
}
/**
 * @param peso the peso to set
 */
public void setPeso(Double peso) {
	this.peso = peso;
}

}
