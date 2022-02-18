package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metier.entities.Symtome;
import com.metier.implementation.SymptomeImpl;

/**
 * Servlet implementation class SymptomeController
 */
@WebServlet("/SymptomeController")
public class SymptomeController extends HttpServlet {
	
	//instanciation de notre couche metier
	SymptomeImpl symptomeImpl;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public SymptomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() {
    	//initialisation de notre couche metier
    	symptomeImpl = new SymptomeImpl();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		String mode = request.getParameter("mode");
		
		if(mode!=null && mode.equals("editer")) {
			request.setAttribute("mode", mode);
			request.setAttribute("id", Integer.parseInt(request.getParameter("id")));
			request.setAttribute("nom", request.getParameter("nom"));
			request.setAttribute("description", request.getParameter("description"));
			
		}
		else {
			request.setAttribute("mode", "ajouter");
			
		}
		System.out.println("action est :"+action);
		
		if(action!=null) {
			if(action.equals("ajouter")) {
				//recuperation des champs de la vue
				String nom = request.getParameter("nom");
				String description = request.getParameter("description");
				//on construit l'object
				Symtome symptome =new Symtome(nom, description);
				//enregistrement dans la base de donnee
				symptomeImpl.create_symptome(symptome);
			}
			else if(action.equals("editer")) {
				//recuperation des champs de la vue
				int id = Integer.parseInt(request.getParameter("id"));
				//on recherche dans la base de donnee element a modifier
				Symtome findSymp = symptomeImpl.find_symptome(id);
				if( findSymp!=null) {
					String nom = request.getParameter("nom");
					String description = request.getParameter("description");
					findSymp.setNom(nom);
					findSymp.setDescription(description);
					//on modifie dans la base de donnee
					symptomeImpl.update_symptome(findSymp);
				}
			
			}
			else if(action.equals("delete")) {
				int id = Integer.parseInt(request.getParameter("id"));
				symptomeImpl.delete_symptome(id);
			}
		}
		
		//recuperation de tout les symptomes.
		List<Symtome> listSymptome = symptomeImpl.list_symptome();
		request.setAttribute("list", listSymptome);
		request.getRequestDispatcher("symptome_table.jsp").forward(request, response);
	}

}
