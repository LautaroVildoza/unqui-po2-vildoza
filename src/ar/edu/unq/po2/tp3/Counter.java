package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> nums =  new ArrayList<Integer>();
	
	public List<Integer> getNums() {
		return nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}

	public void agregarNum(int n) {
		nums.add(n);
	}
	
	public int cantPares() {
		return (int) nums.stream().filter(n -> n % 2 == 0).count();
	}
	
	public int cantImpares() {
		return (int) nums.stream().filter(n -> n % 2 != 0).count();	
	
	}
	
	public int cantDeMultiplos(int n) {
		return (int) nums.stream().filter(n1 -> n1 % n == 0).count();	
		
	}
	
	public int numCanMaxDePares() {
		int maxDigitosPares = 0;
		int numConMasPares = 0;
		
		for (int n : nums) {
			int digitosPares = this.contarDigitosParesDe(n);
			
			if(digitosPares >= maxDigitosPares) {
				maxDigitosPares = digitosPares;
				numConMasPares = n;
			}
		}
	
		return numConMasPares;
	}
	
	public int contarDigitosParesDe(int n) {
		int contador = 0;
		while(n != 0) {
			int digito = n % 10;
			if (digito % 2 == 0) {
				contador++;
			}
			n /= 10;
		}
		return contador;
	}
	
	public int multiplosDe(int x, int y) {
		int mulHastaAhora = -1;
		int mcmDeLosNros = this.mcmDe(x,y);
		for (int i = 1; i * mcmDeLosNros <= 1000; i++) {
			mulHastaAhora = i * mcmDeLosNros;
		}
		return mulHastaAhora;
		}
	
	public int mcmDe(int x, int y) {
		return Math.abs(x * y) / this.calcularMCD(x,y);
	}

	public int calcularMCD(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	
	/**
	 * Punto 4: Examinando las expresiones:
	 * 
	 * a: error.
	 * b: error.
	 * c: error.
	 * d: "ABC"
	 * e: 5
	 * f: 9
	 * g: "ilm"
	 * h: error??
	 * i: False
	 * j: True
	 * 
	 * Probando comit and psuh en git bash.
	 */
	
	/**
	 * Punto 5: Tipos primitivos.
	 * 
	 * 1: los tipos de datos primitivos son los datos que ya vienen incluidos en el lenguaje y que para utilizarlos no hay que definirlos (ya vienen definidos).
	 * 
	 * 2: La diferencia entre int e integer es que int es un tipo primitivo e integer es una clase sobre un int estos se usan generalemnte para array.
	 * 
	 * 3: int = 0 y integer = null
	 * 
	 */

}