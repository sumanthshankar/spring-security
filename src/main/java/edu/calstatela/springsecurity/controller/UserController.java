package edu.calstatela.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	 @GetMapping("/all")
	    public String hello() {
	        return "Hello Youtube";
	    }

	    @PreAuthorize("hasAuthority('ADMIN')")
	    @GetMapping("/secured/all")
	    public String securedHello() {
	        return "Secured Hello";
	    }
	    
	    @PreAuthorize("hasAuthority('USER')")
	    @GetMapping("/secured/alternate")
	    public String alternate() {
	        return "alternate";
	    }
}
