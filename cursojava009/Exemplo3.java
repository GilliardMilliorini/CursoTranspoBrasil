package br.com.cursojava009;

public class Exemplo3 {
	
	public static void main(String[] args) {
		
		int[][] item = new int[4][4];
		item [0][0] = 100 ;
		item [0][1] = 200 ;
		item [0][2] = 150 ;
		item [1][0] = 75 ;
		item [1][1] = 260 ;
		item [1][2] = 100 ;
		item [2][0] = 150 ;
		item [2][1] = 200 ;
		item [2][2] = 250 ;
		item [3][0] = 50 ;
		item [3][1] = 210 ;
		item [3][2] = 240 ;
		int totalMeias = 0; 
		int []pecasMes = new int [item.length]; 
		int	total = 0;
		int meia = 0;
		int camisa = 1;
		int camiseta = 2;
		
		for (int mes = 0; mes <item.length; mes++){									// desisti no meio, professor n dava tempo pra copiar
			for (int tipo = 0; tipo < item[mes].length; tipo++){
					total += item [mes][tipo] ;						
			if(tipo == meia){
				totalMeias += item[mes][tipo];
				
				}	
			}		
		}
		
		System.out.println(" quantidade de pe�as vendidas �:  "+ total);
		System.out.println("");
		System.out.println("Quantidade de meias vendidas foi "+ totalMeias);
	
	System.out.println("");
	
		for (int mes = 0; mes <item.length; mes++){
			for (int tipo = 0; tipo < item[mes].length; tipo++){
					pecasMes += item [mes][tipo] ;						
			if(tipo == meia){
				totalMeias += item[mes][tipo];
	}
	
	
		
		//System.out.println("A quantidade de pe�as vendidas mes a mes �: ",);
		//System.out.println(" a quantidade de camisas + a quantidade de camisetas vendidas mes a mes �");
		//System.out.println(" o tipo de pe�a mais vendido em cada mes � : "); 
	}
		}
	}
}
	


 /* Data a tabela abaixo:
	
		meias camisas camisetas
Jan		100		200		150
Fev		75		260		100
Mar		150		200		250
Abr		50		210		240

calcule as seguintes opera��es:
a) A quantidade de pe�as vendidas
b) A quantidade de meias vendidas
c) A quantidade de pe�as vendidas mes a mes
d)A quantidade de camisas + a quantidade de camisetas vendidas mes a mes
e) O tipo de pe�a mais vendido em cada mes

*/