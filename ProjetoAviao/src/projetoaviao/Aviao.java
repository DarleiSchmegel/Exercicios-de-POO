/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaviao;

/**
 *
 * @author aluno
 */
public class Aviao {
    private int numeroDoAviao;
    private Data dataDePartida;
    protected boolean[] numeroDeAssentos;
    /*Configura os dados do avião(recebidos como parâmetro): 
    número do avião (int)
    e data de partida (a data modelada pela classe Data).*/
    
    public Aviao(int numeroDoAviao, Data dataDePartida) {
        this.numeroDoAviao = numeroDoAviao;
        this.dataDePartida = dataDePartida;
        this.numeroDeAssentos = new boolean[300];
        for (boolean numeroDeAssento : numeroDeAssentos) {
            numeroDeAssento = false;
        }
        
    }
    public int proximoLivre(){
        for(int i = 0 ; i < this.numeroDeAssentos.length;i++){
            if(!this.numeroDeAssentos[i]){
                return i;
                
            }
        }
        return -1;        
    }
    public boolean verifica(int numeroAsssentoRecebido){
        return this.numeroDeAssentos[numeroAsssentoRecebido];
    }
    public boolean ocupa(int assento){
        if(!this.numeroDeAssentos[assento]){
            this.numeroDeAssentos[assento] = true;
            return true;
        }else{
            return false;
        }
    }
    public int vagas(){
        int cont = 0;
        for (boolean numeroDeAssento : numeroDeAssentos) {
            if(!numeroDeAssento){
                cont++;
            }
        }
        return cont;
    }

    public int getNumeroDoAviao() {
        return numeroDoAviao;
    }

    public Data getDataDePartida() {
        return dataDePartida;
    }
    
}
