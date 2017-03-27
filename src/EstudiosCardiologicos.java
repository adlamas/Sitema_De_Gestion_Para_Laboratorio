
public class EstudiosCardiologicos implements Estudios {
	
	private int ID;
	private String nombre;
	private	String indicaciones;
	
	public EstudiosCardiologicos(int ID, String nombre, String indicaciones){
		
		this.ID = ID;
		this.nombre = nombre;
		this.indicaciones = indicaciones;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	public void getID(){
		System.out.println(ID);
	}
	public void setNombre(String n){
		this.nombre = n;
	}
	public void getNombre(){
		System.out.println(nombre);
	}
	public void setIndicaciones(String i){
		this.indicaciones = i;
	}
	public void getIndicaciones(){
		System.out.println(indicaciones);
	}

}
