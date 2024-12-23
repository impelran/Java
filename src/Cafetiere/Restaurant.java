package Cafetiere;

import java.util.ArrayList;

public class Restaurant {
    private Cafetiere cafetiere;
    double profit;
    private float quantiteCafeMax;
    double quantiteLiquideMl;
    private ArrayList<Client> listeClientServi;
    private String nom;

    public Restaurant() {
        this("Le Restaurant");
    }

    public Restaurant(String nom) {
        this.nom = nom;
        this.cafetiere = new Cafetiere();
        this.listeClientServi = new ArrayList<>();
        this.profit = 0.0;
    }

    public double servir(Client client, TypeCafe typeCafe) {
        if (client.getCommandeCafe() != null) {
            if (client.getTasse() == null) {
            	profit = typeCafe.getCoutParMl() + 2;
			} else if (quantiteLiquideMl < quantiteCafeMax) {
				quantiteCafeMax = 500;
				profit = typeCafe.getCoutParMl() + 3;
            }
            return client.getValeurFacture();
        } else if(quantiteLiquideMl < quantiteCafeMax) {
			System.out.println("Le contenant déborde.");
			profit += typeCafe.getCoutParMl();
        } else if (typeCafe == TypeCafe.BATARD) {
        	System.out.println("Client jeté.");
        } else if (typeCafe != typeCafe) {
        	typeCafe = TypeCafe.BATARD;
        }else {
        	System.out.println("Client jeté.");
        }
		return profit;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

	public Cafetiere getCafetiere() {
		return cafetiere;
	}

	public void setCafetiere(Cafetiere cafetiere) {
		this.cafetiere = cafetiere;
	}
}