package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto tavolo = new Prodotto("Tavolo", "Tavolo in legno", 40);
		Prodotto sedia = new Prodotto("Sedia", "Sedia da giardino", 6);
		Prodotto piatto = new Prodotto("Piatto", "Piatto in ceramica", 3);
		Prodotto forchetta = new Prodotto("Forchetta", "Forchetta di metallo", 1);
		Prodotto motosega = new Prodotto("Motosega", "Motosega classe #67", 150);

		System.out.println(tavolo);
		System.out.println("-------");

		System.out.println(sedia);
		System.out.println("-------");

		System.out.println(piatto);
		System.out.println("-------");

		System.out.println(forchetta);
		System.out.println("-------");

		System.out.println(motosega);
		System.out.println("-------");
	}
}
