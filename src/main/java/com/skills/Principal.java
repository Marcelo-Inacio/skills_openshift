package com.skills;

import static spark.Spark.setIpAddress;
import static spark.Spark.setPort;
import static spark.Spark.staticFileLocation;

import static spark.Spark.get;

public class Principal {
	
	private static final String IP_ADDRESS = System.getenv("OPENSHIFT_DIY_IP") != null ? System.getenv("OPENSHIFT_DIY_IP") : "localhost";
    private static final int PORT = System.getenv("OPENSHIFT_DIY_PORT") != null ? Integer.parseInt(System.getenv("OPENSHIFT_DIY_PORT")) : 8080;
    
	@SuppressWarnings("deprecation")
	public static void main (String [] args) {
		//setIpAddress(IP_ADDRESS);
        
		//setPort(PORT);
		
		staticFileLocation("/public");
		
		get("/", (request, response) -> {response.redirect("/index.html");return 200;});
    }

}
