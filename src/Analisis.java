
public class Analisis implements Estudios {

	private int valorNominalMinimo;
	private int valorNominalMaximo;
	private int ID;
	private String nombre;
	private String indicaciones;
	
		public Analisis(int vm, int vM, int ID, String nombre, String indicaciones){
			
			this.valorNominalMinimo = vm;
			this.valorNominalMaximo = vM;
			this.ID = ID;
			this.nombre = nombre;
			this.indicaciones = indicaciones;
		}
		
		public void setValorNominalMinimo(int V){
			this.valorNominalMinimo = V;
		}
		
		public void getValorNominalMinimo(){
			System.out.println(valorNominalMinimo);
		}
		
		public void setValorNominalMaximo(int V){
			this.valorNominalMaximo = V;
		}
		
		public void getValorNominalMaximo(){
			System.out.println(valorNominalMaximo);
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
