
package apprevistas;

import java.util.ArrayList;


public class Emprestimo {
    ArrayList<Amigo> amigo = new ArrayList();
    ArrayList<Revista> revista = new ArrayList();
    ArrayList<Colecao> colecao = new  ArrayList();
    ArrayList<Caixa> caixa = new  ArrayList();
    
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Amigo amigo, Revista revista, Colecao colecao,Caixa caixa,String dataEmprestimo, String dataDevolucao) {
        this.amigo.add(amigo);
        this.revista.add(revista);
        this.colecao.add(colecao);
        this.caixa.add(caixa);
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }   

    @Override
    public String toString() {
        return "Emprestimo|"+ amigo +  revista + colecao + caixa + ", dataEmprestimo= " + dataEmprestimo + ", dataDevolucao= " + dataDevolucao + '}';
    }


}
