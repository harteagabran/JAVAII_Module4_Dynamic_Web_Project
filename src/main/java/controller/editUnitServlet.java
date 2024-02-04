package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StatMaker;

/**
 * Servlet implementation class editUnitServlet
 */
@WebServlet("/editUnitServlet")
public class editUnitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editUnitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String str = request.getParameter("strength");
		String spd = request.getParameter("speed");
		String def = request.getParameter("defense");
		
		StatMaker edit = new StatMaker(name, str, spd, def);
		
		request.setAttribute("edit", edit);
		
		getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String str = request.getParameter("strength");
		String spd = request.getParameter("speed");
		String def = request.getParameter("defense");
		
		StatMaker unit = new StatMaker(name, str, spd, def);
		
		request.setAttribute("unit", unit);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
