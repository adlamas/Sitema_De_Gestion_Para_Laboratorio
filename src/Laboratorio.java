import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class Laboratorio {

	Map<Paciente, Integer> Paciente = new HashMap<Paciente, Integer>();
	//La fecha vendría a ser la clave
	
	LinkedList<Paciente> Pacientes = new LinkedList<Paciente>();
	int IDEstudios = 0;
	
	static Paciente P = new Paciente(0, null, 0, 0, null);
	static Analisis A4 = new Analisis(0, 0, 0, null, null);
	static EstudiosCardiologicos EC = new EstudiosCardiologicos(0, null, null);
	
	
	public void registrarPacientes(Paciente P, String tel, String mail){
		if(Pacientes.contains(P) == false){ Pacientes.add(P); }
		else{ 	P.setMail(mail); 
				P.setTelefono(tel);
				Pacientes.add(P);
		}
		
	}
	
	public void llenarEstudios(Estudios estudio, int ID, String nombre, String indicacion, int Vm, int VM){
		
		
		
		
	}
	
	
	
	
	
	public static void main(String args[]){	
		
		P.cargarEstudios(A4);
		P.cargarEstudios(EC);
		
	}
	
	
}
