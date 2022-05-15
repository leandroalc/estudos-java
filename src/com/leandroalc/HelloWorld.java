package com.leandroalc;

import com.leandroalc.model.Gato;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		
		Gato gato  = new Gato();
		
		gato.setNome("Cloe");
		
		System.out.println(gato.getNome());
	}

}
