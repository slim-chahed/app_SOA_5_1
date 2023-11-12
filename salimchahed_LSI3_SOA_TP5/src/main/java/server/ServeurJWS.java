package server;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;
public class ServeurJWS {
    public static void main(String[] args) {
        // Crée une instance du service bancaire
        BanqueService bs = new BanqueService();
        // Définit l'URL du service web
        String url = "http://localhost:8084/";
        // Publie le service web à l'URL spécifiée
        Endpoint.publish(url, bs);
        // Affiche l'URL du serveur une fois qu'il est lancé
        System.out.println("Server url: " + url);
    }
}
