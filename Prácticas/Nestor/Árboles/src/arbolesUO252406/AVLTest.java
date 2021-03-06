package arbolesUO252406;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AVLTest {

	
	AVLTree<Integer> tree;

	AVLTree<String> sT;
	
	@Before
	public void setUp() {
		tree = new AVLTree<Integer>();
		sT= new  AVLTree<String>();
	}

	/**
	 * Pruebas para el m�todo add
	 */
	@Test
	public void testAdd() {
		
		//Pruebas con enteros
		 assertEquals(true,tree.add(3));
		 assertEquals(true,tree.add(2));
		 assertEquals(true,tree.add(1));
		
		 assertEquals(true,tree.add(6));
		 assertEquals(true,tree.add(7));
		 assertEquals(true,tree.add(8));
		
		 //A�adir null
		 assertFalse(tree.add(null));
		 
		 //A�adir repetido
		 assertEquals(true,tree.add(8));
		 assertEquals(true,tree.add(6));
		 assertEquals(true,tree.add(7));
		
		 
		 //Pruebas con String
		 
		 assertTrue(sT.add("A"));
	     assertTrue(sT.add("D"));
	     assertTrue(sT.add("C")); 
	     
	     assertTrue(sT.add("M"));
	     assertTrue(sT.add("L"));
	     assertTrue(sT.add("H")); 
	     
	     assertTrue(sT.add("X"));
	     assertTrue(sT.add("Y"));
	     assertTrue(sT.add("Z")); 
	     
	     //A�adir null
		 assertFalse(sT.add(null));
		 
		 //A�adir repetido
		 assertTrue(sT.add("X"));
	     assertTrue(sT.add("Y"));
	     assertTrue(sT.add("Z")); 
	     
//		System.out.print(tree.toString());
	}
	

	/**
	 * Pruebas para el m�todo remove
	 */
	@Test
	public void removeTest(){
		
		//Pruebas con enteros
		assertTrue(tree.add(10));
		assertTrue(tree.add(8));
		assertTrue(tree.add(7));
		assertTrue(tree.add(23));
		assertTrue(tree.add(5));
		assertTrue(tree.add(9));
		assertTrue(tree.add(3));
		assertTrue(tree.add(2));
		assertTrue(tree.add(1));
		
		
	     //Borrar elementos que si existen
		assertTrue(tree.remove(1));
		assertTrue(tree.remove(5));
		assertTrue(tree.remove(9));
		
		//Eliminar nodos que no existen
		assertFalse(tree.remove(0));
		assertFalse(tree.remove(-23));
		assertFalse(tree.remove(45));
		
		//Eliminar null
		assertFalse(tree.remove(null));
		
		//Eliminar repetido
		assertTrue(tree.remove(23));
		assertFalse(tree.remove(23));
		
		
		//Pruebas con String
		
		 assertTrue(sT.add("A"));
	     assertTrue(sT.add("D"));
	     assertTrue(sT.add("C")); 
	     
	     assertTrue(sT.add("M"));
	     assertTrue(sT.add("L"));
	     assertTrue(sT.add("H")); 
	     
	     assertTrue(sT.add("X"));
	     assertTrue(sT.add("Y"));
	     assertTrue(sT.add("Z")); 
	     
	     //Borrar elementos que si existen
	     assertTrue(sT.remove("D"));
	     assertTrue(sT.remove("L"));
	     assertTrue(sT.remove("Y"));
		
		//Eliminar nodos que no existen
		assertFalse(sT.remove("STAR WARS"));
		assertFalse(sT.remove("N"));
		assertFalse(sT.remove("SOAD"));
		
		//Eliminar null
		 assertFalse(sT.remove(null));
		 
		//Eliminar repetido
			assertTrue(sT.remove("C"));
			assertFalse(sT.remove("C"));
		
//		System.out.print(tree.toString());
	}
		
	/**
	 * Pruebas para realizar 10 rotaciones simples a la izquierda al a�adir
	 */
	@Test
	public void test_10_RotacionesSimplesIzquierdaAdd () {
		assertTrue(tree.add(3000));
		assertTrue(tree.add(2000));
		assertTrue(tree.add(1000)); //Primera rotaci�n
		assertTrue(tree.add(3500));
		assertTrue(tree.add(2500));
		assertTrue(tree.add(1500));
		assertTrue(tree.add(500));
		assertTrue(tree.add(3300));
		assertTrue(tree.add(3200)); //Segunda Rotaci�n
		assertTrue(tree.add(2300));
		assertTrue(tree.add(2200)); //Tercera rotaci�n
		assertTrue(tree.add(1300));
		assertTrue(tree.add(1200)); //Cuarta rotaci�n
		assertTrue(tree.add(430));
		assertTrue(tree.add(420)); //Quinta rotaci�n
		assertTrue(tree.add(3450));
		assertTrue(tree.add(3400)); //Sexta rotaci�n
		assertTrue(tree.add(3150));
		assertTrue(tree.add(3100)); //S�ptima rotaci�n
		assertTrue(tree.add(2450));
		assertTrue(tree.add(2400)); //Octava rotaci�n
		assertTrue(tree.add(2150));
		assertTrue(tree.add(2100)); //Novena rotaci�n
		assertTrue(tree.add(1450));
		assertTrue(tree.add(1400)); //D�cima rotaci�n

		//Comprobamos que se hayan realizado 10 rotaciones simples a la izquierda
		assertEquals(10,tree.getRotacionesSimplesIzquierda()); 
		
		//Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0,tree.getRotacionesSimplesDerecha());	
		assertEquals(0,tree.getRotacionesDoblesDerecha());	
		assertEquals(0,tree.getRotacionesDoblesIzquierda());	
		
		
//		System.out.print(tree.toString());

	}

	/**
	 * Pruebas para realizar 10 rotaciones simples a la derecha al a�adir
	 */
	@Test
	public void test_10_RotacionesSimplesDerechaAdd() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(3500));
		assertTrue(tree.add(4000)); // Primera rotaci�n
		assertTrue(tree.add(200));
		assertTrue(tree.add(4500));
		assertTrue(tree.add(5000)); // Segunda rotaci�n
		assertTrue(tree.add(2500));
		assertTrue(tree.add(1500));
		assertTrue(tree.add(220));
		assertTrue(tree.add(230)); // Tercera rotaci�n
		assertTrue(tree.add(3200));
		assertTrue(tree.add(1700));
		assertTrue(tree.add(1200));
		assertTrue(tree.add(2700));
		assertTrue(tree.add(2800)); // Cuarta rotaci�n
		assertTrue(tree.add(3300));
		assertTrue(tree.add(3400)); // Quinta rotaci�n
		assertTrue(tree.add(4200));
		assertTrue(tree.add(4300)); // Sexta rotaci�n
		assertTrue(tree.add(5200));
		assertTrue(tree.add(5300)); // S�ptima rotacion
		assertTrue(tree.add(1800));
		assertTrue(tree.add(1900)); // Octava rotaci�n
		assertTrue(tree.add(1300));
		assertTrue(tree.add(1400)); // Novena rotaci�n
		assertTrue(tree.add(240));
		assertTrue(tree.add(250)); // D�cima rotaci�n

		// Comprobamos que se hayan realizado 10 rotaciones simples a la derecha
		assertEquals(10, tree.getRotacionesSimplesDerecha());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesIzquierda());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());
		assertEquals(0, tree.getRotacionesDoblesDerecha());

		// System.out.print(tree.toString());

	}


	/**
	 * Pruebas para realizar 10 rotaciones dobles a la izquierda al a�adir
	 */
	@Test
	public void test_10_RotacionesDoblesIzquierdaAdd() {
		assertTrue(tree.add(5000));
		assertTrue(tree.add(8000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(2000)); // Primera rotaci�n
		assertTrue(tree.add(6000));
		assertTrue(tree.add(7000)); // Segunda rotaci�n
		assertTrue(tree.add(500));
		assertTrue(tree.add(700)); // Tercera rotaci�n
		assertTrue(tree.add(2500));
		assertTrue(tree.add(2700)); // Cuarta rotaci�n
		assertTrue(tree.add(5500));
		assertTrue(tree.add(5700)); // Quinta rotaci�n
		assertTrue(tree.add(7500));
		assertTrue(tree.add(7700)); // Sexta rotaci�n
		assertTrue(tree.add(450));
		assertTrue(tree.add(470)); // S�ptima rotaci�n
		assertTrue(tree.add(800));
		assertTrue(tree.add(900)); // Octava rotaci�n
		assertTrue(tree.add(2400));
		assertTrue(tree.add(2450)); // Novena rotaci�n
		assertTrue(tree.add(2800));
		assertTrue(tree.add(2900)); // D�cima rotaci�n

		// Comprobamos que se hayan realizado 10 rotaciones dobles a la
		// izquierda
		assertEquals(10, tree.getRotacionesDoblesIzquierda());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesIzquierda());
		assertEquals(0, tree.getRotacionesSimplesDerecha());
		assertEquals(0, tree.getRotacionesDoblesDerecha());

		// System.out.print(tree.toString());
	}

	/**
	 * Pruebas para realizar 10 rotaciones dobles a la derecha al a�adir
	 */
	@Test
	public void test_10_RotacionesDoblesDerechaAdd() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(3500));
		assertTrue(tree.add(3300)); // Primera rotaci�n
		assertTrue(tree.add(1500));
		assertTrue(tree.add(500));
		assertTrue(tree.add(3700));
		assertTrue(tree.add(3600)); // Segunda rotaci�n
		assertTrue(tree.add(3200));
		assertTrue(tree.add(3100)); // Tercera rotaci�n
		assertTrue(tree.add(1700));
		assertTrue(tree.add(1600)); // Cuarta rotaci�n
		assertTrue(tree.add(570));
		assertTrue(tree.add(560)); // Quinta rotaci�n
		assertTrue(tree.add(3900));
		assertTrue(tree.add(3800)); // Sexta rotaci�n
		assertTrue(tree.add(3550));
		assertTrue(tree.add(3540)); // S�ptima rotaci�n
		assertTrue(tree.add(3250));
		assertTrue(tree.add(3240)); // Octava rotaci�n
		assertTrue(tree.add(1900));
		assertTrue(tree.add(1800)); // Novena rotaci�n
		assertTrue(tree.add(590));
		assertTrue(tree.add(580)); // D�cima rotaci�n

		// Comprobamos que se hayan realizado 10 rotaciones dobles a la derecha
		assertEquals(10, tree.getRotacionesDoblesDerecha());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesDerecha());
		assertEquals(0, tree.getRotacionesSimplesIzquierda());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());

		// System.out.print(tree.toString());
	}

	/**
	 * Pruebas para realizar 3 rotaciones simples a la izquierda  eliminando un nodo hijo desequilibrado
	 */
	@Test
	public void test_3_RotacionesSimplesIzquierdaRemoveHijoDesequilibrado() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(500));
		assertTrue(tree.add(4000));
		assertTrue(tree.add(1500));
		assertTrue(tree.add(300));
		assertTrue(tree.remove(3000)); // Primera rotaci�n
		assertTrue(tree.add(700));
		assertTrue(tree.add(5000));
		assertTrue(tree.add(200));
		assertTrue(tree.add(600));
		assertTrue(tree.add(400));
		assertTrue(tree.add(100));
		assertTrue(tree.remove(700)); // Segunda rotaci�n
		assertTrue(tree.add(1700));
		assertTrue(tree.add(1300));
		assertTrue(tree.add(1200));
		assertTrue(tree.remove(4000)); // Tercera rotaci�n

		// Comprobamos que se hayan realizado 3 rotaciones simples a la
		// izquierda
		assertEquals(3, tree.getRotacionesSimplesIzquierda());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesDerecha());
		assertEquals(0, tree.getRotacionesDoblesDerecha());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());

		// System.out.print(tree.toString());
	}

	/**
	 * Pruebas para realizar 3 rotaciones simples a la derecha  eliminando un nodo hijo desequilibrado
	 */
	@Test
	public void test_3_RotacionesSimplesDerechaRemoveHijoDesequilibrado() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(500));
		assertTrue(tree.add(4000));
		assertTrue(tree.add(2500));
		assertTrue(tree.add(5000));
		assertTrue(tree.remove(1000)); // Primera rotaci�n
		assertTrue(tree.add(3500));
		assertTrue(tree.add(300));
		assertTrue(tree.add(2700));
		assertTrue(tree.add(2400));
		assertTrue(tree.add(7000));
		assertTrue(tree.add(2800));
		assertTrue(tree.remove(500)); // Segunda rotaci�n
		assertTrue(tree.add(3300));
		assertTrue(tree.add(4500));
		assertTrue(tree.add(8000));
		assertTrue(tree.remove(3500)); // Tercera rotaci�n

		// Comprobamos que se hayan realizado 3 rotaciones simples a la derecha
		assertEquals(3, tree.getRotacionesSimplesDerecha());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesIzquierda());
		assertEquals(0, tree.getRotacionesDoblesDerecha());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());

		// System.out.print(tree.toString());
	}

	/**
	 * Pruebas para realizar 3 rotaciones dobles a la izquierda  eliminando un nodo 
	 */
	@Test
	public void test_3_RotacionesDoblesIzquierdaRemove() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(500));
		assertTrue(tree.add(4000));
		assertTrue(tree.add(1500));
		assertTrue(tree.add(1400));
		assertTrue(tree.remove(4000)); // Primera rotaci�n
		assertTrue(tree.add(1300));
		assertTrue(tree.remove(2000)); // Segunda rotaci�n
		assertTrue(tree.add(1200));
		assertTrue(tree.remove(1500)); // Tercera rotaci�n

		// Comprobamos que se hayan realizado 3 rotaciones dobles a la izquierda
		assertEquals(3, tree.getRotacionesDoblesIzquierda());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesDerecha()); 
		assertEquals(0, tree.getRotacionesSimplesIzquierda());
		assertEquals(0, tree.getRotacionesDoblesDerecha());

	//	System.out.print(tree.toString());
	}

	
	/**
	 * Pruebas para realizar 3 rotaciones dobles a la derecha  eliminando un nodo 
	 */
	@Test
	public void test_3_RotacionesDoblesDerechaRemove() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(3500));
		assertTrue(tree.add(500));
		assertTrue(tree.add(2500));
		assertTrue(tree.add(2700));
		assertTrue(tree.remove(1000)); // Primera rotaci�n
		assertTrue(tree.add(2800));
		assertTrue(tree.remove(2000)); // Segunda rotaci�n
		assertTrue(tree.add(2900));
		assertTrue(tree.remove(2500)); // Tercera rotaci�n

		// Comprobamos que se hayan realizado 3 rotaciones dobles a la derecha
		assertEquals(3, tree.getRotacionesDoblesDerecha());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesIzquierda()); 
		assertEquals(0, tree.getRotacionesSimplesDerecha());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());

	//	System.out.print(tree.toString());
	}

	/**
	 * Pruebas para realizar 3 rotaciones simples a la izquierda  eliminando un nodo hijo equilibrado
	 */
	@Test
	public void test_3_RotacionesSimplesIzquierdaHijoEquilibrado() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(500));
		assertTrue(tree.add(1500));
		assertTrue(tree.remove(3000)); // Primera rotaci�n
		assertTrue(tree.remove(1500)); 
		assertTrue(tree.add(700));
		assertTrue(tree.add(400));
		assertTrue(tree.remove(2000)); // Segunda rotaci�n
		assertTrue(tree.remove(700)); 
		assertTrue(tree.add(450));
		assertTrue(tree.add(300));
		assertTrue(tree.remove(1000)); // Tercera rotaci�n

	//	 System.out.print(tree.toString());

		// Comprobamos que se hayan realizado 3 rotaciones simples a la
		// izquierda
		assertEquals(3, tree.getRotacionesSimplesIzquierda());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesDerecha());
		assertEquals(0, tree.getRotacionesDoblesDerecha());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());

		// System.out.print(tree.toString());
	}


	/**
	 * Pruebas para realizar 3 rotaciones simples a la derecha  eliminando un nodo hijo equilibrado
	 */
	@Test
	public void test_3_RotacionesSimplesDerechaHijoEquilibrado() {
		assertTrue(tree.add(2000));
		assertTrue(tree.add(3000));
		assertTrue(tree.add(1000));
		assertTrue(tree.add(500));
		assertTrue(tree.add(4000));
		assertTrue(tree.add(2500));
		assertTrue(tree.remove(500));
		assertTrue(tree.remove(1000));	// Primera rotaci�n
		assertTrue(tree.remove(2500));
		assertTrue(tree.add(3500));
		assertTrue(tree.add(4500));
		assertTrue(tree.remove(2000));  // Segunda rotaci�n
		assertTrue(tree.remove(3500));
		assertTrue(tree.add(4400));
		assertTrue(tree.add(4700));
		assertTrue(tree.remove(3000)); // Tercera rotaci�n
		
		
//		 System.out.print(tree.toString());

		// Comprobamos que se hayan realizado 3 rotaciones simples a la derecha
		assertEquals(3, tree.getRotacionesSimplesDerecha());

		// Comprobamos que no se haya hecho ninguna rotaci�n m�s
		assertEquals(0, tree.getRotacionesSimplesIzquierda());
		assertEquals(0, tree.getRotacionesDoblesDerecha());
		assertEquals(0, tree.getRotacionesDoblesIzquierda());

		
	}


}
