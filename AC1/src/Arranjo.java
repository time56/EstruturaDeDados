public class Arranjo {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
	}

	
	public Integer menor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer maior() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int soma() {
		int soma = 0;
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		int i;

		for(i=0; i < a.length; i++) {
			soma = soma + a[i]; 
		}
		
		return soma;
	}

	public Integer repeticoes(int item) {
		int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940}
		int contador = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == item) {
				contador += 1
			}
		}
		return contador;
	}
}
