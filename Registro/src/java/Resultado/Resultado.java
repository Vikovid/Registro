package Resultado;

import static Utilidades.Delegacion.obtenerDelegacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Resultado", urlPatterns = {"/Resultado"})
public class Resultado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String nombre = request.getParameter("nombre");
        String paterno = request.getParameter("paterno"); 
        String materno = request.getParameter("materno");
        String telefono = request.getParameter("telefono");
        String mail = request.getParameter("mail");
        String delegacion = obtenerDelegacion(Integer.parseInt(request.getParameter("delegacion")));
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            //HEAD
            out.println("<head>");
                out.println(
                        "<title>Registro</title>\n" +
                        "    \n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta name=\"author\" content=\"Olivares Reyes Víctor\"/>\n" +
                        "    <meta name=\"description\" content=\"Página de inicio\"/>\n" +
                        "    <meta name=\"keywords\" content=\"árboles, deforestación, CDMX\">\n" +
                        "	\n" +
                        "    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/apple-touch-icon.png\">\n" +
                        "    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"/favicon-32x32.png\">\n" +
                        "    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/favicon-16x16.png\">\n" +
                        "    <link rel=\"stylesheet\" href=\"CSS/estilos.css\">");
            out.println("</head>");

            out.println("<body>");

            out.println(
                    "<header class=\"main-header\">\n" +
                    "   <div class=\"container container--flex\">\n" +
                    "   </div>\n" +
                    "</header>");
            
            out.println(
                    "<section class=\"banner\">\n" +
                    "   <img src=\"Imagenes/Banner.jpg\" alt=\"\" class=\"banner__img\">\n" +
                    "   <div class=\"banner__content\">Operación exitosa</div>\n" +
                    "</section>");
            
            out.println(
                    "<main class=\"main\">\n" +
                    "   <section class=\"group group--color\">\n" +
                    "       <div class=\"container\">\n" +
                    "           <h2 class=\"main__tittle\">Estimad@ "+nombre+" "+paterno+" "+materno+"</h2>\n" +
                    "           <p class=\"main__txt\">Estamos procesando tu solicitud, revisa tu correo \""+mail+"\" para verificar el estado de la solicitud</p>\n" +
                    "       </div>\n" +
                    "   </section>");
            
            out.println("<a href=\"Index.html\" class=\"btn btn--contact\">Aceptar</a>");
            
            out.println(
                    "<footer class=\"main-foot\">\n" +
                    "            <div class=\"container container--flex\">\n" +
                    "                <div class=\"column column--50\">\n" +
                    "                    <p class=\"column__txt\">Cuida la naturaleza.<br>\n" +
                    "                        Haz conciencia y conviertete en parte importante de ella.</p>\n" +
                    "                </div>\n" +
                    "            \n" +
                    "                <div class=\"column column--50\">\n" +
                    "                    <h2 class=\"column__tittle\">Contáctanos</h2>\n" +
                    "                    <p class=\"column__txt\">ESCOM-IPN, Juan de Dios Bátiz, Av. Miguel Othón de Mendizábal Ote. &, Nueva Industrial Vallejo, Gustavo A. Madero, 07738, CDMX</p>\n" +
                    "                </div>\n" +
                    "            \n" +
                    "                <p class=\"copy\">© 2021 | Todos los derechos reservados</p>\n" +
                    "            </div>   \n" +
                    "       </footer>");
            
            out.println("</main>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}