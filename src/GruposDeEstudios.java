import java.util.Iterator;
import java.util.LinkedList;


public class GruposDeEstudios implements Estudios {

	private LinkedList<Estudios> estudios = new LinkedList<Estudios>();
	
	public void getID() {
		//devuelve el ID de cada estudio que exista o de cada estudio que haya en cada grupo, recursivamente
		
		Iterator it = estudios.iterator();
		while(it.hasNext()){ Estudios obj = (Estudios) it.next(); 
					obj.getID(); }
			}
	
	public void getIndicaciones() {
		//devuelve las indicaciones de cada estudio que exista o de cada estudio que haya en cada grupo, recursivamente
		
		Iterator it = estudios.iterator();
		while(it.hasNext()){ Estudios obj = (Estudios) it.next(); 
					obj.getIndicaciones(); 	
					}
			
			}

	
	public void getNombre() {
		//devuelve el nombre de cada estudio que exista o de cada estudio que haya en cada grupo, recursivamente
		
		Iterator it = estudios.iterator();
		while(it.hasNext()){ Estudios obj = (Estudios) it.next(); 
					obj.getNombre(); 	
					}
	}
	
	public void getValorNominalMaximo(LinkedList lista){
		Iterator it = lista.iterator();
		while(it.hasNext()){
			Estudios obj = (Estudios) it.next(); //Guarda análisis o grupo de estudios
			if(obj instanceof GruposDeEstudios){ //Si es un grupo de estudios
					getValorNominalMaximo(((GruposDeEstudios) obj).devolverLista()); //Vuelve a activar este método con el nuevo grupo de estudios
						}
			else if(obj instanceof Analisis){
				((Analisis) obj).getValorNominalMaximo(); //Si es un objeto Analisis sólo imprime el valorNominalMaximo 	
						}
			
				}
	}
	
	public void getValorNominalMinimo(LinkedList lista){
		Iterator it = lista.iterator();
		while(it.hasNext()){
			Estudios obj = (Estudios) it.next(); //Guarda análisis o grupo de estudios
			if(obj instanceof GruposDeEstudios){ //Si es un grupo de estudios
					getValorNominalMinimo(((GruposDeEstudios) obj).devolverLista()); //Vuelve a activar este método con el nuevo grupo de estudios
						}
			else if(obj instanceof Analisis){
				((Analisis) obj).getValorNominalMinimo(); //Si es un objeto Analisis sólo imprime el valorNominalMaximo 	
						}
			
				}
	}
	
	public void setID(int ID) {			
		estudios.getLast().setID(ID);		
	}

	
	public void setIndicaciones(String i) {	
		estudios.getLast().setIndicaciones(i);
	}

	
	public void setNombre(String n) {
		estudios.getLast().setNombre(n);
	}
	
	public void AgregarGrupoDeEstudios(GruposDeEstudios G){		
		this.estudios.add(G);
	}
	
	public void agregarEstudio(Estudios estudio, int ID, String nombre, String indicacion, int Vm, int VM){
		estudios.add(estudio); //agrego un estudio al final de la lista de estudios (Debo ponerle todo)
		((Estudios) estudios).setID(ID); //agrego ID, nombre e indicaciones
		((Estudios) estudios).setNombre(nombre);;
		((Estudios) estudios).setIndicaciones(indicacion);;
		if(estudios.getLast() instanceof Analisis){ //Si es un estudio tipo análisis, agrego valorNominalMinimo y Máximo
			((Analisis) estudios.getLast()).setValorNominalMinimo(Vm);
			((Analisis) estudios.getLast()).setValorNominalMaximo(VM);
			
				}		
		
			}
	
	public void agregarEstudio(Estudios estudio){
		estudios.add(estudio);//agrego un estudio completo al final de la lista de estudios
			}
	
	public LinkedList devolverLista(){
		return this.estudios;
	}
	
	
		
	
	
}


	

	
	
	

