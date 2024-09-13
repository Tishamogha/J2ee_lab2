

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SocketMachine
 */
@WebServlet("/SocketMachine")
public class SocketMachine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private final double priceA=9.99;
	private final double priceB=19.99;
	private final double priceC=29.99;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocketMachine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String options = request.getParameter("options");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		double price =0.0;
		switch (options) {
		case "Type-A":
			price = priceA * quantity;
			break;
		case "Type-B":
			price = priceB * quantity;
			break;
		case "Type-C":
			price = priceC * quantity;
			break;
}
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"max-width: 500px;height:200px;text-align:center; margin: 0 auto; padding: 25px; border: 2px solid black; border-radius: 5px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\">");
        out.println("<p style=\"margin:5px;font-size:20px;color:black;font-weight:bold;\">Your Receipt is generated here !</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Socket Type: " + options + "</p>");
        out.println("<p>Quantity: " + quantity + "</p>");
        out.println("<p>You have to pay: $" + price + "</p>");
        out.println("</body></html>");
	}

}
