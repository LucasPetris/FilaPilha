package atividade;

import java.io.IOException;
import java.util.Scanner;

public class PilhaJava {

	public static void main(String[] args) throws IOException {
		double Altura[] = new double [10];
		int Largura[] = new int [10];
		int Posicao[] = new int [10];
		int Aux[] = new int[10];
		int Caixa[] = new int [10];
		char Fragil[] = new char[10];
		int Digito, N = 0, P, Desempilha;
		
		Scanner Entrada = new Scanner(System.in);
		
		do {
			System.out.println("[1] para Adicionar Caixas no Palete" + "\n"
					+ "[2] para Empilhar as caixas" + "\n"
					+ "[3] para Desempilhar" + "\n"
					+ "[4] para sair do Programa");
					Digito = Entrada.nextInt();
			
		
		if (Digito == 1) {
						for(int i = 0;i < 10;i ++) {
					
			System.out.println("Digite a identifica��o da caixa [ID01], [ID02]...");
			Caixa[i] = Entrada.nextInt();
			System.out.println("Digite a Altura da Caixa: ");
			Altura[i] = Entrada.nextDouble();
			System.out.println("Digite a Largura da Caixa: ");
			Largura[i] = Entrada.nextInt();
			System.out.println("A caixa � Fragil ou N�o? [S] ou [N]: ");
			Fragil[i] = (char)System.in.read();
						}
						
						for(int i = 0; i < 10; i++) {
							System.out.println("Caixas Adicionadas: " + Caixa[i] + "\n"
									+ "Altura: " + Altura[i] + "\n"
									+ "Largura: " + Largura[i] + "\n"
									+ "Fragil? " + Fragil[i]);
							System.out.println("--------------------------------------");
						}
						
		}
		
		if (Digito == 2) {
		
					for(int i = 0;i < 1; i++) {
						if (Caixa[i] < 1 && Altura[i] < 1 && Largura[i] < 1) {
							System.out.println("N�o h� caixas para Empilhar!");
						break;
					 }
					}
					
					for(int i = 0;i < 10; i++) {
					System.out.println("Digite a numera��o da Caixa que voc� quer Empilhar: ");
					Caixa[i] = Entrada.nextInt();
					System.out.println("Digite em qual posi��o essa Caixa deve ficar: ");
					Posicao[i] = Entrada.nextInt();
					}
					
					for(int i = 0;i < 10; i++) {
						if (Caixa[N] != 0) {
					System.out.println("CAIXA ID" + "[" + Caixa[i] + "]" + " empilhada!");
					System.out.println("POSI��O: " + Posicao[i]);
					System.out.println("--------------------------------------");
				} else {
					System.out.println("N�o existe esse numero de Caixa para Empilhar!");
				}
			}
		}
			
		
		if (Digito == 3) {
			System.out.println("Digite o Numero da Caixa que deve ser Desempilhada: ");
			Desempilha = Entrada.nextInt();
			for(int i = 0; i < 1; i++) {
			if (Desempilha == Caixa[i]) {
				System.out.println("Caixa " + Caixa[i] + " foi desempilhada!");
				}
			}
			
			for(int i = 0; i < 10; i++) {
				if (Caixa[i] != Desempilha) {
				System.out.println("SITUA��O DA PILHA:" + "\n"
				+ "CAIXA -> " + Caixa[i] + "\n"
				+ "Posi��o: " + Posicao[i]);
				}
			}
		}
			
		
		} while (Digito < 4);
	}
}


