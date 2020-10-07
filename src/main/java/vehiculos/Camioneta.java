package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	static int cantidadCamionetas;
	
	static {
		cantidadCamionetas ++;
	}
	
	public Camioneta(String placa,int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa,puertas,90, nombre, precio, peso, "4X4", fabricante);
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
	}
	

	@Override
	public Fabricante getFabricante() {
		// TODO Auto-generated method stub
		return super.getFabricante();
	}@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}@Override
	public String getPlaca() {
		// TODO Auto-generated method stub
		return super.getPlaca();
	}@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio();
	}@Override
	public int getPuertas() {
		// TODO Auto-generated method stub
		return super.getPuertas();
	}@Override
	public String getTraccion() {
		// TODO Auto-generated method stub
		return super.getTraccion();
	}@Override
	public int getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return super.getVelocidadMaxima();
	}public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}@Override
	public void setFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		super.setFabricante(fabricante);
	}@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}@Override
	public void setPeso(int peso) {
		// TODO Auto-generated method stub
		super.setPeso(peso);
	}@Override
	public void setPrecio(int precio) {
		// TODO Auto-generated method stub
		super.setPrecio(precio);
	}@Override
	public void setPlaca(String placa) {
		// TODO Auto-generated method stub
		super.setPlaca(placa);
	}@Override
	public void setPuertas(int puertas) {
		// TODO Auto-generated method stub
		super.setPuertas(puertas);
	}@Override
	public void setTraccion(String traccion) {
		// TODO Auto-generated method stub
		super.setTraccion(traccion);
	}@Override
	public void setVelocidadMaxima(int velocidadMaxima) {
		// TODO Auto-generated method stub
		super.setVelocidadMaxima(velocidadMaxima);
	}public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public boolean isVolco() {
		return volco;
	}

}
