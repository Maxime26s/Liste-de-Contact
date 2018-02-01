public class Contact {
    private String prenom;
    private String nom;
    private int nbTelephone=0;
    private Adresse adresse = new Adresse();
    private Occupation occupation = new Occupation();
    private Telephone[] telephone=new Telephone[10];

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbTelephone() {
        return nbTelephone;
    }

    public void setNbTelephone(int nbTelephone) {
        this.nbTelephone = nbTelephone;
    }

    public Adresse getAdresse() { return adresse; }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Telephone[] getTelephone() { return telephone; }

    public void setTelephone(Telephone[] telephone) { this.telephone = telephone; }
}

