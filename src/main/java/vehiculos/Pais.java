package vehiculos;

import java.util.Collections;

public class Pais {
	String nombre;

	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor(){
		int aux = 0;
		int index = 0;
		for (int i = 0; i < Vehiculo.paises.size(); i++) {
			int n = Collections.frequency(Vehiculo.paises, Vehiculo.paises.get(i));
			if (n > aux) {
				index = i;
				aux = n;
			}else {}
		}
		return Vehiculo.paises.get(index);
	}
}
