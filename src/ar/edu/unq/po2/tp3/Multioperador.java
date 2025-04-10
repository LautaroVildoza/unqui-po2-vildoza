package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
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
	
	
	public int suma() {
		int contador = 0;
		for (int num : nums) {
			contador = contador + num;
		}
		return contador;
	}
	
	public int resta() {
		int contador = 0;
		for (int num : nums) {
			contador = contador - num;
		}
		return contador;
	}
	
	public int multiplicar() {
		int contador = 1;
		for (int num : nums) {
		contador = contador * num;
		}
		return contador;
	}
}
