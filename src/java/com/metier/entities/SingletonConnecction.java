package com.metier.entities;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnecction {
	public static Connection connexion;
	
		static{
			try {
				Class.forName("org.postgresql.Driver");
				connexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test36", "postgres", "florian");
				System.out.println("Connexion effective !");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("pas vraiment bon");
			}
			
		}

		public static Connection getConnexion() {
			return connexion;
		}
		
	
}
