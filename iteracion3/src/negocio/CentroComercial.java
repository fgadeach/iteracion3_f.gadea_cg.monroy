package negocio;

public class CentroComercial implements VOCentroComercial{

	private long id;
	private String nombre;
	private int aforoMax;
	private long id_horario;
	private int aforoAct;
	private String estado;

	public CentroComercial() 
	{
		this.id = 0;
		this.nombre = "";
		this.aforoMax = 0;
		this.id_horario=0;
		this.aforoAct=0;
		this.estado="";
	}

	public CentroComercial(long id, String nombre, int aforo, long horario, int aforoAct, String estado) 
	{
		this.id = id;
		this.nombre = nombre;
		this.aforoMax=aforo;
		this.id_horario=horario;
		this.aforoAct=aforoAct;
		this.estado=estado;
	}

	public long getId_horario() {
		return id_horario;
	}

	public void setId_horario(long id_horario) {
		this.id_horario = id_horario;
	}

	public int getAforoAct() {
		return aforoAct;
	}

	public void setAforoAct(int aforoAct) {
		this.aforoAct = aforoAct;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAforoMax() {
		return aforoMax;
	}

	public void setAforoMax(int aforoMax) {
		this.aforoMax = aforoMax;
	}

	@Override
	public String toString() 
	{
		return "CentroComercial [id=" + id + ", nombre=" + nombre +", aforoMax=" + aforoMax + "]";
	}
}
