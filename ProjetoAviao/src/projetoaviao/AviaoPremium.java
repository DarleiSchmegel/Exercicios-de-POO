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
public class AviaoPremium extends Aviao{
    private int numeroDeAssentos;
    private int premium;

    public AviaoPremium(int numeroDeAssentos, int premium, int numeroDoAviao, Data dataDePartida) {
        super(numeroDoAviao, dataDePartida);
        this.numeroDeAssentos = numeroDeAssentos;
        this.premium = premium;
    }
    public int maxVagas(){
        return this.numeroDeAssentos;
    }
   
    public int cadeirasPremium(){
        
    }
    
}
