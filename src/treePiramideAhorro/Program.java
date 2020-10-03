package treePiramideAhorro;

public class Program {

	public static void main(String[] args) 
	{
		TreeAfiliados afiliado1=new TreeAfiliados();
		afiliado1.valorInicial=1000;
		afiliado1.valorDescuentoPrcentaje=10;
		afiliado1.ValorPorcentaje=25;
		
		
		
		
		
		//se inicializo las variables que habiamos creado en el arbol
		
		
		//vamos a iniciaizar y crear un nodo 
		NodoAfiliados nodoEstudio = new NodoAfiliados();
		NodoAfiliados derecha =new NodoAfiliados();
		NodoAfiliados izqierda = new NodoAfiliados();
		//aqui creamos los nodos y los inizializamos
		nodoEstudio.derecha=derecha;
		nodoEstudio.izquierda=izqierda;
		
		
		afiliado1.root=nodoEstudio;;
		
		float resultado=afiliado1.balance(nodoEstudio);
		System.out.println("el valor total es: "+ resultado);//aqui le damos lectura al nodo
		
		
		float totalTodo = afiliado1.totalBalance(nodoEstudio);
		System.out.println("el resultado total es: " + totalTodo);
		
		float balnceMenor = afiliado1.sacarMenor(nodoEstudio);
		System.out.println("el menor es: " + balnceMenor);
		
		float balanceMayor = afiliado1.sacarMaroy(nodoEstudio);
		System.out.println("el mayor es: " +balanceMayor);

	}

}
