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

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "Somar")
    public int Somar(@WebParam(name = "number1") int number1, @WebParam(name = "number2") int number2) {
        //TODO write your implementation code here:
        return number1+number2;
    }
}
