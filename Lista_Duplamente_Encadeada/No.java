package Lista_Duplamente_Encadeada;

public class No {
	int valor;
	No anterior;
	No proximo;
	boolean nulo = true;
	
	void setValores(int valor, No anterior, No proximo){
		this.valor = valor;
		this.anterior = anterior;
		this.proximo = proximo;
		this.nulo = false;
	}
}