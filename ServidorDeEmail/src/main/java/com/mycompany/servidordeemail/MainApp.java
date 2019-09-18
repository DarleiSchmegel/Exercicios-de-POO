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
public class MainApp {
    public static void main(String[] args) {
        ServidorDeEmail server = new ServidorDeEmail();
        EMail EmailGui = new EMail("Guilherme@", "Darlei", "Eu sou de Monte Bonito");
        server.enviar(EmailGui);
        EMail EmailDarlei = new EMail("Darlei@", "Guilherme@", "Legal. Eu sou de Sanata Auta");
        server.enviar(EmailDarlei);
        System.out.println(server.quantidadeDeEmails("Guilherme@"));
        server.printa();
    }
}
