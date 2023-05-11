package adjecencyList;

/* Adjecency List je niz ili ArrayList sastavljen od LinkedListi. Svaka LinkedLista ima jedinstven cvor na svom pocetku.
 * Svi susedni cvorovi za taj pocetni cvor se dodaju na njegovu LinkedListu.
 * 
 * Vremenska kompleksnost pronalazenja cvora je O(V), V broj cvorova - sto nije brzo koliko i Adjecency Matrix
 * dok je kompleksnost prostora koji je potreban da bi se cuvali svi cvorovi - O(V+E), V je broj cvorova, E je broj grana,
 * sto je dosta stedljivije u udnosu na adjecency matrix */

public class Main {

	public static void main(String[] args) {

		Graf graf = new Graf();

		// dodajemo cvorove
		graf.dodajCvor(new Cvor('A'));	// prvi cvor, indeks 0
		graf.dodajCvor(new Cvor('B'));	// drugi scor, indeks 1
		graf.dodajCvor(new Cvor('C'));	// indeks 2
		graf.dodajCvor(new Cvor('D'));	// indeks 3
		graf.dodajCvor(new Cvor('E'));	// indeks 4

		// dodajemo grane
		graf.dodajGranu(0, 2); // grana izmedju A i C
		graf.dodajGranu(1, 0); // grana izmedju B i A
		graf.dodajGranu(1, 3); // grana izmedju B i D
		graf.dodajGranu(2, 1); // grana izmedju C i B
		graf.dodajGranu(4, 2); // grana izmedju E i C
		
		// stampanje grafa
		graf.stampajGraf();
		
		/* iako za cvor D nije vezan ni jedan drugi cvor, i dalje se pravi LinkedLista sa njim na celu, zbog buducih 
		 * eventualnih prosirenja */

	}

}
