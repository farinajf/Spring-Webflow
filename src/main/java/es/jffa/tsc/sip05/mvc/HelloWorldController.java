/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.jffa.tsc.sip05.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fran
 */
@Controller
public class HelloWorldController implements java.io.Serializable {
    private static final long serialVersionUID = -1L;
    private static final String _NAME = HelloWorldController.class.getSimpleName();

    /*------------------------------------------------------------------------*/
    /*                          Metodos Privados                              */
    /*------------------------------------------------------------------------*/

    /*------------------------------------------------------------------------*/
    /*                          Default Access                                */
    /*------------------------------------------------------------------------*/

    /*------------------------------------------------------------------------*/
    /*                          Metodos Protegidos                            */
    /*------------------------------------------------------------------------*/

    /*------------------------------------------------------------------------*/
    /*                            Constructores                               */
    /*------------------------------------------------------------------------*/
    /**
     * Constructor por defecto.
     */
    public HelloWorldController() {}

    /*------------------------------------------------------------------------*/
    /*                          Metodos Publicos                              */
    /*------------------------------------------------------------------------*/
    /**
     *
     * @return
     */
    @RequestMapping("/helloWorldControllerTest")
    public String showTestPage() {
        System.out.println("Hola");
        return "helloWorld";
    }
}
