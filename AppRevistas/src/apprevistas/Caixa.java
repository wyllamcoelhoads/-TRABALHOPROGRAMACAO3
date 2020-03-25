
package apprevistas;

import java.util.ArrayList;


public class Caixa {
    ArrayList<Caixa> caixa = new  ArrayList();
    private int numero;
    private String idEtiqueta;
    private String cor;

    public Caixa(int numero, String idEtiqueta, String cor) {
        this.numero = numero;
        this.idEtiqueta = idEtiqueta;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Caixa|" + "numero= " + numero + ", idEtiqueta= " + idEtiqueta + ", cor= " + cor + '}';
    }
    
    
}
