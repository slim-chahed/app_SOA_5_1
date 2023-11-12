package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// L'annotation @WebService indique que cette classe est un service web
@WebService
public class BanqueService {

    // Méthode de conversion annotée avec @WebMethod
    @WebMethod
    public double conversion(@WebParam double montant) {
        // Logique de conversion ici (exemple : conversion simple, multiplie le montant par 3.3)
        return montant * 3.3;
    }

    // Méthode getComptes annotée avec @WebMethod
    @WebMethod
    public List<Compte> getComptes() {
        // Crée une liste de comptes pour démonstration
        ArrayList<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte("1", 400, new Date()));
        comptes.add(new Compte("2", 400, new Date()));
        comptes.add(new Compte("3", 400, new Date()));

        // Retourne la liste des comptes
        return comptes;
    }
}
