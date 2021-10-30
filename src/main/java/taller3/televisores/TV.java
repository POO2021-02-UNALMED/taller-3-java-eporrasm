package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.canal = 1;
		this.precio = 500;
		this.estado = estado;
		this.volumen = 1;
		numTV++;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (estado && canal<120) {
			canal ++;
		}
	}
	public void canalDown() {
		if (estado && canal>1) {
			this.canal --;
		}
	}
	public void volumenUp() {
		if (estado && volumen<7) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if (estado && volumen>0) {
			volumen --;
		}
	}
}