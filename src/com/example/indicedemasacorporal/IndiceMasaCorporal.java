package com.example.indicedemasacorporal;

import android.util.Log;

public class IndiceMasaCorporal {

	/**
	 * Recordatorio: Clases inmutables.
	 */
	private Double peso;
	private Integer altura;

	/**
	 * 
	 */
	public IndiceMasaCorporal() {
		// TODO Auto-generated constructor stub
		this.peso = new Double(0.0);
		this.altura = new Integer(0);

	}

	/**
	 * Constructor
	 * 
	 * @param peso
	 * @param altura
	 */
	public IndiceMasaCorporal(Double peso, Integer altura) {
		// super();
		this.peso = peso;
		this.altura = altura;

	}

	/**
	 * @return the altura
	 */
	public Integer getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
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
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double valorIndiceMasaCorporal() throws Exception{

			if (altura.doubleValue()==0.0) throw new Exception("Div by Zero");
			return peso.doubleValue() / Math.pow(altura.doubleValue(), 2.0);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IndiceMasaCorporal [peso=" + peso + ", altura=" + altura + "]";
	}

}
