package main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Teste {

	private int N, K;
	private ArrayList<Integer> P;
	
	@Test
	void Caminho_C2() {
		N = 1;
		
		K = 1;
		
		P = new ArrayList<Integer>();
		P.add(1);
	
		String res = Programa_1A.teste(N, K, P);
		
		assertEquals(res, "1 0.00 1.00 0.00 1.00");
	}
	
	@Test
	void Caminho_C3() {
		N = 2;
		K = 1;
		
		P = new ArrayList<Integer>();
		
		P.add(1);
		P.add(2);
	
		String res = Programa_1A.teste(N, K, P);
		
		assertEquals(res, "1 0.00 2.00 0.50 1.50");
	}
	
	@Test
	void Teste_Folha1() {
		N = 10;
		K = 3;
		
		P = new ArrayList<Integer>();
		
		P.add(1);
		P.add(2);
		P.add(3);
		P.add(4);
		P.add(5);
		P.add(5);
		P.add(4);
		P.add(3);
		P.add(2);
		P.add(1);
	
		String res = Programa_1A.teste(N, K, P);
		
		assertEquals(res, "4 0.50 4.50 1.41 3.00");
	}
	
	@Test
	void Teste_Folha2() {
		N = 5;
		K = 2;
		
		P = new ArrayList<Integer>();
		
		P.add(500);
		P.add(500);
		P.add(500);
		P.add(500);
		P.add(500);
	
		String res = Programa_1A.teste(N, K, P);
		
		assertEquals(res, "5 0.00 500.00 0.00 500.00");
	}
	
	@Test
	void Teste_Extra1() {
		N = 5;
		K = 4;
		
		P = new ArrayList<Integer>();
		
		P.add(400);
		P.add(500);
		P.add(500);
		P.add(500);
		P.add(500);
	
		String res = Programa_1A.teste(N, K, P);
		
		assertEquals(res, "4 0.00 500.00 40.00 480.00");
	}
	
	@Test
	void Teste_Extra2() {
		N = 5;
		K = 2;
		
		P = new ArrayList<Integer>();
		
		P.add(600);
		P.add(500);
		P.add(500);
		P.add(500);
		P.add(500);
	
		String res = Programa_1A.teste(N, K, P);
		
		assertEquals(res, "5 40.00 520.00 40.00 520.00");
	}
	
	
	
	

}
