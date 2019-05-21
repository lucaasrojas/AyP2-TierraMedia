package excepciones;

public class ListaVaciaException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListaVaciaException(String archivo){
		super("El archivo " + archivo + " esta vacio");
	}
}
