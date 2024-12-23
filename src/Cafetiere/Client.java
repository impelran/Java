package Cafetiere;

public class Client {
    Tasse tasse;
    private Cafe commandeCafe;
    private String nom;
    double valeurFacture;

    public Client(String nom, Cafe commande, boolean avecTasse) {
        this.nom = nom;
        this.commandeCafe = commande;
        if (avecTasse) {
            this.tasse = new Tasse(100);
        } else {
            this.tasse = null;
        }
    }

    public Client(String nom, Cafe commande, Tasse tasse) {
        this.nom = nom;
        this.commandeCafe = commande;
        this.tasse = tasse;
    }
    
    public Client() {
        this("Jean", null, new Tasse(100));
    }

    public Tasse getTasse() {
        return tasse;
    }

    public void setTasse(Tasse tasse) {
        this.tasse = tasse;
    }

    public Cafe getCommandeCafe() {
        return commandeCafe;
    }

    public void setCommandeCafe(Cafe commandeCafe) {
        this.commandeCafe = commandeCafe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeurFacture() {
        return valeurFacture;
    }

    public void setValeurFacture(double valeurFacture) {
        this.valeurFacture = valeurFacture;
    }
}
