
package projetodascanetas;

import java.util.Arrays;

public class Lista {
    
    private final Caneta[] colecao;
    private int numeroDeCanetas;    
    
    /**
     *
     * @param tamanho
     */
    public Lista(int tamanho){
        colecao = new Caneta[tamanho];
        numeroDeCanetas = 0;
    }
    
    /*tamanho Retorna o número de elementos inseridos no vetor (independente do tamanho do mesmo).
    chamei a função tamanho de getNumeroDeCanetas
    */
    public int getNumeroDeCanetas() {
        return numeroDeCanetas;
    }
    
    public void addCaneta(String cor){
        if(this.numeroDeCanetas < colecao.length){
            colecao[numeroDeCanetas] = new Caneta(cor);
            this.numeroDeCanetas += 1;
        }
        else{
            System.out.print("ERRO!!! /nO Vetor de canetas está cheio!");
        }
    }
    /*retornaItem Recebe como parâmetro uma posição do vetor e retorna a caneta que estiver naquela posição;
    se a posição não estiver ocupada ou ultrapassar o tamanho do vetor,
    este método retorna null.*/
       
    public Caneta retornaItem(int posicao){
        return colecao[posicao];
    }
    
    public void imprimir(){
        for(int i = 0; i < numeroDeCanetas; i++){
            System.out.println(
                    "Caneta[" +
                    i + 
                    "]: " + colecao[i]                            
             );
        }
    }
    /* Insira um método ordenar na classe Lista.
    Este método deve ordenar o vetor colecao considerando as cores das canetas. 
    */
    public void ordenar(){
       
        Arrays.sort(colecao);//Só funciona caso todas as posições do vetor estiverem ocupados
        
    }
    
}
