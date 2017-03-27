import java.util.LinkedList;


public class Paciente {
	
	private int idPaciente;
	private String nombre;
	private int DNI;
	private int telefono;
	private String mail;
	private boolean estudiosTerminados = false;
	LinkedList<Estudios> estudiosARealizar = new LinkedList<Estudios>();

	public Paciente(int idPaciente, String nombre, int DNI, int telefono, String mail) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.DNI = DNI;
		this.telefono = telefono;
		this.mail = mail;		
		
	}
	
	public void setIDPaciente(int ID){
		this.idPaciente = ID;
	}
	public void getIDPaciente(){
		System.out.println(idPaciente);
	}
	public void setNombre(String n){
		this.nombre = n;
	}
	public void getNombre(){
		System.out.println(nombre);
	}
	public void setTelefono(String i){
		this.telefono = telefono;
	}
	public void getTelefono(){
		System.out.println(this.telefono);
	}
	public void setDNI(int dni){
		this.DNI = DNI;
	}
	public void getDNI(){
		System.out.println(DNI);
	}
	public void setMail(String M){
		this.mail = M;
	}
	public void getMail(){
		System.out.println(mail);
	}
	
	public void cargarEstudios(Estudios E){
		this.estudiosARealizar.add(E);
	}
	public Estudios getEstudio(int i){
		return this.estudiosARealizar.get(i);
	}
	public void estudiosTerminados(){
		this.estudiosTerminados = true;
	}
	public boolean getEstadoEstudios(){
		return this.estudiosTerminados;
	}
	
}
