package client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.PaysServiceMonExceptionException;
import ws.PaysServiceStub;
import ws.PaysServiceStub.GetUnPays;

@WebServlet("/Detail")
public class ControleurDetail extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControleurDetail() {
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
			appelWebserviceDetail(request, response);
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
			appelWebserviceDetail(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	public void appelWebserviceDetail(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
			
		String nom  = request.getParameter("nomPays");
		
		// on se connecte au stub
		PaysServiceStub service = new PaysServiceStub();
		
		try {
			// on définit une référence sur la méthode à appeler
			PaysServiceStub.GetUnPays unPays = new GetUnPays();
			// on définit un objet pour récupérer les données de la méthode GetUnProprietaure()
			PaysServiceStub.GetUnPaysResponse sr; 
			// On passe le paramètre 
			unPays.setNomp(nom);
			// On construit une référence sur la méthode getUnProprietaire()
			sr = service.getUnPays(unPays);
			// On récupère les données dans un tableau 
			ws.PaysServiceStub.Pays monPays = sr.get_return();
			request.setAttribute("pays", monPays);
			
			this.getServletContext()
			.getRequestDispatcher("/DetailPays.jsp")
			.forward(request, response);
		} catch (PaysServiceMonExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	
}
