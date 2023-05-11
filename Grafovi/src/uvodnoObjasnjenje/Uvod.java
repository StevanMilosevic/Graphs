package uvodnoObjasnjenje;

/* Grafovi su uprosceno receno: grupa tacaka povezanih linijama. To su strukture podataka koje se sastoje iz konacnog 
 * broja cvorova i grana koje ih povezuju. Cvorova ili node, vertex, grana  ili edge. Cvor moze da sadrzi neki tip podatka 
 * a grana je dakle konekcija izmedju dva cvora, grana moze da ima tezinu (weigth) koja ukazuje na jacinu veze izmedju 
 * dva cvora. 
 * Ovde ce se raspravljati o dve vrsta grafova Undirected i Directed.
 * 
 * Undirected graf -> kod njega grane nemaju smer, tako da se unapred pretpostavlja da predstavljaju dvosmernu vezu.
 * Primer za unidirected graph bi bila socijalna mreza kao Facebook, svaki cvor predstavlja osobu
 * na mrezi, koja moze da ima prijatelje sa kojima je povezan preko grane. Ako su dva cvora 
 * povezana oni imaju ADJACENCY (sto bi moglo da se prevede kao: blizu ili pored, deliti granicu,
 *  najcesce kao SUSED, SUSEDNI).
 * 
 * Directed graph sadrzi grane koji povezuju jedan cvor sa drugim, ali to su jednosmerne konekcije. 
 * Primer directed grapha bi bila mapa nekog grada, gde je cvor bilo koja tacka na mapi do koje se moze doci, 
 * a grane su ulice koje vode do tih cvorova.
 * 
 * Postoji vise nacina IMPLEMENTACIJE grafova, medju njih spadaju: EDGE LIST, ADJECENCY MATRIX i ADJECENCY LIST. 
 * 
 * EDGE LIST je niz ili lista svih grana u grafu. Obicno se predstavlja kao par veza, gde svaki par predstavlja jednu granu, koja
 * se nalazi izmedju dva cvora (predstavljeni jedinstvenim ID-em. Svakoj grani se dodeljuje indeks koji posle predstavlja 
 * referencu za vezu od jednog cvora ka drugom. Ne postoji neki poseban redosled grana kako se one pojavljuju u EDGE LIST, ali 
 * svaka grana mora da bude predstavljena. 
 * 
 * Najprostije bi moglo ovako:
 * int[][] graneNiz = {{1,2},{2,4},{3,1},{4,5},{5,7},{6,3}};
 * 
 * pa ako hocemo da vidimo da li je cvor 1 povezan sa cvorom 3, morali bismo da prodjemo kroz matricu i da potrazimo da li postoji
 * par {1, 3} ili {3, 1}. Ovo nije problem kada je graf mali i kada nema mnogo cvorova i grana izmedju njih, sto je veci graf to
 * se povecava kompleksnost edge liste i njene pretrage. Pogotovu sto moze lako da se dogodi da imamo situaciju da ispitujemo 
 * postojanje veze izmedju dva cvora gde nema konekcije/grane, u tom slucaju cemo ipak morati da prodjemo kroz ceo niz. Zato je 
 * vremenska kompleksnost prolaska kroz niz velika - O(E), E je broj grana.
 * 
 * Sa ADJECENCY MATRIX pravimo matricu (niz nizova) gde kolone predstavljaju pocetni cvor a kolone cvor do koga
 *  pretrazujemo adjecency/odnos susedstva. 
 * 
 * 		A	B	C	D	E
 * A 	0	0	1	0	0
 * B	1	0	0	1	0
 * C	0	1	0	0	0
 * D	0	1	1	0	0	
 * E	0	0	1	0	1
 * 
 * Ako zelimo da proverimo da li postoji adjecency izmedju dva cvora prvo potrazimo indeks cvora od koga krecemo
 * (recimo A) pa onda trazimo indeks cvora do koga idemo (recimo C) - ako nema grane izmedju njih tu ce da stoji 0, 
 * ako ima veze izmedju njih stajace 1. Ako zelimo da dodamo i tezinu grani, onda cemo umesto 1 na mesto gde ima grane ostaviti 
 * neki drugi, veci broj koji ce da oznacava "tezinu" grane.
 * 
 * Prednosti matrixa su da je runtime kompleksnost pronalazenja grane konstantna O(1), jer moramo da nadjemo samo 
 * dva indeksa, ali sa druge strane mana matrixa je prostor koji matrix zauzima, tj sto vise podataka skladistimo
 * to je potrebno vise prostora da se sve pothrani u matrix (primer iznad -> 5 redova * 5 kolona = 25 
 * polja nam je potrebno)
 * 
 * ADJECENCY LIST je hibrid prethodne dve implementacije, to je niz ili ArrayList sastavljen od LinkedListi gde je svaki element 
 * zasebna lista, svaka od tih listi ce imati header koji je adresa cvora, ako postoji susedstvo izmedju tog cvora i nekog sledeceg, 
 * to ce biti oznaceno u listi.  
 * 
 * A -> B ->
 * B -> C -> E ->
 * C -> D -> E ->
 * D ->
 * E -> A -> C ->
 * 
 * Ako hocemo da vidimo da li cvor B je vezan (adjecent) za E, prvo lociramo indeks od B i pratimo listu koja
 * pocinje sa B sve dok ne dodjemo do cvora E, sto u slucaju gore znaci da postoji veza (adjecency) izmedju cvorova B i E.
 * Cak i ako postoji cvor koji nije vezan ni za jedan drugi cvor (cvor D u primeru gore), on ce takodje biti dodat 
 * u listu za slucaj da dodje do update grafa.
 * 
 * Prednost adjecency liste: prostor koji zauzima, kompleksnost prostora koji zauzima se oznacava O(V + E) (Vertex + Edge). 
 * Mana: vremenska kompleksnost za pronalazenja elementa je O(V) (V je broj cvorova), sto znaci da bi locirali granu 
 * prvo moramo da pristupimo cvoru od koga pocinjemo da ispitujemo odnos susedstva, pa onda nju pratimo cvor po cvor. Sto je veci
 * broj cvorova to je vise vremena potrebno da se izvrsi pretraga. 
 * 
 * Vazan deo price o grafovima su i ALGORITMI za njihovu pretragu, pa tako Depth First Search nam pomaze da da krenemo od odredjenog
 * cvora i da stignemo do svakog drugog cvora u grafu, Breadth First Search nam moze reci koji je najkraci put od zadatog cvora 
 * do zeljenog cvora u grafu. Bice i o njima detaljnije price u zadacima */

public class Uvod {

}
