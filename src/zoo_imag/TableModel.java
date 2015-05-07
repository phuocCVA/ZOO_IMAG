/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_imag;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ziko
 */

public class TableModel extends AbstractTableModel{
 AnimalBean a=new AnimalBean();
   
    Vector<AnimalBean> ve=new Vector<AnimalBean>();
     
    String[] titres={"Animal","sexe","Categorie","Type Nouriture /Jour"};
   

    public  TableModel() {
       ve=getAnimals();
    }



    public int getRowCount() {
        return ve.size();
    }

    @Override
    public String getColumnName(int column) {
        return titres[column];
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       AnimalBean an=ve.get(rowIndex);
        
      
        switch(columnIndex){
          
            case 0: return an.getType();
            case 1: return an.getSexe();
            case 2: return  an.getCategorie();
              case 3: return an.getTypealiment();
             
            default:return null;
        }
    }
    public void addAnimal(AnimalBean Animal){
       
            ve.add(Animal);
          fireTableRowsInserted(ve.size()-1, ve.size()-1);
        
    }
   Vector<AnimalBean> getAnimals(){
      Vector<AnimalBean> v=new Vector<AnimalBean>();
          
         
      for (int i = 1; i < ve.size(); i++) {
           String t=ve.get(i).getType();
           String s=ve.get(i).getSexe();
           String ac=ve.get(i).getCategorie();
           String ak=ve.get(i).getCategorie();
         AnimalBean animale=new AnimalBean(t,s,ac,ak);  
         v.add(animale);
       }
     //   AnimalBean animale=new AnimalBean(t,s,ac); */
   
             
            
        
        return v;
    }


 
}
