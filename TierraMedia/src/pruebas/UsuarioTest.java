package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import componentes.*;
import promociones.*;

public class UsuarioTest {

	@Test
	public void seCreaUsuario() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		Assert.assertNotNull(frodo);

	}

	@Test
	public void seObtieneElNombreFrodo() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		String a = frodo.getNombre();
		Assert.assertEquals("frodo", a);
	}
	
	@Test
	public void seCambiaElNombre() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		frodo.setNombre("Carlos");
		assertEquals("Carlos", frodo.getNombre());
	}
	
	@Test
	public void seCambiaElAtraccionPredilecta() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		frodo.setTipoAtraccionPredilecta(TipoDeAtracciones.Desgustacion);
		assertEquals(TipoDeAtracciones.Desgustacion, frodo.getTipoAtraccionPredilecta());
	}
	
	@Test
	public void seCambiaElTiempoDisponible() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		frodo.setTiempoDisponible(15.40);
		assertEquals(15.40, frodo.getTiempoDisponible(), 0.1);
	}
	
	@Test
	public void seCambiaCantidadMonedas() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		frodo.setCantidadDeMonedas(30);
		assertEquals(30, frodo.getCantidadDeMonedas());
	}
	
	@Test
	public void seObtieneLaCantidadDeMonedas() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		int a = frodo.getCantidadDeMonedas();
		Assert.assertEquals(100, a);
	}

	@Test
	public void seObtieneElTiempo() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		double b = frodo.getTiempoDisponible();
		Assert.assertEquals(18.30, b, 0.001);
	}
	
	@Test
	public void seObtieneElTipoPredilecto() {
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		assertEquals(TipoDeAtracciones.Aventura, frodo.getTipoAtraccionPredilecta());
	}
	
	@Test
	public void seAgregaAtraccion() {
		Atraccion atr = new Atraccion("Moria",10,2.0,6, TipoDeAtracciones.Aventura);
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		
		frodo.addAtraccion(atr);
		
		assertEquals(1, frodo.getListaAtracciones().size());
	}
	
	@Test
	public void seAgregaPromocion() {
		List<Atraccion> listaAtracciones = new ArrayList<Atraccion>();
		listaAtracciones.add(new Atraccion("Moria",10,2.0,6, TipoDeAtracciones.Aventura));
		listaAtracciones.add(new Atraccion("Minas Tirith",5,2.5,25,TipoDeAtracciones.Paisaje));
		Promocion promo = new AxB("Pack mixto Premium",listaAtracciones,"Lothlorien","Comprando..");
		Usuario frodo = new Usuario("frodo", 100, 18.30, TipoDeAtracciones.Aventura);
		
		frodo.addPromocion(promo);
		
		assertEquals(1, frodo.getPromocionesSeleccionadas().size());
	}





}
