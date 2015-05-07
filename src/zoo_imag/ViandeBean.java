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
public class ViandeBean implements Serializable {
    
  
    private PropertyChangeSupport propertySupport;
    
    public ViandeBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    private int qualite;

    /**
     * Get the value of qualite
     *
     * @return the value of qualite
     */
    public int getQualite() {
        return qualite;
    }

    /**
     * Set the value of qualite
     *
     * @param qualite new value of qualite
     */
    public void setQualite(int qualite) {
        this.qualite = qualite;
    }


    /**
     * Get the value of Qualite
     *
     * @return the value of Qualite
     */
  

    /**
     * Set the value of Qualite
     *
     * @param Qualite new value of Qualite
     */
    
public double prix()
{
 if(this.getQualite()==1)
     return 5.0;
 else return 2.0;
}
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
