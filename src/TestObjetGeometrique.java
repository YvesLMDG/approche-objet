public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] arrayObjetGeometriques = new ObjetGeometrique[2];
		arrayObjetGeometriques[0] = new Cercle(10);
		arrayObjetGeometriques[1] = new Rectangle(10, 2);
		
		for (int i=0; i<arrayObjetGeometriques.length; i++) {
			System.out.println(arrayObjetGeometriques[i]);
			System.out.println("périmètre : " + arrayObjetGeometriques[i].perimetre());
			System.out.println("surface : " + arrayObjetGeometriques[i].surface());
		}

	}

}
