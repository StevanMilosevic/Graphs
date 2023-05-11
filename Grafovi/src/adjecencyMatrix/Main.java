package adjecencyMatrix;

/* Adjecency Matrix je matrica u kojoj se cuvaju nule i jedinice koje predstavljaju cvorove u grafu.
 * Broj redova kao i broj kolona je jednak broju cvorova u grafu. Vremenska kompleksnost pronalazenja cvora je O(1)
 * sto je veoma brzo, dok je prostor koji je potreban da bi se napravila matrica koja ce da sadrzi podatke o cvorovima
 * veliki, tj njegova kompleksnost je O(V^2) (V je vertex, node ili cvor)
 * 
 * pravimo ovakvu matricu:
 * 
 *  	A	B	C	D	E
 * A 	0	0	1	0	0
 * B	1	0	0	1	0
 * C	0	1	0	0	0
 * D	0	1	1	0	0	
 * E	0	0	1	0	0
 */

public class Main {

	public static void main(String[] args) {

		Graf graph = new Graf(5);		// pravimo matricu 5x5
		
		// dodajemo cvorove
		graph.dodajCvor(new Cvor('A'));		// prvi cvor, ima indeks 0
		graph.dodajCvor(new Cvor('B'));		// drugi cvor, indeks 1
		graph.dodajCvor(new Cvor('C'));		// indeks 2
		graph.dodajCvor(new Cvor('D'));		// indeks 3
		graph.dodajCvor(new Cvor('E'));		// indeks 4
		
		// dodajemo grane
		graph.dodajGranu(0, 2);		// grana izmedju A i C
		graph.dodajGranu(1, 0);		// grana izmedju B i A
		graph.dodajGranu(1, 3);		// grana izmedju B i D
		graph.dodajGranu(2, 1);		// grana izmedju C i B
		graph.dodajGranu(3, 1);		// grana izmedju D i B
		graph.dodajGranu(3, 2);		// grana izmedju D i C
		graph.dodajGranu(4, 2);		// grana izmedju E i C
		
		// mozemo da proverimo da li postoji grana izmedju dva cvora
		System.out.println("Da li postoji grana izmedju A i C: " + graph.proveriGranu(0, 2));
		System.out.println("Da li postoji grana izmedju D i E: " + graph.proveriGranu(3, 4));		
			
		// stampanje grafa
		graph.stampajMatricu();
		

	}

}
