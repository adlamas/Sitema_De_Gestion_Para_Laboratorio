
public class Testeo {

	public static void main(String args[]){
		
		Analisis A = new Analisis(80, 120 , 18, "Analisis I", "Retirar 19/11/15");
		Analisis A2 = new Analisis(77, 110 , 22, "Analisis II", "Retirar 18/11/15");
		Analisis A3 = new Analisis(70, 109 , 23, "Analisis III", "Retirar 17/11/15");
		Analisis A4 = new Analisis(72, 105 , 24, "Analisis IV", "Retirar 16/11/15");
		EstudiosCardiologicos EC = new EstudiosCardiologicos(13, "ElectroCardioGrama I", "Retirar 12/11/15");
		EstudiosCardiologicos EC2 = new EstudiosCardiologicos(11, "ElectroCardioGrama II", "Retirar 11/11/15");
		EstudiosRadiologicos ER = new EstudiosRadiologicos(15, "Estudio con rayos beta I", "Retirar 2/12/15");
		
		GruposDeEstudios G = new GruposDeEstudios();
		GruposDeEstudios G2 = new GruposDeEstudios();
		GruposDeEstudios G3 = new GruposDeEstudios();
		GruposDeEstudios G4 = new GruposDeEstudios();		
		G.agregarEstudio(A2);
		G.agregarEstudio(A3);
		G.agregarEstudio(EC2);
		G.agregarEstudio(A4);
		G.agregarEstudio(ER);
		G2.agregarEstudio(A);
		G3.AgregarGrupoDeEstudios(G);
		G4.agregarEstudio(A4);
		G2.AgregarGrupoDeEstudios(G3);
		G2.AgregarGrupoDeEstudios(G4);
		
		G.agregarEstudio(EC);		
		G2.agregarEstudio(A2);		
		G2.getID();
		G2.getIndicaciones();
		
		G2.getNombre();
		G2.getValorNominalMaximo(G2.devolverLista());
		G2.getValorNominalMinimo(G2.devolverLista());
	}
	
}
