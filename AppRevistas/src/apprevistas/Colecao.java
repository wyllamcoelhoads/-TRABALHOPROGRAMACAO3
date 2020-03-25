
package apprevistas;

import java.util.ArrayList;


public class Colecao {
    ArrayList<Colecao> colecao = new  ArrayList();
    private String  nome;

    public Colecao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Colecao|" + this.nome + '}';
    }
}
