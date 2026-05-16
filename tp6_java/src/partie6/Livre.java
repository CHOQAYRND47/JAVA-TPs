package partie6;

import java.util.Objects;

public class Livre {
    private String isbn;
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String isbn, String titre, String auteur, int annee) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnnee() {
        return annee;
    }
    
    

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
    public String toString() {
        return "Titre : " + titre + " | Auteur : " + auteur + " | Année : " + annee + " | ISBN : " + isbn;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(isbn, livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}