package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.lang.Math;

public class Programa_1A {
	
	private static int N, K, NC;
	private static double DC, MC, DT, MT;
	private static ArrayList<Integer> P;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Le os tamanhos
		N = s.nextInt();
		K = s.nextInt();
	
		//Cria o array de tamanho N
		P = new ArrayList<Integer>();
		
		//Le os valores
		for(int i = 0; i < N; i++) { 
			P.add(s.nextInt());
		}
	
		//Calcula os valores
		calcula();
	}
	
	//Usado para testar a funcao calcula sem usar entrada e saida
	public static String teste(int _N, int _K, ArrayList<Integer> _P) {
		
		N = _N;
		K = _K;
		P = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++)
			P.add(_P.get(i).intValue());
		
		calcula();
		
		String sNC = String.format("%d ", NC);
		String sDC = String.format(Locale.US, "%.2f ", DC);
		String sMC = String.format(Locale.US, "%.2f ", MC);
		String sDT = String.format(Locale.US, "%.2f ", DT);
		String sMT = String.format(Locale.US, "%.2f", MT);
	
		return sNC + sDC + sMC + sDT + sMT;
	}
	
	public static void calcula() {
		
		//Ordena os valores
		Collections.sort(P, Collections.reverseOrder());
	
		//Inicializa os valores
		NC = K;
		DC = 0;
		MC = 0;
		DT = 0;
		MT = 0;
		
		//Calcula o numero de classificados
		for(int i = K; i < N; i++) {
			if(P.get(K - 1).intValue() != P.get(i).intValue()) 
				break;
			NC++;
		}
		
		//Calcula medias
		for(int i = 0; i < N; i++) {
			if(i < NC)
				MC += P.get(i);
			MT += P.get(i);
		}
		
		MC /= NC;
		MT /= N;
		
		//Calcula Desvios padrao
		for(int i = 0; i < N; i++) {
			if(i < NC)
				DC += (P.get(i) - MC) * (P.get(i) - MC);
			DT += (P.get(i) - MT) * (P.get(i) - MT);
		}
		
		DC = Math.sqrt(DC/NC);
		DT = Math.sqrt(DT/N);
		
		
		//Imprime os resultados
		System.out.printf("%d\n", NC);
		System.out.printf(Locale.US, "%.2f\n", DC);
		System.out.printf(Locale.US, "%.2f\n", MC);
		System.out.printf(Locale.US, "%.2f\n", DT);
		System.out.printf(Locale.US, "%.2f\n", MT);
	}
}
