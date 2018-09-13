package cursojava2;
// Dado um circulo de 30 cm de diametro calcule e apresente o valor da area desse circulo

public class ExercícioMat2 {
	public static void main(String[] args){
		int d = 30;
		double p = 3.14;
		double r = d / 2.0;
		System.out.println("Área do circulo");
		System.out.printf("%f * %f  * %f = %f",p, r,r, p * Math.pow(r, 2));
	}

}
