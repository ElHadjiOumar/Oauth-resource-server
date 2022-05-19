package com.itns.oauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller class that handles the HTTP requests.
 */
@RestController
public class UserController {

    /**
     * It returns an array of strings
     * 
     * @return String array
     */
    @GetMapping("/api/users")
    public String[] getUser() {
        return new String[]{"OUMAR", "MR ZIAD","Mme Francoise"};
    }
}
