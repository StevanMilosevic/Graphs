package adjecencyList;

import java.util.*;

public class Graf {
	
	// ArrayLista koja sadrzi LinkedList koja sadrzi cvorove u grafu
	ArrayList<LinkedList<Cvor>> cvorovi;
	
	Graf(){
		cvorovi = new ArrayList<>();
	}
	
	// 1. da bismo dodali cvor, moramo da stvorimo LinkedListu
	// 2. zatim toj LinkedListi dodajemo cvor i svaka tako stvorena LinkedLista pocinje sa tim cvorom
	// 3. tu LinkedListu ubacujemo u ArrayList
	public void dodajCvor(Cvor cvor) {
		LinkedList<Cvor> privremenaLista = new LinkedList<>();
		privremenaLista.add(cvor);
		cvorovi.add(privremenaLista);
	}
	// 1. da bismo ubacili granu, potrebo je da dodjemo do LinkedListe iz ArrayListe (cvorovi)
	// 2. moramo da znamo do kog cvora ide grana
	// 3. cvor dodajemo na postojeci niz 
	public void dodajGranu(int pocetniCvor, int destinacija) {
		LinkedList<Cvor> privremenaLista = cvorovi.get(pocetniCvor);	// cvorovi.get() vraca LinkedListu
		Cvor cvorDestinacija = cvorovi.get(destinacija).get(0);	
		privremenaLista.add(cvorDestinacija);
	}
	
	// napravimo privremenu listu cvorova, pa gledamo da li postoji grana izmedju dva cvora
	public boolean proveriGranu(int pocetniCvor, int destinacija) {
		LinkedList<Cvor> privremenaLista = cvorovi.get(pocetniCvor);
		Cvor cvorDestinacija = cvorovi.get(destinacija).get(0);
		
		for(Cvor cvor : privremenaLista) {
			if(cvor == cvorDestinacija) {
				return true;
			}
		}
		return false;
	}
	
	// za stampanje grafa moramo da prodjemo kroz ugnjezdene LinkedListe u ArrayListama
	public void stampajGraf() {
		for(LinkedList<Cvor> privremenaLista : cvorovi) {
			for(Cvor cvor : privremenaLista) {
				System.out.print(cvor.cvor + " -> ");
			}
			System.out.println();
		}
	}

}
