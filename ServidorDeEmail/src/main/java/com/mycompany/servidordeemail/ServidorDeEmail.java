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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ServidorDeEmail {
    private List<EMail> emails;

    public ServidorDeEmail() {
        emails = new ArrayList<>();
    }
    
    public int quantidadeDeEmails(String destinatario){
        int cont = 0;
        
        for (EMail email : emails) {
           if(email.getDestinatario().equals(destinatario)){
               cont++;
           }
        }
        return cont;
    } 
    public EMail proximoEmail(String destinatario){
        Iterator<EMail> it = emails.iterator();
        
        while(it.hasNext()){
            EMail e = it.next();
            if(e.getDestinatario().equals(destinatario));
            it.remove();
            return e;
        }
        return null;
    }
    
    public void enviar(EMail newEmail){
        emails.add(newEmail);
    }
    public void printa(){
        Iterator<EMail> it = emails.iterator();
        
        while(it.hasNext()){
            EMail e = it.next();
            e.imprimir();
            
            
        }
        
    }
    
}
