import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CurrencyConverterServlet")
public class CurrencyConverterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String amountStr = request.getParameter("amount");
        double amount = Double.parseDouble(amountStr);
        double conversionRate = 74.85; // Example conversion rate from USD to INR
        double convertedAmount = amount * conversionRate;

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println(convertedAmount);
        out.close();
    }
}
