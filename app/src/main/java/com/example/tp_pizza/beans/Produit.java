package com.example.tp_pizza.beans;

public class Produit {

    private int id ;
    private String nom ;
    private int nbrIngredients ;
    private int photo ;
    private String duree ;
    private String detailsIngred ;
    private String descreption ;
    private String preparation ;
    private static int comp ;

    public Produit(){
    }
    public Produit(String nom, int nbrIngredients, int photo, String duree, String detailsIngred ,String descreption ,String preparation){
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients ;
        this.photo = photo ;
        this.duree = duree ;
        this.detailsIngred = detailsIngred;
        this.descreption = descreption ;
        this.preparation = preparation ;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public String getDescreption() {
        return descreption;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", descreption='" + descreption + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
