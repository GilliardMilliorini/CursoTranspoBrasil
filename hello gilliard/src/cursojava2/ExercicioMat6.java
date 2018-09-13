package cursojava2;
//Utilizando a classe Math, crie um programa ue calcule e apresente o maior numero entre 10, 20 e 15

public class ExercicioMat6 {
	public static void model(String[] args){
		int a = 10;
		int b = 20;
		int c = 15;
		//pode ser feito também do jeito :  int result = Math.max(a, b);
		//									result = Math.max(result, c);
		
		
		System.out.println("MAIOR NUMERO É: ");
		System.out.printf("%d, %d, %d = %d", a, b, c, Math.max(Math.max(a, b), c));
	}

}
