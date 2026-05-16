package partie2;

public class Client {
    private int numero;
    private String nom;

    public Client(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }
    
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
    public String toString() {
        return "Client N° : " + numero + " | Nom : " + nom;
    }
}