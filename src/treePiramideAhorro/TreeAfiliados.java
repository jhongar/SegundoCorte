package treePiramideAhorro;

public class TreeAfiliados 
{
	float valorDescuentoPrcentaje;//10%
	float ValorPorcentaje;//25%
	float valorInicial;//1000
	
	NodoAfiliados root;
	
	public float balance(NodoAfiliados nodo)
	{
		if (nodo==null)
		{
			return 0;
		}
		
		float balanceNodoInquierdo=balance(nodo.izquierda);//aqui sacamos el balance de cada nodo pero de los hijos
		balanceNodoInquierdo=balanceNodoInquierdo*(ValorPorcentaje/100);
		  
		float balanceNodoDerecho=balance(nodo.derecha);
		balanceNodoDerecho=balanceNodoDerecho*(ValorPorcentaje/100);
		
		return
				(valorInicial-(valorInicial*valorDescuentoPrcentaje)/100) + balanceNodoDerecho + balanceNodoInquierdo;
					//calculamos el valor total de un nodo, con sus respectivos hijos
	}
	
	
	
		public float totalBalance(NodoAfiliados nodo)
		{
			return balance(root)+balance(nodo.derecha)+balance(nodo.izquierda);
		}
	
	
		public float sacarMenor(NodoAfiliados nodo)
		{
			if (root.derecha!=null)
				if (root.izquierda!=null)
					
			{
					return Math.min(balance(root), Math.min(balance(root.derecha), balance(root.izquierda)));
			}
			
			if (root.derecha!=null)
			{
				return Math.min(balance(root), balance(root.derecha));
			}
			return balance(root);
		}
	
		public float sacarMaroy(NodoAfiliados nodo)
		{
			if (root.derecha!=null)
				if (root.izquierda!=null)
					
			{
					return Math.max(balance(root), Math.max(balance(root.derecha), balance(root.izquierda)));
			}
			
			if (root.derecha!=null)
			{
				return Math.max(balance(root), balance(root.derecha));
			}
			return balance(root);
		}
	
}
