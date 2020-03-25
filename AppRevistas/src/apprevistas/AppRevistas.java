
package apprevistas;

import java.util.ArrayList;


public class AppRevistas {

    public static void main(String[] args) {   
         ArrayList<Amigo> amigo = new ArrayList();
         ArrayList<Revista> revista = new ArrayList();
         ArrayList<Colecao> colecao = new  ArrayList();
         ArrayList<Caixa> caixa = new  ArrayList();
         revista.add(new Revista("LANTERNA VERDE",01,1995));
         revista.add(new Revista("X-MAN",1,2001));
         revista.add(new Revista("starwars",1,2052));
         revista.add(new Revista("STAR WARS",04,2011));
         amigo.add(new Amigo("WILLIAM","985455847","EMPRESA"));
         amigo.add(new Amigo("BIWTED","452568520","CASA"));
         amigo.add(new Amigo("LORHANA","9585685","LOJA"));
         amigo.add(new Amigo("STIVE","0805825","RUA DAS MARGARIDAS"));
         colecao.add(new Colecao("LIMITED EDITION"));
         colecao.add(new Colecao("NEW WDITION"));
         colecao.add(new Colecao("DARK EDITION"));
         caixa.add(new Caixa(52,"A01","VERDE"));
         
         //Emprestimo feito = new Emprestimo();
         ArrayList<Emprestimo> empresti = new ArrayList();
         empresti.add(new Emprestimo(amigo.get(0),revista.get(0),colecao.get(0),caixa.get(0),"31/07/2012","NAO DEVOLVEU"));
         empresti.add(new Emprestimo(amigo.get(1),revista.get(1),colecao.get(1),caixa.get(0),"31/07/2012","20/08/20143"));
         empresti.add(new Emprestimo(amigo.get(2),revista.get(2),colecao.get(2),caixa.get(0),"31/07/2012","01/02/2018"));
         empresti.add(new Emprestimo(amigo.get(3),revista.get(3),colecao.get(2),caixa.get(0),"31/07/2012","12/03/2012"));
        // System.out.println(amigo.toString());
        // System.out.println(revista.toString());
         for(int i=0; i<empresti.size(); i++){
             System.out.println(empresti.get(i));
         }
         

         

         
    }
    
}
