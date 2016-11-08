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
public class Medico{
    int anoDoutoramento;
    String instEnsino, idLisenca;

    public Medico(int anoDoutoramento, String instEnsino, String idLisenca) {
        this.anoDoutoramento = anoDoutoramento;
        this.instEnsino = instEnsino;
        this.idLisenca = idLisenca;
    }

    public int getAnoDoutoramento() {
        return anoDoutoramento;
    }

    public void setAnoDoutoramento(int anoDoutoramento) {
        this.anoDoutoramento = anoDoutoramento;
    }

    public String getInstEnsino() {
        return instEnsino;
    }

    public void setInstEnsino(String instEnsino) {
        this.instEnsino = instEnsino;
    }

    public String getIdLisenca() {
        return idLisenca;
    }

    public void setIdLisenca(String idLisenca) {
        this.idLisenca = idLisenca;
    }

  public void prescreverTratamento() {
      
  }
    
}
    
