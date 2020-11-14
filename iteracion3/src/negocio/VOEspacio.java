package negocio;

public interface VOEspacio {
	public long getId();
	public long getIdCC();
	public long getIdHorario();
	public String getNombre();
	public int getAforomax();
	public int getAforoAct();
	public String getTipo();
	public String getEstado();
	
	@Override
	public String toString(); 
}
