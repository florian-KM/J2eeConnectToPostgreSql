package com.metier.entities;

import java.util.List;

import com.metier.implementation.SymptomeImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymptomeImpl symptomeImpl =new SymptomeImpl();
		
		//creation du symptome
		Symtome symtome = new Symtome("la fiervre");
		symtome.setDescription("si tu chauffe c'est pas bien");
		//symptomeImpl.create_symptome(symtome);
		
		//test de la modification 
		symtome.setId(1);
		symtome.setNom("nouvelle toux");
		symtome.setDescription("la toux n'est pas bien");
		//symptomeImpl.update_symptome(symtome);
		
		//test de la suppression
		//symptomeImpl.delete_symptome(symtome);
		
		//test de la recherche
		//Symtome sym = symptomeImpl.find_symptome(3);
		//System.out.println("le nom est: "+sym.getNom()+ "et la description est:"+sym.getDescription());
		
		//test de la liste de tous les symptomes
		//recuperation de tout les symptomes dans une liste
		List<Symtome> listSymptome = symptomeImpl.list_symptome();
		//on parcout chaque symptome de la liste et on affiche
		for(Symtome symptome: listSymptome) {
			System.out.println("le nom est: "+symptome.getNom()+ "et la description est:"+symptome.getDescription());

		}
		
	}
   
     

}
