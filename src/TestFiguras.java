public class TestFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Cuadrado c1", 40.0);
		Rectangulo r1 = new Rectangulo("Rectángulo r1", 20.0, 40.0);
		Rombo rom1 = new Rombo("Rombo rom1", 20.0, 40.0, 30.0);
		Romboide roide1 = new Romboide("Romboide roide1", 20.0, 40.0);
		Trapecio tr1 = new Trapecio("Trapecio tr1", 20.0, 40.0, 20.0, 80.0, 20.0, 20.0, 40.0);
		
		TestFiguras.printReceipt(t1);
		TestFiguras.printReceipt(t2);
		TestFiguras.printReceipt(c1);
		TestFiguras.printReceipt(r1);
		TestFiguras.printReceipt(rom1);
		TestFiguras.printReceipt(roide1);
		TestFiguras.printReceipt(tr1);
		
	} // main
	
	
	public static void printReceipt(FigurasGeometricas e) {
		System.out.println(e);
		System.out.println("==============================");
		System.out.println("| El área de ["+e.getName()+"] es: " + e.calcularArea() +
				"\n" + "| El perímetro de ["+e.getName()+"] es: " + e.calcularPerimetro());
		System.out.println("==============================");
	} // imprimirCalculo
	
} // class testFiguras
