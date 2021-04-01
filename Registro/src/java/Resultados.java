import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Resultados"})
public class Resultados extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        int p1 = Integer.parseInt(request.getParameter("radio1"));
        int p2 = Integer.parseInt(request.getParameter("radio2"));
        int p3 = Integer.parseInt(request.getParameter("radio3"));
        int p4 = Integer.parseInt(request.getParameter("radio4"));
        int p5 = Integer.parseInt(request.getParameter("radio5"));
        String nombre = request.getParameter("nombre");
        int calif = p1 + p2 + p3 + p4 + p5;
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "	<title>Prueba</title>\n" +
                        "	<meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"UTF-8\">\n" +
                        "       <meta name=\"description\" content=\"Prueba\"/>\n" +
                        "       <meta name=\"keywords\" content=\"Prueba, test\">\n" +
                        "       <meta name=\"author\" content=\"Hernández Salinas Diego Alberto\"/>\n" +
                        "       <meta name=\"copyright\" content=\"PECHUGAS LARÚ\"/>\n" +
                        "	<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/apple-touch-icon.png\">\n" +
                        "       <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"/favicon-32x32.png\">\n" +
                        "       <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/favicon-16x16.png\">\n" +
                        "       <link rel=\"stylesheet\" href=\"/Ciencias/CSS/estilos.css\">\n" +
                        "       <link rel=\"stylesheet\" href=\"/ciencias/CSS/formulario.css\">\n" +
                        "</head>");
            
            out.println("<body>");

            out.println("<header class=\"main-header\">\n" +
                        "        <div class=\"container container--flex\">\n" +
                        "        <div class=\"logo-container column column--50\">\n" +
                        "           <h1 class=\"logo\">Calificación</h1>\n" +
                        "        </div>\n" +
                        "            </div>\n" +
                        "        </header>");
            
            out.println("<nav class=\"main-nav\">\n" +
                        "       <div class=\"container container--flex\">\n" +
                        "           <span class=\"icon-menu\" id=\"btnmenu\"></span>\n" +
                        "            <ul class=\"menu\" id=\"menu\">\n" +
                        "               <li class=\"menu__item\"><a href=\"CienciasINDEX.html\" class=\"menu__link menu__link--select\">Inicio</a></li>\n" +
                        "               <li class=\"menu__item\"><a href=\"Cienciasintro.html\" class=\"menu__link\">Introduccion</a></li>\n" +
                        "               <li class=\"menu__item\"><a href=\"CienciasRamas.html\" class=\"menu__link\">Ramas</a></li>\n" +
                        "               <li class=\"menu__item\"><a href=\"CienciasBio.html\" class=\"menu__link\">Biología</a></li>\n" +
                        "               <li class=\"menu__item\"><a href=\"CienciasZoo.html\" class=\"menu__link\">Zoología</a></li>\n" +
                        "               <li class=\"menu__item\"><a href=\"CienciasFio.html\" class=\"menu__link\">Fisiología</a></li>\n" +
                        "           </ul>\n" +
                        "       </div>\n" +
                        "       </nav>");
            
            out.println("<section class=\"banner\">\n" +
                        "       <img src=\"/Ciencias/Imagenes/Banner.jpg\" alt=\"\" class=\"banner__img\">\n" +
                        "       <div class=\"banner__content\">"+ nombre +"</div>\n" +
                        "       </section>");
            
            out.println("<main class=\"main\">\n" +
                        "       <section class=\"group group--color\">\n" +
                        "           <div class=\"container\">\n" +
                        "               <h2 class=\"main__tittle\">Calificación Obtenida</h2>\n" +
                        "               <p class=\"main__txt\">"+ calif +"</p>\n" +
                        "           </div>\n" +
                        "       </section>");
            
            out.println("<footer class=\"main-foot\">\n" +
                        "           <div class=\"container container--flex\">\n" +
                        "           <div class=\"column column--50\">\n" +
                        "              <h2 class=\"column__tittle\">Conectate con la Naturaleza</h2>\n" +
                        "              <p class=\"column__txt\">Se parte de ella y conviertete en parte importante.</p>\n" +
                        "           </div>\n" +
                        "           <div class=\"column column--50\">\n" +
                        "              <h2 class=\"column__tittle\">Contacta a tu escuela</h2>\n" +
                        "              <p class=\"column__txt\">ESCOM-IPN, Juan de Dios B&aacute;tiz, Av. Miguel Oth&oacute;n de Mendiz&aacute;bal Ote. &, Nueva Industrial Vallejo, Gustavo A. Madero, 07738 Ciudad de M&eacute;xico, CDMX</p>\n" +
                        "            </div>\n" +
                        "            <p class=\"copy\">© 2020 | Todos los derechos reservados</p>\n" +
                        "         </div>   \n" +
                        "       </footer>");
            out.println("");
            out.println("");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
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
