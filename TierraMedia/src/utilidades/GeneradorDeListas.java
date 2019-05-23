package utilidades;

import java.util.*;
import java.util.Map.Entry;

import componentes.*;

public class GeneradorDeListas {

	public List<Atraccion> armarPosiblesAtraccionesParaUsuario(Usuario usuario, List<Atraccion> listadoAtracciones) {

		listadoAtracciones.removeIf(item -> item.getCosto() > usuario.getCantidadDeMonedas() || item.getTiempoDeDuracion() > usuario.getTiempoDisponible()
				|| usuario.getListaAtracciones().contains(item) || item.getcapacidadRestante() == 0);
		
		Map<Integer, Atraccion> atraccionesTreeMap = new TreeMap<Integer, Atraccion>(Collections.reverseOrder());
		Map<Integer, Atraccion>  atraccionesPredilectas = new TreeMap<Integer, Atraccion>(Collections.reverseOrder());
		for(Atraccion atr : listadoAtracciones) {
			if(atr.getTipo() == usuario.getTipoAtraccionPredilecta()) {
				atraccionesPredilectas.put(atr.getCosto(), atr);
			} else {
				atraccionesTreeMap.put(atr.getCosto(), atr);				
			}
		}
		List<Atraccion> sortedList = new ArrayList<Atraccion>();
		
		for (Map.Entry<Integer, Atraccion> entry : atraccionesPredilectas.entrySet()) {
			sortedList.add(entry.getValue());
		}
		for (Map.Entry<Integer, Atraccion> entry : atraccionesTreeMap.entrySet()) {
			sortedList.add(entry.getValue());
		}
		
		
        
		return sortedList;

	}
	
	

	public List<Promocion> armarPosiblesPromocionesParaUsuario(Usuario usuario, List<Promocion> listaPromociones) {
		Comparator<Promocion> comparador = new Comparator<Promocion>() {
			@Override
			public int compare(Promocion a1, Promocion a2) {
				return a1.getCosto() > a2.getCosto() ? -1 : 1;
			}
		};

		Collections.sort(listaPromociones, comparador);

		listaPromociones.removeIf(item -> item.getCosto() > usuario.getCantidadDeMonedas()
				|| item.getTiempoDeDuracion() > usuario.getTiempoDisponible()
				|| usuario.getPromocionesSeleccionadas().contains(item));

		return listaPromociones;
	}
}
