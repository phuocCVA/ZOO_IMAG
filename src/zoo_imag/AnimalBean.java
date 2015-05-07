/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_imag;

import java.beans.*;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author ziko
 */
public class AnimalBean implements Serializable {
    
  // Vector<AnimalBean> vect=new Vector<AnimalBean>();
    private PropertyChangeSupport propertySupport;
    
    private  String Type;
    
    private String sexe;
    private double age;
    private  String categorie;
    private String typealiment;

    /**
     * Get the value of typealiment
     *
     * @return the value of typealiment
     */
    public String getTypealiment() {
        return typealiment;
    }

    /**
     * Set the value of typealiment
     *
     * @param typealiment new value of typealiment
     */
    public void setTypealiment(String typealiment) {
        this.typealiment = typealiment;
    }

    private AlimentBean al;

    public AnimalBean(String Type,String sexe, double age,String categorie, AlimentBean al) {
         this.Type = Type;
        this.sexe = sexe;
        this.age = age;
        
        this.al = al;
    }

    /**
     * Get the value of al
     *
     * @return the value of al
     */
    public AlimentBean getAl() {
        return al;
    }

    /**
     * Set the value of al
     *
     * @param al new value of al
     */
    public void setAl(AlimentBean al) {
        this.al = al;
    }

    /**
     * Get the value of categorie
     *
     * @return the value of categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * Set the value of categorie
     *
     * @param categorie new value of categorie
     */
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


    /**
     * Get the value of Categorie
     *
     * @return the value of Categorie
     */
    

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
 
    /**
     * Set the value of Categorie
     *
     * @param Categorie new value of Categorie
     */
   
    

    /**
     * Get the value of age
     *
     * @return the value of age
     */
      public AnimalBean(String Type,String sexe, double age, String categorie) {
         this.Type = Type;
        this.sexe = sexe;
        this.age = age;
        this.categorie=categorie;
    }
        public AnimalBean(String Type,String sexe, String categorie,String typealiment) {
         this.Type = Type;
        this.sexe = sexe;
        
        this.categorie=categorie;
        this.typealiment=typealiment;
    }

    
    public String ChangeIcon(){
        String chemain="";
    if(this.getType().equals("Lapin")){
        chemain="animaux\\lapin.jpg";}
        else 
        if(this.getType().equals("Lion")){
            chemain="animaux\\lion.jpg";
        }
        else
        if(this.getType().equals("singe")){
            chemain="animaux\\singe.jpg";
        } else
            chemain="animaux\\cochon.jpg";
            return chemain;
    }
    
    public String testAgeLapin(){
  return ((this.getAge()>=1.0 && this.getAge()<=6.0 )?"Jeune":(this.getAge()==0.0)?"erreur":"Adulte");
    }
      public String testAgeLion(){
       return (this.getAge()>=0.1) &&(this.getAge()<1.0)?"Bébé":(this.getAge()>=1.0 && this.getAge()<=3.0)?"Jeune":(this.getAge()==0.0)?"erreur":"Adulte";
    }
           public String testAgeSinge(){
  return (this.getAge()>=0.1 && this.getAge()<=0.6 )?"Bébé":(this.getAge()>=0.6 && this.getAge()<=5.0)?"Jeune":(this.getAge()==0.0)?"erreur":"Adulte";
 
    }
             public String testAgeCouchon(){
         String cat="";
     return((this.getAge()<=1.0)&& (this.getAge()>0) ?"Bébé":(this.getAge()==0.0)?"erreur":"Adulte");
    }
public String returncategorie(){
    String cat="";
 if (this.getType().equals("Lapin"))
     cat=testAgeLapin();
 else 
 if (this.getType().equals("Lion"))
     cat=testAgeLion();
 else
 if (this.getType().equals("singe"))
     cat=testAgeSinge();
 else
     if (this.getType().equals("Cochon"))
     cat=testAgeCouchon();
  return cat;
    

}
    @Override
    public String toString() {
         if(this.getType().equals("Lapin"))
      return "en mois";
  else
      return " en Année";
    }
    public String calculBgjournalier(){
    if(this.getType().equals("Lapin"));
   return ""; }
    
  
    /**
     * Set the value of age
     *
     * @param age new value of age
     */
 


    /**
     * Get the value of sexe
     *
     * @return the value of sexe
     */
    public String getSexe() {
        return sexe;
    }
    

    /**
     * Set the value of sexe
     *
     * @param sexe new value of sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Get the value of Type
     *
     * @return the value of Type
     */
    public String getType() {
        return Type;
    }

    /**
     * Set the value of Type
     *
     * @param Type new value of Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AnimalBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
