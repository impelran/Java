package Cafetiere;

public class Cafetiere {

    public Cafetiere() {
    }

    public void remplirTasse(Tasse tasse) {
        if (tasse != null) {
            Cafe cafeMoka = new Cafe(TypeCafe.MOKA, tasse.getQuantiteCafeMax());
            tasse.remplir(cafeMoka);
        }
    }

    public void remplirTasse(Tasse tasse, TypeCafe typeCafe, double quantite) {
        if (tasse != null) {
            double quantiteAUtiliser = Math.min(quantite, tasse.getQuantiteCafeMax());
            Cafe cafe = new Cafe(typeCafe, quantite);
            tasse.remplir(cafe);
        }
    }
}