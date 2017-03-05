package Lista_Duplamente_Encadeada;

public class Lista {
	No primeiro = new No();
	int tamanho = 1;
	
	void iniciarLista(int valor){
		this.primeiro.setValores(valor, null, null);
	}
	
	No inner_get(int indice){
		if (indice < 0 || indice > this.tamanho - 1){
			return null;
		} else {
			No no_atual = this.primeiro;
			while (indice > 0){
				no_atual = no_atual.proximo;
				indice -= 1;
			}
			return no_atual;
		}
	}
	
	void append(int valor){
		if (primeiro.nulo){
			this.iniciarLista(valor);
		} else {
			No ultimo_no = this.inner_get(this.tamanho - 1);
			No novo_no = new No();
			novo_no.setValores(valor, ultimo_no, null);
			ultimo_no.proximo = novo_no;
			this.tamanho += 1;
		}
	}
	
	No inner_pop(int indice){
		if (indice < 0 || indice > this.tamanho - 1){
			return null;
		} else {
			No no_atual = this.inner_get(indice);
			
			if (no_atual.anterior != null){
				no_atual.anterior = no_atual.proximo;
			}
			
			if (no_atual.proximo != null){
				no_atual.proximo = no_atual.anterior;
			}
			
			this.tamanho -= 1;
			return no_atual;
		}
	}
	
	int get(int indice){
		No no = this.inner_get(indice);
		
		if (no == null){
			return -1;
		}
		
		return no.valor;
	}
	
	int pop(int indice){
		No no = this.inner_pop(indice);
		
		if (no == null){
			return -1;
		}
		
		return no.valor;
	}
	
	void imprimirTodos(){
		int indice = 0;
		while (indice < this.tamanho){
			System.out.print(this.get(indice) + ", ");
			indice++;
		}
		
		System.out.print("\n");
	}
}