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
		this.canal = canal;
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
		this.volumen = volumen;
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
		if (this.estado == true && this.canal >= 1 && this.canal < 120){
			
			this.canal++;

		}

	}
	public void canalDown(){
		if (this.estado == true && this.canal > 1 && this.canal <= 120) {
			
			this.canal--;
			

		}
	}
	
	public void volumenUp() {
		if (this.estado == true) {
			if (this.volumen >= 0 && this.volumen <=6) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		if (this.estado == true) {
			if (this.volumen <=7 && this.volumen >=1) {
				this.volumen--;
			}
		}
	}
	
}