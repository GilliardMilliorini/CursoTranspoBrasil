package cursojava2;
// Dado que um ve�culo percorre uma distancia de 200 KM em 240 min. calcule a velocidade m�dia em km/h

public class ExercicioMat4 {
	public static void main(String [] args){
	int d = 200;
	int t = 240;
	int KM = t/60;
	System.out.println("Velocidade m�dia");
	System.out.printf("%d / %d = %d", d, KM, d / KM);
}
}
