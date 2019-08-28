/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientews;

import clientews.*;
/**
 *
 * @author Junior
 */
public class ClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Soma_Service servico = new Soma_Service();
        Soma porta = servico.getSomaPort();
        
        int resposta = porta.somar(230, 120);
        
        System.out.println("Resposta: "+resposta);
        
    }
    
}
