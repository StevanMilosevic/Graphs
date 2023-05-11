package adjecencyMatrix;

import java.util.ArrayList;

public class Graf {
	// ovde cemo deklarisati matricu brojeva u kojoj ce da cuvamo 1 i 0 za pozicije gde postoje cvorovi i gde ih nema
	// kao i ArrayList za skladistenje cvorova

	int[][] matrica;
	ArrayList<Cvor> cvorovi;

	Graf(int velicina) { 						// velicina je broj cvorova u grafu
		matrica = new int[velicina][velicina]; 	// kompleksnost je O(V^2), V je vertex tj cvor
		cvorovi = new ArrayList<>();
	}

	public void dodajCvor(Cvor cvor) {
		cvorovi.add(cvor);
	}

	// ubacivanjem broja 1 na zadatu poziciju dodali smo granu izmedju dva cvora
	public void dodajGranu(int pocetniCvor, int destinacija) { 	
		matrica[pocetniCvor][destinacija] = 1; 
	}

	public boolean proveriGranu(int pocetniCvor, int destinacija) {
		if (matrica[pocetniCvor][destinacija] == 1)
			return true;
		else
			return false;
	}
	
	public void stampajMatricu() {
		
		// ubacujemo zaglavlje sa nazivima cvorova
		System.out.print("  ");
		for(Cvor cvor : cvorovi)
			System.out.print(cvor.cvor + " ");	
		System.out.println();
		
		// stampamo matricu
		for(int i = 0; i < matrica.length; i++) {
			System.out.print(cvorovi.get(i).cvor + " ");	
			for(int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}
