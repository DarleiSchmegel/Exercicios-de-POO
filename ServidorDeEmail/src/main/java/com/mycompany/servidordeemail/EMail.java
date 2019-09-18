/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidordeemail;

/**
 *
 * @author aluno
 */
public class EMail {
    private String remetente;
    private String destinatario;
    private String mensagem;

    public EMail(String remetente, String destinatario, String mensagem) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }
    public void imprimir(){
        System.out.printf("%n============%n" +
                "Remetente : " + remetente
                + "%nDestinatário : " + destinatario
                + "%nMenssagem : %n" + mensagem
                +"%n============%n");
    }

    
}
