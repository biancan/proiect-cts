package ro.acs.cts.proiect.surse;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		//Cream restaurantul, unic - SINGLETON
		Restaurant restaurantTest = Restaurant.getInstance();
		Restaurant restaurant = Restaurant.getInstance();
		
		Angajat bucatarSef = new Angajat("Marin Dinica", 1229);
		Angajat bucatar1 = new Angajat("Marcel Solomon", 570);
		Angajat bucatar2 = new Angajat("Radu Batista", 680);
		
		//Adaugam bucatarii ca subordonati pentru bucatar sef
		bucatarSef.add(bucatar1);
		bucatarSef.add(bucatar2);
		
		Angajat sefSala = new Angajat("Marian Petrescu", 1000);
		Angajat ospatar1 = new Angajat("Ionut Manea", 433);
		Angajat ospatar2 = new Angajat("Mircea Moldoveanu", 570);
		Angajat ospatar3 = new Angajat("Dinita Simona", 500);
		
		//Adaugam bucatarii ca subordonati pentru bucatar sef
		sefSala.add(ospatar1);
		sefSala.add(ospatar2);
		sefSala.add(ospatar3);
		
		Angajat manager = new Angajat("Adrian Ionescu",4516);
		manager.add(bucatarSef);
		manager.add(sefSala);
		
//		System.out.println("Urmeaza sa parcurgem lista subordonati directi");
		
//		for (Angajat a : manager.getSubordonati()){
//			System.out.println(a);
//		}
		
		//Afisam lista tuturor subordonatilor
//		System.out.println("Afisam lista tuturor subordonatilor");
//		
//		for (Angajat a: manager.getSubordonati()){
////			System.out.println(a.getSubordonati());
//			System.out.println(a);
//			for(Angajat b:a.getSubordonati()){
//				System.out.println(b);
//			}
//		}
		
		List<Angajat> totiAngajatii = new ArrayList<Angajat>();
		totiAngajatii.addAll(manager.getSubordonati());
		for(Angajat a: manager.getSubordonati()){
			totiAngajatii.addAll(a.getSubordonati());
		}
		totiAngajatii.add(manager);
		
		restaurant.setAngajati(totiAngajatii);
		System.out.println("Toti angajatii:");
		System.out.println(totiAngajatii);
		
		Masa masa1 = new Masa(1);
		Masa masa2 = new Masa(2);
		Masa masa3 = new Masa(3);
		Masa masa4 = new Masa(4);
		Masa masa5 = new Masa(5);
		Masa masa6 = new Masa(6);
		Masa masa7 = new Masa(7);
		Masa masa8 = new Masa(8);
		
		//Creare Comanda
		Comanda comanda1 = new Comanda.Builder()
				.adaugaBautura(new Bautura("Fanta", 2))
				.adaugaDesert(new Desert("Papanasi",1))
				.build();
		
		Comanda comanda2 = new Comanda.Builder()
				.adaugaBautura(new Bautura("Apa Plata", 2))
				.adaugaDesert(new Desert("Papanasi",1))
				.build();
		
		Comanda comanda3 = new Comanda.Builder()
				.adaugaFel1(new Fel1("Ciorba de perisoare",2))
				.adaugaFel2(new Fel2("Friptura porc", 2))
				.build();
		
		System.out.println(comanda1);
		masa1.adaugaComanda(comanda1);
		masa1.adaugaComanda(comanda2);
		
	}
}
