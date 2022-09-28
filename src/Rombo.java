
public class Rombo implements FigurasGeometricas{
	private String name;
	private double lado;
 	private double mayor;
 	private double menor;
	public Rombo(String name, double lado, double mayor, double menor) {
		super();
		this.name = name;
		this.lado = lado;
		this.mayor = mayor;
		this.menor = menor;
	} // Constructor
	
	public double calcularArea() {
		return (4*getLado());
	} // calcularArea
	
	public double calcularPerimetro() {
		return (getMayor() * getMenor())/2;
	} // calcularPerimetro
	
	
	public String getName() {
		return name;
	} //getName
	public void setName(String name) {
		this.name = name;
	} //setName
	public double getLado() {
		return lado;
	} //getLado
	public void setLado(double lado) {
		this.lado = lado;
	} //setLado
	public double getMayor() {
		return mayor;
	} //getMayor
	public void setMayor(double mayor) {
		this.mayor = mayor;
	} //setMayor
	public double getMenor() {
		return menor;
	} //getMenor
	public void setMenor(double menor) {
		this.menor = menor;
	} //setMenor
	
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", mayor=" + mayor + ", menor=" + menor + "]";
	} // toString
	
	
 	
	
	

}
