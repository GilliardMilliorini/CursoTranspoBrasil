package cursojava2;
// Dado as notas 10, 7, 5, 9, 10, 7, 8, 10 ,10, 10. calcule e apresente a soma e a media das notas

public class ExercicioMat3 {
	public static void main(String[] args){
	int n1 = 10;
	int n2 = 7;
	int n3 =5;
	int n4 = 9;
	int n5 = 10;
	int n6 = 7;
	int n7 = 8;
	int n8 = 10;
	int n9 = 10;
	int n10 = 10;
	double media = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10; 
	System.out.println("Soma das Notas");
	System.out.printf("%d +%d +%d +%d +%d +%d +%d +%d +%d +%d = %d\n ", n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
	System.out.println("Média das notas");
	System.out.printf("%f = %f", media, media/10);

	
	}
}