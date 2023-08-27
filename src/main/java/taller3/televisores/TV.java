package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	//constructor
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	//metodo set
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	//metodo get
	public Marca getMarca(){
		
		return marca;
	}
	
	//metodo set
	public void setCanal(int canal) {
		if (this.getEstado() == true && canal >=1 && canal <= 120) {
			this.canal = canal;
		}
	}
	//metodo get
	public int getCanal(){
		
		return canal;
	}
	
	//metodo set
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//metodo get
	public int getPrecio(){
		
		return precio;
	}
	
	//metodo set
	public void setVolumen(int volumen) {
		if (this.estado == true && this.volumen >= 0 && this.volumen <= 7) {
			this.volumen = volumen;
		}
		
	}
	//metodo get
	public int getVolumen(){
		
		return volumen;
	}	
	//metodo set
	public void setControl(Control control) {
		this.control = control;
	}
	//metodo get
	public Control getControl(){
		
		return control;
	}
	
	//metodo set
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	//metodo get
	public static int getNumTV(){
		
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		this.setCanal(this.canal + 1);
		}

	public void canalDown(){
		this.setCanal(this.canal - 1);
		}
	
	public void volumenUp() {
		this.setVolumen(this.volumen + 1);
	}
	public void volumenDown() {
		this.setVolumen(this.volumen - 1);
	}
	
}