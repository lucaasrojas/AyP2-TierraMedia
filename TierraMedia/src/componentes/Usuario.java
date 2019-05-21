package componentes;

import java.util.*;

public class Usuario {

	private String nombre;
	private int cantidadDeMonedas;
	private double tiempoDisponible;
	private TipoDeAtracciones tipoDeAtraccionPredilecta;
	private List<Atraccion> atraccionesSeleccionadas = new ArrayList<Atraccion>();
	private List<Promocion> promocionesSeleccionadas = new ArrayList<Promocion>();

	public Usuario(String nombre, int cantidadDeMonedas, double tiempoDisponible, TipoDeAtracciones tipo) {

		this.nombre = nombre;
		this.cantidadDeMonedas = cantidadDeMonedas;
		this.tiempoDisponible = tiempoDisponible;
		this.tipoDeAtraccionPredilecta = tipo;

	}
	// Tiene test
	public String getNombre() {
		return nombre;
	}
	// Tiene test
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Tiene test
	public int getCantidadDeMonedas() {
		return cantidadDeMonedas;
	}
	// Tiene test
	public void setCantidadDeMonedas(int cantidadDeMonedas) {
		this.cantidadDeMonedas = cantidadDeMonedas;
	}
	// Tiene test
	public double getTiempoDisponible() {
		return tiempoDisponible;
	}
	// Tiene test
	public void setTiempoDisponible(double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}
	// Tiene test
	public void setTipoAtraccionPredilecta(TipoDeAtracciones tipo) {
		this.tipoDeAtraccionPredilecta = tipo;
	}
	// Tiene test
	public TipoDeAtracciones getTipoAtraccionPredilecta() {
		return this.tipoDeAtraccionPredilecta;
	}
	// Tiene test
	public void addAtraccion(Atraccion atraccion) {
		this.atraccionesSeleccionadas.add(atraccion);
	}
	// Tiene test
	public List<Atraccion> getListaAtracciones(){
		return this.atraccionesSeleccionadas;
	}
	// Tiene test
	public void addPromocion(Promocion promocion) {
		promocionesSeleccionadas.add(promocion);
	}
	// Tiene test
	public List<Promocion> getPromocionesSeleccionadas(){
		return promocionesSeleccionadas;
	}
	
	public String getMonedasYTiempoRestante() {
		return "Monedas: " + cantidadDeMonedas + " | Tiempo Disponible: " + tiempoDisponible;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + " | Monedas: " + cantidadDeMonedas + " | Tiempo Disponible: " + tiempoDisponible;
	}
	
	public int compare(TipoDeAtracciones tipo) {
		if(tipo == this.tipoDeAtraccionPredilecta) {
			return 1;
		}
		else {
			return 0;
		}
	}


}
