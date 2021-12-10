public class Cercle  implements ObjetGeometrique{
	
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		return 2*Math.PI*this.rayon;
	}

	public double surface() {
		return Math.PI*rayon*rayon;
	}

	public String toString() {
		return "cercle de rayon : " + rayon;
	}
	
}
