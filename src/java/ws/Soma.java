/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Junior
 */
@WebService(serviceName = "Soma")
@Stateless()
public class Soma {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "welcome")
    public String welcome(@WebParam(name = "name") String txt) {
        return "Welcome " + txt + " !";
    }

    @WebMethod(operationName = "Somar")
    public int Somar(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        int soma = numero1 + numero2;
        return soma;
    }
    
    @WebMethod(operationName = "Calcular")
    public double Calcular(@WebParam(name="option") String option, @WebParam(name="num1") double num1, @WebParam(name="num2") double num2){
        double calc = 0;
        
        if(option.equalsIgnoreCase("adicao")){
            calc = num1 + num2;
        }
        if(option.equalsIgnoreCase("subtracao")){
            calc = num1 - num2;
        }
        if(option.equalsIgnoreCase("multiplicacao")){
            calc = num1 * num2;
        }
        if(option.equalsIgnoreCase("divisao")){
            calc = num1 / 2;
        }
        
        return calc;
        
    }

    @WebMethod(operationName = "Saudacoes")
    public String operação(@WebParam(name = "nome") String nome, @WebParam(name = "idade") int idade, @WebParam(name = "sexo") String sexo, @WebParam(name = "cidade") String cidade) {
        
        String phare1 = "\nWelcome to my first application using Webservice SOAP!";
        String phare2 = "\nHow are you, "+nome;
        String phare3 = "\nYou are "+sexo+"with "+idade+" years old.";
        String phare4 = "\nAnd you live in "+cidade;
 
        return phare1 + phare2 + phare3 + phare4;
    }
    
    
}
