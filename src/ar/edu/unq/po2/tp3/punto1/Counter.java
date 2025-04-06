package ar.edu.unq.po2.tp3.punto1;

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
}

	