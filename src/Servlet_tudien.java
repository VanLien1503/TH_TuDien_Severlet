import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet_tudien",urlPatterns = "/Anh_Viet")
public class Servlet_tudien extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello"," xin chào");
        dictionary.put("how"," thế nào");
        dictionary.put("book","quyển vở");
        dictionary.put("computer","máy tính");

        String search = request.getParameter("textSearch");
        String message="";
        if (dictionary.containsKey(search)){
            message=dictionary.get(search);
        }else {
            message="không tìm thấy";
        }
        request.setAttribute("search",search);
        request.setAttribute("a",message);
        getServletContext().getRequestDispatcher("/demo.jsp").forward(request,response);

//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<head>\n" +
//                "<meta charset='UTF-8'>\n"+
//                "    <title>Tu_Dien abc</title>\n" +
//                "    \n" +
//                "  </head>");
//        writer.println("<body>");
//        String result = dictionary.get(seach);
//        if (request!= null){
//            writer.println("Word :" +seach );
//            writer.println("Result :" +result );
//        }else {
//            writer.println("not found");
//        }
//        writer.println("</body>");
//        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
