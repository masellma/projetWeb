/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.test;

import atos.shop.service.UtilisateurService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class TestDB {
    
    UtilisateurService service = new UtilisateurService();
    
    @Test
    public void loginVerifyTestOK(){
       Boolean bool = service.loginVerify("login", "password");
        
        if (!bool) {
            System.err.println("Nope");
        } else {
            System.out.println("OK");
        }
    }
    
}
