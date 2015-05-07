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
public class BudgetBean implements Serializable {
    
    
    private PropertyChangeSupport propertySupport;
    private int NombreVisit;

    /**
     * Get the value of NombreVisit
     *
     * @return the value of NombreVisit
     */
    public int getNombreVisit() {
        return NombreVisit;
    }

    @Override
    public String toString() {
        return "Budget Total="+(this.getPrixTicket()*this.getNombreVisit())+"  €";
    }

    /**
     * Set the value of NombreVisit
     *
     * @param NombreVisit new value of NombreVisit
     */
    public void setNombreVisit(int NombreVisit) {
        this.NombreVisit = NombreVisit;
    }
    protected double PrixTicket;

    /**
     * Get the value of PrixTicket
     *
     * @return the value of PrixTicket
     */
    public double getPrixTicket() {
        return PrixTicket;
    }

    /**
     * Set the value of PrixTicket
     *
     * @param PrixTicket new value of PrixTicket
     */
    public void setPrixTicket(double PrixTicket) {
        this.PrixTicket = PrixTicket;
    }

    public BudgetBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    

    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
