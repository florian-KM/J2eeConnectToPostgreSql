package com.metier.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metier.Interface.SymptomeInterface;
import com.metier.entities.SingletonConnecction;
import com.metier.entities.Symtome;


public class SymptomeImpl implements SymptomeInterface{
	
	//recuperation de la connection avec la base de donnee
	Connection connection;
	
	public SymptomeImpl(){
		connection = SingletonConnecction.getConnexion();
	}
	@Override
	public void create_symptome(Symtome symptome) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement ps =  connection.prepareStatement("insert into SYMPTOMS(name,description) values (?,?)");
			ps.setString(1, symptome.getNom());
			ps.setString(2, symptome.getDescription());
			ps.executeUpdate();
			System.out.println("le symptome a ete ajoute avec success");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update_symptome(Symtome symptome) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps =  connection.prepareStatement("update SYMPTOMS set name=?,description=? where SYMPTOME_ID=? ");
			ps.setString(1, symptome.getNom());
			ps.setString(2, symptome.getDescription());
			ps.setInt(3, symptome.getId());
			ps.executeUpdate();
			System.out.println("le symptome a ete modifie avec success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete_symptome(int symptome_id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps =  connection.prepareStatement("delete from SYMPTOMS where SYMPTOME_ID=? ");
			ps.setInt(1, symptome_id);
			ps.executeUpdate();
			System.out.println("le symptome à ete supprime avec success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Symtome find_symptome(int symptome_id) {
		// TODO Auto-generated method stub
		Symtome symptome = null;
		try {
			PreparedStatement ps =  connection.prepareStatement("select * from SYMPTOMS where SYMPTOME_ID=? ");
			ps.setInt(1, symptome_id);
			//recuperation des resultats
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//si l'object existe dans la base de donnee
				symptome = new Symtome();
				//recuperarion des attributs
				symptome.setId(rs.getInt("symptome_id"));
				symptome.setNom(rs.getString("name"));
				symptome.setDescription(rs.getString("description"));
				
				System.out.println("recherche du symptome avec success");
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return symptome; 
	}

	@Override
	public List<Symtome> list_symptome() {
		// TODO Auto-generated method stub
		// au debut la liste des symptomes est vide
		List<Symtome> list_symptome = new ArrayList<Symtome>();
		Symtome symptome = null;
		try {
			PreparedStatement ps =  connection.prepareStatement("select * from SYMPTOMS");

			//recuperation des resultats
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				//si l'object existe dans la base de donnee
				symptome = new Symtome();
				//recuperarion des attributs
				symptome.setId(rs.getInt("symptome_id"));
				symptome.setNom(rs.getString("name"));
				symptome.setDescription(rs.getString("description"));
				//on ajoute le symptome dans la liste
				list_symptome.add(symptome);
				
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return list_symptome;
	}

}
