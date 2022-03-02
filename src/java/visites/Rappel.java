/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visites;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Rappel {
    // declaration d'un arrayList<Rendezvous>
   private  List<Rendezvous> rdvs=new ArrayList<Rendezvous>();
    // List<Type> nom=new ArrayList<Type>();

    public Rappel() {
        Rendezvous rd1=new Rendezvous("teste", "20/03/3033", "10:30", "seance java");
        Rendezvous rd2=new Rendezvous("en ligne", "21/03/3033", "10:30", "seance jsp");
        rdvs.add(rd1);
        rdvs.add(rd2);
        
    }

    public List<Rendezvous> getRdvs() {
        return rdvs;
    }
    
    
    
    
    
    
    
    
}
