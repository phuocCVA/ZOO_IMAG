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
public class GlobalBean implements Serializable {
    
    private static String typeanimal;
    private static double budgettotal;
    private static String Category;
    private static int Item;

    /**
     * Get the value of Item
     *
     * @return the value of Item
     */
    public int getItem() {
        return Item;
    }

    /**
     * Set the value of Item
     *
     * @param Item new value of Item
     */
    public void setItem(int Item) {
        this.Item = Item;
    }


    /**
     * Get the value of Category
     *
     * @return the value of Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * Set the value of Category
     *
     * @param Category new value of Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

   

    /**
     * Get the value of category
     *
     * @return the value of category
     */
  

    /**
     * Set the value of category
     *
     * @param category new value of category
     */
  

    /**
     * Get the value of budgettotal
     *
     * @return the value of budgettotal
     */
    public  double getBudgettotal() {
        return budgettotal;
    }

    /**
     * Set the value of budgettotal
     *
     * @param budgettotal new value of budgettotal
     */
    public  void setBudgettotal(double budgettotal) {
        GlobalBean.budgettotal = budgettotal;
    }

    /**
     * Get the value of typeanimal
     *
     * @return the value of typeanimal
     */
    public String getTypeanimal() {
        return typeanimal;
    }

    /**
     * Set the value of typeanimal
     *
     * @param typeanimal new value of typeanimal
     */
    public void setTypeanimal(String typeanimal) {
        this.typeanimal = typeanimal;
    }

    private PropertyChangeSupport propertySupport;
    
    public GlobalBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
   
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
