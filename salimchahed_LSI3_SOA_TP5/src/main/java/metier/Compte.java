package metier;
import java.util.Date;
// La classe Compte représente une entité de compte bancaire
public class Compte {
    private String code;// Le code du compte
    private double solde;// Le solde du compte
    private Date dateCreation;// La date de création du compte
    // Constructeur par défaut
    public Compte() {
    }
    // Constructeur avec paramètres pour initialiser les attributs
    public Compte(String code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
    // Méthode getter pour obtenir le code du compte
    public String getCode() {
        return code;
    }
    // Méthode setter pour définir le code du compte
    public void setCode(String code) {
        this.code = code;
    }
    // Méthode getter pour obtenir le solde du compte
    public double getSolde() {
        return solde;
    }
    // Méthode setter pour définir le solde du compte
    public void setSolde(double solde) {
        this.solde = solde;
    }
    // Méthode getter pour obtenir la date de création du compte
    public Date getDateCreation() {
        return dateCreation;
    }
    // Méthode setter pour définir la date de création du compte
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
