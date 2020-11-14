package negocio;

public class Espacio implements VOEspacio{

	private long id;
	private long idCC;
	private long idHorario;
	private String nombre;
	private int aforomax;
	private int aforoAct;
	private String tipo;
	private String estado;
	
	public Espacio() {
		this.id=0;
		this.idCC=0;
		this.idHorario=0;
		this.nombre="";
		this.aforomax=0;
		this.tipo="";
		this.estado="";
		this.aforoAct=0;
	}
	
	public Espacio(long i, long icc, long idh,String nom, int amax,int aact,String t,String e)
	{
		id=i;
		idCC=icc;
		idHorario=idh;
		nombre=nom;
		aforomax = amax;
		aforoAct= aact;
		tipo = t;
		estado=e;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdCC() {
		return idCC;
	}

	public void setIdCC(long idCC) {
		this.idCC = idCC;
	}

	public long getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(long idHorario) {
		this.idHorario = idHorario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAforomax() {
		return aforomax;
	}

	public void setAforomax(int aforomax) {
		this.aforomax = aforomax;
	}

	public int getAforoAct() {
		return aforoAct;
	}

	public void setAforoAct(int aforoAct) {
		this.aforoAct = aforoAct;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Espacio [id=" + id + ", idCC=" + idCC + ", idHorario=" + idHorario + ", nombre=" + nombre
				+ ", aforomax=" + aforomax + ", aforoAct=" + aforoAct + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
}
