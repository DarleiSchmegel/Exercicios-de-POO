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
public class Data {
    private int data;
    private int mes;
    private int ano;

    public Data(int data, int mes, int ano) {
        this.data = data;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return  data + " / " + mes + " / " + ano;
    }
    
}
