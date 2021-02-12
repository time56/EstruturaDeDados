public class Arranjo {
	
	int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		
	public int soma() {
		int soma = 0;
		int i;

		for(i=0; i < a.length; i++) {
			soma = soma + a[i]; 
		}
		
		return soma;
	}
	
	public Integer maior() {
		int maior = 0;
		
		for(int i = 0; i <a.length; i++) {
			if(a[i] > maior) {
				maior = a[i];
			}
		}
		return maior;
	}	
	
	public Integer menor() {
		int menor = 0;
		
		for(int i = 0; i <a.length; i++) {
			if(i==0) {
				menor=a[i];
			}else {
				if(a[i]<menor) {
					menor = a[i];
				}
			}
		}		
		return menor;
	}
	
	public Integer repeticoes(int item) {
		int contador = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == item) {
				contador += 1;
			}
		}
		return contador;
	}
}

