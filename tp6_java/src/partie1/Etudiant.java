package partie1;

import java.util.UUID;

public class Etudiant implements Comparable<Etudiant> {
    private UUID id;
    private String nom;
    private double moyenne;

    public Etudiant(String nom, double moyenne) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public UUID getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }
    
    public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	@Override
    public String toString() {
        return "ID Étudiant : " + id + " | Nom : " + nom + " | Moyenne : " + moyenne;
    }

    @Override
    public int compareTo(Etudiant autre) {
        return Double.compare(this.moyenne, autre.moyenne);
    }
}