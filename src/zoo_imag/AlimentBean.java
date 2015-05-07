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

public class AlimentBean implements Serializable {
  AnimalBean a=new AnimalBean(); 
  GlobalBean gl=new GlobalBean();
 private ViandeBean v;
  private LegumeBean L;
  private HerbeBean H;
  
    private PropertyChangeSupport propertySupport;
   
    public AlimentBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
  public String[] plat(){
      // AnimalBean a=new AnimalBean(); 
      if(this.gl.getTypeanimal().equals("Lapin"))    //this.a.getType().equals("Lapin")
          
      { 
           String []t={"","","",""};
      t[0]="50 gr. d’herbe verte et 1 kilo de tubercules";
      t[1]="50 gr. d'herbe verte et 1 kilo de fruits";
      t[2]=" 2 kilos de tubercules";
      t[3]="1 kilo de tubercules et 1 kilo de fruits";
      return t;}
      else
         if(this.gl.getTypeanimal().equals("Lion")) 
           { String []t={"","","","",""};
           t[0]="Viande rouge qualité 1 (5kg)";
   t[1]="50 gr. d’herbe verte et 1 kilo de fruits";
   t[2]="10 kilos de viande rouge et 2 kilos de fruits";
   t[3]="15 kilos de viande rouge";
   t[4]="20 kilos de viande rouge";
   return t;}
         else if(this.gl.getTypeanimal().equals("singe")) 
         {  String []t={"","",""};
                     t[0]="Lait maternel";
                     t[1]="2 kilos de fruits uniquement bio";
                     t[2]="3 kilos de fruits bio ou non";
         return t;}
      else
         { 
              String []t={"",""};
              t[0]="2 kilos des légumes.";
               t[1]="5 kilos des légumes";
               return t;}
     
  }
  /**
   en fait on a pas eu le temps de finir le calcule de budjet journalieur
   parceque pour calcule le budjet journaliere de chaque animal il faut tester 
   pour chaque animal l'indexItem de jCombobox2
   pour connaître le repas choisi et après teste aussi  si le type de legume 
   choisi est bio ou pas 
   
 //  budget journalier
    public double calcculbj(){
        double bj=0.0;
      if(this.gl.getTypeanimal().equals("Lapin")){
          switch (this.gl.getItem())
              case 0: if(L.getTypeleg().equals("Tubercules")&&L.isBio()){
                 
                          bj=L.prixTubercules();
              }
     return 0.0;   
    }
   * 
   */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}
