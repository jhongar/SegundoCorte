package treeEstudiantes;

public class Estudiantes 
{
	NodoSalon root;
	
	 void listadoEstudiantes() 
	{
		root=new NodoSalon();
		root.nombre="salon";
		
		root.mujeresIzquierda=new NodoSalon();
		root.mujeresIzquierda.nombre="luisa";
		
		root.mujeresIzquierda.mujeresDerecha=new NodoSalon();
		root.mujeresIzquierda.mujeresDerecha.nombre="paola";
		
		root.mujeresIzquierda.mujeresIzquierda=new NodoSalon();
		root.mujeresIzquierda.mujeresIzquierda.nombre="yess";
		
		root.mujeresIzquierda.mujeresIzquierda.mujeresIzquierda=new NodoSalon();
		root.mujeresIzquierda.mujeresIzquierda.mujeresIzquierda.nombre="nicol";
		
		root.mujeresIzquierda.mujeresIzquierda.mujeresDerecha=new NodoSalon();
		root.mujeresIzquierda.mujeresIzquierda.mujeresDerecha.nombre="daniela";
		
		
		
		
		
		
		
		root.hombresDerecha=new NodoSalon();
		root.hombresDerecha.nombre="pedro";
		
		root.hombresDerecha.hombresIzquierda=new NodoSalon();
		root.hombresDerecha.hombresIzquierda.nombre="juan";
		
		root.hombresDerecha.hombresIzquierda.hombresIzquierda=new NodoSalon();
		root.hombresDerecha.hombresIzquierda.hombresIzquierda.nombre="steban";
		
		root.hombresDerecha.hombresIzquierda.mujeresDerecha=new NodoSalon();
		root.hombresDerecha.hombresIzquierda.mujeresDerecha.nombre="pepito";
		
		root.hombresDerecha.hombresDerecha=new NodoSalon();
		root.hombresDerecha.hombresDerecha.nombre="cristian";
		
		root.hombresDerecha.hombresDerecha.hombresDerecha=new NodoSalon();
		root.hombresDerecha.hombresDerecha.hombresDerecha.nombre="luis";
		
		root.hombresDerecha.hombresDerecha.hombresDerecha.hombresDerecha=new NodoSalon();
		root.hombresDerecha.hombresDerecha.hombresDerecha.hombresDerecha.nombre="pepito";
	}

	 
	 public void llamado(NodoSalon Nodo) 
	 {
		 if (Nodo!=null)//caso base
		 {
			 System.out.println(Nodo.nombre);
			 llamado(Nodo.mujeresIzquierda);
			 llamado(Nodo.mujeresDerecha);
			 llamado(Nodo.hombresDerecha);
			 llamado(Nodo.hombresIzquierda);
		 }
		 
		
	}
	 public void llamado() 
	 {
		llamado(root);
	}
	 
}
