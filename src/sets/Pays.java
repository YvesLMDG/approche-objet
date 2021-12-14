package sets;

import java.util.HashSet;
import java.util.Set;

public class Pays {


	private String nom;
	private Long nbHab;
	private Integer pibParHab;


	public Pays(String nom, Long nbHab, Integer pibParHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibParHab = pibParHab;
	}

	public Long getPib() {
		return nbHab*pibParHab;	
	}
	
	public String toString() {
		return "nom : " + nom + " nbHab :" + nbHab + " pibParHab : " + pibParHab;
	}
	
	public static void main(String[] args) {

		Set<Pays> setPays = new HashSet<>();
		setPays.add(new Pays("USA", 330_252_859L, 65_298));
		setPays.add(new Pays("France", 67_422_241L, 40_494));
		setPays.add(new Pays("Allemagne", 83_129_285L, 46_208));
		setPays.add(new Pays("UK", 66_465_641L, 42_491));
		setPays.add(new Pays("Italie", 60_494_785L, 34_318));
		setPays.add(new Pays("Japon", 126_050_098L, 40_113));
		setPays.add(new Pays("Chine", 1_411_778_724L, 10_217));
		setPays.add(new Pays("Russie", 146_238_185L, 11_585));
		setPays.add(new Pays("Inde", 1_372_943_539L, 2_016));

		PaysPibParHabComparator pibPerHabComparator = new PaysPibParHabComparator();
		PaysPibComparator pibComparator = new PaysPibComparator();
		
		Pays paysMaxPibParHab = new Pays("MinVal", 0L, 0);
		Pays paysMaxPib = paysMaxPibParHab;
		
		for (Pays p: setPays) {
			if(pibPerHabComparator.compare(p, paysMaxPibParHab)>0) {
				paysMaxPibParHab = p;
			}
			if(pibComparator.compare(p,paysMaxPib)>0) {
				paysMaxPib = p;
			}
		}
		System.out.println("paysMaxPibParHab : " + paysMaxPibParHab + "\npaysMaxPib : "+ paysMaxPib);
		
		Pays paysMinPib = new Pays("MaxVal", Long.MAX_VALUE, Integer.MAX_VALUE);
		for (Pays p: setPays) {
			if(pibComparator.compare(p,paysMinPib)<0) {
				paysMinPib = p;
			}
		}
		
		paysMinPib.setNom(paysMinPib.getNom().toUpperCase());
		System.out.println("paysMinPib : " + paysMinPib);
		
		setPays.remove(paysMinPib);
		
		for(Pays p: setPays) {
			System.out.println(p);
		}
		
	}
	
	public String getNom() {
		return nom;
	}

	public Long getNbHab() {
		return nbHab;
	}

	public Integer getPibParHab() {
		return pibParHab;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNbHab(Long nbHab) {
		this.nbHab = nbHab;
	}

	public void setPibParHab(Integer pibParHab) {
		this.pibParHab = pibParHab;
	}



}

