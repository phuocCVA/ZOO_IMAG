/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_imag;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author ziko
 */
public class LegumeBean implements Serializable {
    
  
    private PropertyChangeSupport propertySupport;
    private String typeleg; // type legume
    private boolean bio;  // bio ou pas

    /**
     * Get the value of bio
     *
     * @return the value of bio
     */
    public boolean isBio() {
        return bio;
    }

    /**
     * Set the value of bio
     *
     * @param bio new value of bio
     */
    public void setBio(boolean bio) {
        this.bio = bio;
    }
// boolean qui signifie Bio ou pas
    /**
     * Get the value of estbio
     *
     * @return the value of estbio
     */
   

    /**
     * Set the value of estbio
     *
     * @param estbio new value of estbio
     */
   

    public LegumeBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    

    /**
     * Get the value of typeleg
     *
     * @return the value of typeleg
     */
    public String getTypeleg() {
        return typeleg;
    }

    /**
     * Set the value of typeleg
     *
     * @param typeleg new value of typeleg
     */
    public void setTypeleg(String typeleg) {
        this.typeleg = typeleg;
    }
 public double prixTubercules(){
     return ((this.isBio()==true)?2.0:1.5);
 }
 public double prixFruits(){
return ((this.isBio()==true)?3.0:1.0);
 }
  public double prixSecs(){
return ((this.isBio()==true)?1.0:0.75);
 }
  public double prixLegumes()
  { double prix=0.0
          
          ;
       if(this.getTypeleg().equals("Tubercules"))
           prix=prixTubercules();
       else
         if(this.getTypeleg().equals("Fruits"))
            prix=prixFruits();
         else   if(this.getTypeleg().equals("Secs"))
           prix=prixSecs();
           
       return prix;
  }
 
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
