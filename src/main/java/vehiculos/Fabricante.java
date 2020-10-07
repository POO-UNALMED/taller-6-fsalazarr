package vehiculos;

import java.util.Collections;

public class Fabricante {
	String nombre;
	Pais pais;
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public Fabricante() {
		// TODO Auto-generated constructor stub
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int aux = 0;
		int index = 0;
		for (int i = 0; i < Vehiculo.fabricantes.size(); i++) {
			int n = Collections.frequency(Vehiculo.fabricantes, Vehiculo.fabricantes.get(i));
			if (n > aux) {
				index = i;
				aux = n;
			}else {}
		}
		return Vehiculo.fabricantes.get(index);
	}
}
