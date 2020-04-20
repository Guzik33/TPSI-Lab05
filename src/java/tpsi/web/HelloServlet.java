package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.ArrayList;




@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        //Licznik odwiedzin
        int counter;
        HttpSession session = request.getSession();
        if(session.getAttribute("counter") != null)
        {
            counter = (int) session.getAttribute("counter");
        }
        else
        {
            counter = 0;
        }
        counter++;
        session.setAttribute("counter", counter);
        request.setAttribute("licznik", session.getAttribute("counter"));
        request.getRequestDispatcher("counter.jsp").forward(request, response);
    }
    
    
    
        //-----------------------------------------------
        
        
//        if(session.getAttribute("listOfStudentsSession") != null)
//        {
//            List<Student> listOfStudentsLocal = new ArrayList<>(); //Inicjalizuje lokalna liste studentow
//            if (request.getParameter("firstName") != null)
//            {
//
//            
//            if (listOfStudentsLocal != (List<Student>) session.getAttribute("listOfStudentsSession"))
//                {
//                Student s1 = new Student(); //Tworze obiekt klasy student
//                listOfStudentsLocal =  (List<Student>) session.getAttribute("listOfStudentsSession"); //Do lokalnej listy studentow przypisuje liste studentow z sesji
//                s1.firstName = request.getParameter("firstName"); //Uzupelniam wartosci obiektu s1 wartosciami z formularza
//                s1.lastName = request.getParameter("lastName");
//                s1.email = request.getParameter("email");
//                listOfStudentsLocal.add(s1); //Dodaje obiekt s1 do lokalnej listy studentow
//                session.setAttribute("listOfStudentsSession", listOfStudentsLocal); //Aktualizuje liste studentow w sesji
//                //request.setAttribute("studenci", session.getAttribute("listOfStudentsSession"));
//                request.setAttribute("studenci", listOfStudentsLocal); //Liste studentow wrzucam do parametru "studenci" do .jsp
//                }
//            }
//            
//        }
//        else
//        {
//        session.setAttribute("listOfStudentsSession", new ArrayList<Student>());
//        }
//        
//        request.setAttribute("licznik", session.getAttribute("counter"));
//        request.getRequestDispatcher("hello.jsp").forward(request, response);
//    }
}