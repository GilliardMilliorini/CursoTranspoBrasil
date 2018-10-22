package br.com.cursojava009;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double[][] turma = new double[10][3];  			//fna o entendi como faz
		double [] medias = new double [turma.length];
		double mediaGeral = 0;
					
		for(int aluno = 0; aluno < turma.length; aluno++){
			for(int nota = 0;nota < turma[aluno].length; nota++){
			System.out.printf("Digite a %d nota do aluno %d:\n", nota+1, aluno+1);
			turma[aluno][nota] = Double.parseDouble(teclado.next());
			medias[aluno] += turma[aluno][nota];
			mediaGeral += turma[aluno][nota];
			
			}
		medias[aluno] /= turma[aluno].length;	
		} 
		mediaGeral /= turma.length * turma[0].length;
	
		for(int aluno = 0; aluno < turma.length; aluno++){
	System.out.printf("As notas do aluno %d foram :\n", aluno+1);
	for(int nota = 0;nota < turma[aluno].length; nota++){
		System.out.printf("%.2f ", turma[aluno][nota]);
	}
	System.out.println("sua media foi : "+ medias[aluno]);
}
		teclado.close();
	}
	
}

// Escreva um programa que solicite 3 notas para uma turma de 10 alunos e em
// seguida calcule a média de cada aluno juntamente com a
// media da turma ao final o programa deve apresentar as 3 notas do aluno
// juntamente com sua média e posteriormente apresentar a
// media final da turma.