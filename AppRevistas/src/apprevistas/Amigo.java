
package apprevistas;


public class Amigo {
    private String nome;
    private String telefone;
    private String localizacaoamigo;

    public Amigo(String nome, String telefone, String localizacaoamigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.localizacaoamigo = localizacaoamigo;
    }
    

    @Override
    public String toString() {
        return "Amigo|" + "nome= " + nome + ", telefone= " + telefone + ", localizacaoamigo= " + localizacaoamigo + '}';
    }
    
}

