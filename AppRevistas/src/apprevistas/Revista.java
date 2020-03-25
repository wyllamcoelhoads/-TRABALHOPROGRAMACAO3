
package apprevistas;

import java.util.ArrayList;


public class Revista {
    ArrayList<Revista> revista = new ArrayList();
    ArrayList<Colecao> colecao = new  ArrayList();
    private String nome;
    private int numeroEdicao;
    private int ano;

    @Override
    public String toString() {
        return "Revista|" + " nome= " + nome + ", numeroEdicao= " + numeroEdicao + ", ano= " + ano ;
    }


    public Revista(String nome,int numeroEdicao, int ano) {
        this.numeroEdicao = numeroEdicao;
        this.ano = ano;
        this.nome = nome;
        
    } 

}
