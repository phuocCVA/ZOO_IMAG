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
public class HerbeBean implements Serializable {
    
    private String typeh; // type herbe

    /**
     * Get the value of typeh
     *
     * @return the value of typeh
     */
    public String getTypeh() {
        return typeh;
    }

    /**
     * Set the value of typeh
     *
     * @param typeh new value of typeh
     */
    public void setTypeh(String typeh) {
        this.typeh = typeh;
    }

    private PropertyChangeSupport propertySupport;
    
    public HerbeBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
  public double prixHerbe(){
  if(this.getTypeh().equals("fraiche"))
      return 2.0;
  else
      return 3.0;
  }
 
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
