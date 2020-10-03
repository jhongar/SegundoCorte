package treeEnteros;

public class LecturaArbol 
{
	NodoInt root;

	void creacionArbol()
	{//-----------------------ramas del lado IZQUIERDO-------------------------
		
		 root=new NodoInt();//creacion del nodo root
		 root.valor=15;
		 
		 root.left=new NodoInt();//creacion de los nodos
		 root.left.valor=10;//inicializacion de los nodos
		 
		 root.left.left=new NodoInt();
		 root.left.left.valor=8;
		 
		 root.left.right=new NodoInt();
		 root.left.right.valor=3;
		 
		 root.left.right.left=new NodoInt();
		 root.left.right.left.valor=61;
		 
		 //----------------------ramas del lado DERECHO-------------------------
		 
		 root.right=new NodoInt();//creacion de los nodos
		 root.right.valor=7;//inicializacion de los nodos
		 
		 root.right.right=new NodoInt();
		 root.right.right.valor=47;
		 
		 root.right.right.right=new NodoInt();
		 root.right.right.right.valor=14;
		 
		 root.right.right.left=new NodoInt();
		 root.right.right.left.valor=91;
		
	}
	
	public void llamar(NodoInt node) 
	{
		if (node !=null)
		{
			System.out.println(node.valor);
			llamar(node.left);
			llamar(node.right);
		}
	}
	public void llamar()
	{
		llamar(root);
	}
	
	
	
	
	
}
