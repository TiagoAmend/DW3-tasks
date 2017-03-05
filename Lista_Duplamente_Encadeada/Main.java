package Lista_Duplamente_Encadeada;

public class Main {
	public static void main(String[] args){
		Lista lista = new Lista();
		lista.append(150);
		lista.append(300);
		lista.append(450);

		lista.imprimirTodos(); // 150, 300, 450,
		
		System.out.println(lista.get(2)); // 450
		System.out.println(lista.pop(2)); // 450
		lista.imprimirTodos(); // 150, 300
		System.out.println(lista.get(2)); // -1
	}
}