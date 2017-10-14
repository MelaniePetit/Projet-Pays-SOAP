package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.PaysServiceMonExceptionException;
import ws.PaysServiceStub;
import ws.PaysServiceStub.GetListeTousLesPays;
import ws.PaysServiceStub.GetListeTousLesPaysResponse;

@WebServlet("/TraitementListe")
public class ControleurListe extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ControleurListe() {
		super();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			appelWebservice(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			appelWebservice(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	public void appelWebservice(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
			
		// on se connecte au stub
		PaysServiceStub service = new PaysServiceStub();
		
		try {
			// on d�finit une r�f�rence sur la m�thode � appeler
			GetListeTousLesPays mesPays = new GetListeTousLesPays();
			// on d�nit un objet pour r�cup�rer les donn�es de la m�thode get...()
			GetListeTousLesPaysResponse sr;
			// On construit une collection avec le type fourni par le web service
			List<ws.PaysServiceStub.Pays> listePays = new ArrayList<ws.PaysServiceStub.Pays>();
			// On construit une r�f�rence sur la m�thode get... ()
			sr = service.getListeTousLesPays(mesPays);
			// On r�cup�re les donn�es dans un tableau 
			ws.PaysServiceStub.Pays[] tabPays = sr.get_return();
			//On tranforme en liste
			for (int i = 0; i < tabPays.length; i++) {
				listePays.add(tabPays[i]);
			}
			//stock tout dans la variable liste que l'on peut appeler dans la jsp
			request.setAttribute("liste", listePays);
			
			this.getServletContext()
			.getRequestDispatcher("/ListePays.jsp")
			.forward(request, response);
			
		} catch (PaysServiceMonExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
