package partie2;

import java.util.LinkedList;
import java.util.Queue;

public class Exercice2 {
    public static void main(String[] args) {
        
        Queue<Client> clients = new LinkedList<>();
        clients.add(new Client(101, "youssef"));
        clients.add(new Client(102, "Mohammed"));
        clients.add(new Client(103, "Ayoub"));

        System.out.println("================================\nListe des clients :");
        for (Client c : clients) {
            System.out.println(c.toString());
        }

        System.out.println("================================\nServir le premier client :");
        Client client = clients.poll(); 
        System.out.println((client != null) ? client.toString() + " est servi(e)." : "La liste est vide.");
        
        System.out.println("================================\nAjouter un client :");
        Client newClient = new Client(104, "Moad");
        clients.add(newClient);
        System.out.println(newClient + " a été ajouté(e) à la liste !");

        System.out.println("================================\nLe client en tête :");

        Client next = clients.peek(); 
        System.out.println((client != null) ? "Prochain client : " + client.toString() : "La liste est vide.");
       
    }
}