package negocio;

public interface VOCentroComercial {

	public long getId();
	
	public String getEstado();
	
	public int getAforoAct() ;
	
	public long getId_horario();
	
	public String getNombre(); 

	public int getAforoMax();
	@Override
	String toString();
}
