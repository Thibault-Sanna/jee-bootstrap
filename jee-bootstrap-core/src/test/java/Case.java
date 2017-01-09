
public class Case {
		private int numLigne;
		private int numColonne;
		private String Couleur ;
		
		public String getCouleur() {
			return Couleur;
		}
		public void setCouleur(String couleur) {
			Couleur = couleur;
		}
		public int getNumLigne() {
			return numLigne;
		}
		public void setNumLigne(int numLigne) {
			this.numLigne = numLigne;
		}
		public int getNumColonne() {
			return numColonne;
		}
		public void setNumColonne(int numColonne) {
			this.numColonne = numColonne;
		}
		public Case(int numLigne, int numColonne, String couleur) {
			super();
			this.numLigne = numLigne;
			this.numColonne = numColonne;
			Couleur = couleur;
		}
}
