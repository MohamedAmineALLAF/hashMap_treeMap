import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;
public class Etudiant implements Cloneable, Comparable<Etudiant>  {
    private String nom;
    private String prénom;
    private int CNE;
    private String CIN;

    public Etudiant(String nom, String prénom, int CNE, String CIN) {
        this.nom = nom;
        this.prénom = prénom;
        this.CNE = CNE;
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getCNE() {
        return CNE;
    }

    public void setCNE(int CNE) {
        this.CNE = CNE;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", CNE=" + CNE +
                ", CIN='" + CIN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return CNE == etudiant.CNE && nom.equals(etudiant.nom) && prénom.equals(etudiant.prénom) && CIN.equals(etudiant.CIN);
    }

    @Override
    public int hashCode() {
        return CIN.hashCode();
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.CIN.compareTo(o.CIN);
    }

    @Override
    public Etudiant clone(){
        try{
            return (Etudiant)super.clone();

        }catch(CloneNotSupportedException e){
            System.err.println("erreur de clonage" + e);
            return null;
        }
    }

    public static Comparator<Etudiant> cmpCNE = comparing(Etudiant::getCNE);
}
