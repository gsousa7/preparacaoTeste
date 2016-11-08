/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author UserPL022Pc18
 */
public class Neurologista extends Medico {

    public Neurologista(int anoDoutoramento, String instEnsino, String idLisenca) {
        super(anoDoutoramento, instEnsino, idLisenca);
    }
    
    public void analisar(Imagiologia tac){}
    
}
