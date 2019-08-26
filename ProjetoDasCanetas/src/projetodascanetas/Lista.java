
package projetodascanetas;

public class Lista {
    
    private Caneta[] colecao;
    private int numeroDeCanetas;
    
    public Lista(int tamanho){
        colecao = new Caneta[tamanho];
        numeroDeCanetas = 0;
    } 

    public Caneta[] getColecao() {
        return colecao;
    }
    /*
    public void setColecao(Caneta[] colecao) {
        this.colecao = colecao;
    }*/

    public int getNumeroDeCanetas() {
        return numeroDeCanetas;
    }
    /*
    public void setNumeroDeCanetas(int numeroDeCanetas) {
        this.numeroDeCanetas = numeroDeCanetas;
    }*/
    
    public void addCaneta(String cor){
        colecao[numeroDeCanetas] = new Caneta(cor);
        this.numeroDeCanetas += 1; 
    }
    
    
    
    
    
    
    
    
    public void imprimir(){
        for(int i = 0; i < numeroDeCanetas; i++){
            System.out.println(
                    "Caneta[" +
                    i + 
                    "]: " + colecao[i].getCor()                            
             );
        }
    }
    
}
