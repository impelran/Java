package Cafetiere;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Restaurant latteSurLesRochers = new Restaurant("Latte sur les rochers");
        Restaurant uneTasseDeJoie = new Restaurant("Une tasse de joie");
        Restaurant leRestaurant = new Restaurant("Le Restaurant");
    
        ArrayList<String> listeNoms = BanqueDeDonne.listeNoms;
        ArrayList<Cafe> listeCommandes = BanqueDeDonne.listeCommandes;
        ArrayList<Tasse> listeTasses = BanqueDeDonne.listeTasses;
    
        ArrayList<Client> listeClient1 = new ArrayList<>();
        ArrayList<Client> listeClient2 = new ArrayList<>();
        ArrayList<Client> listeClient3 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            String nom = listeNoms.get(random.nextInt(listeNoms.size()));
            Cafe commande = listeCommandes.get(random.nextInt(listeCommandes.size()));
            Tasse tasse = listeTasses.get(random.nextInt(listeTasses.size()));

            Client client = new Client(nom, commande, tasse);
            listeClient1.add(client);
        }
    }

    public static int calculerProfit(ArrayList<Client> clients) {
        int profit = 0;
        for (Client client : clients) {
            profit += client.getCommande().getPrix();
        }
        return profit;
    }

    public static void servirClient(Client client, Random random, ArrayList<Client> clientsResto1, ArrayList<Client> clientsResto2, ArrayList<Client> clientsResto3, ArrayList<Client> clientsExpulses) {
        int resto = random.nextInt(3) + 1;

        if (resto == 1) {
            if (!client.estExpulse()) {
                clientsResto1.add(client);
            } else {
                clientsExpulses.add(client);
            }
        } else if (resto == 2) {
            if (!client.estExpulse()) {
                clientsResto2.add(client);
            } else {
                clientsExpulses.add(client);
            }
        } else {
            if (!client.estExpulse()) {
                clientsResto3.add(client);
            } else {
                clientsExpulses.add(client);
            }
        }

        System.out.println("Restaurant 1 :");
        System.out.println("  Nom : Restaurant 1");
        System.out.println("  Profit total : " + calculerProfit(clientsResto1));
        System.out.println("  Nombre de clients servis : " + clientsResto1.size());

        System.out.println("Restaurant 2 :");
        System.out.println("  Nom : Restaurant 2");
        System.out.println("  Profit total : " + calculerProfit(clientsResto2));
        System.out.println("  Nombre de clients servis : " + clientsResto2.size());

        System.out.println("Restaurant 3 :");
        System.out.println("  Nom : Restaurant 3");
        System.out.println("  Profit total : " + calculerProfit(clientsResto3));
        System.out.println("  Nombre de clients servis : " + clientsResto3.size());

        System.out.println("Clients expulsés :");
        System.out.println("  Nombre de clients expulsés : " + clientsExpulses.size());
    }
}