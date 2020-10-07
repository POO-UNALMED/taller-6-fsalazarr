package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int cantidadVehiculos;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	

	public Vehiculo(String placa,int puertas,int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		paises.add(fabricante.pais);
		fabricantes.add(fabricante);
		cantidadVehiculos ++;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public void vehiculosPorTipo() {
		System.out.println("Automoviles: "+Automovil.cantidadAutomoviles);
		System.out.println("Camionetas: "+Camioneta.cantidadCamionetas);
		System.out.println("Camiones: "+Camion.cantidadCamiones);
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}public void setNombre(String nombre) {
		this.nombre = nombre;
	}public void setPeso(int peso) {
		this.peso = peso;
	}public void setPlaca(String placa) {
		this.placa = placa;
	}public void setPrecio(int precio) {
		this.precio = precio;
	}public void setPuertas(int puertas) {
		this.puertas = puertas;
	}public void setTraccion(String traccion) {
		this.traccion = traccion;
	}public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}public Fabricante getFabricante() {
		return fabricante;
	}public String getNombre() {
		return nombre;
	}public int getPeso() {
		return peso;
	}public String getPlaca() {
		return placa;
	}public int getPrecio() {
		return precio;
	}public int getPuertas() {
		return puertas;
	}public String getTraccion() {
		return traccion;
	}public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
}
