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
			// on d�finit une r�f�rence sur la m�thode � appeler
			PaysServiceStub.GetUnPays unPays = new GetUnPays();
			// on d�finit un objet pour r�cup�rer les donn�es de la m�thode GetUnProprietaure()
			PaysServiceStub.GetUnPaysResponse sr; 
			// On passe le param�tre 
			unPays.setNomp(nom);
			// On construit une r�f�rence sur la m�thode getUnProprietaire()
			sr = service.getUnPays(unPays);
			// On r�cup�re les donn�es dans un tableau 
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
