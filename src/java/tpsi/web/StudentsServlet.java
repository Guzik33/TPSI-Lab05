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




@WebServlet(name = "StudentsServlet", urlPatterns = {"/students"})
public class StudentsServlet extends HttpServlet {
    
    //List<Student> listOfStudentsLocal = new ArrayList<>(); //Inicjalizuje lokalna liste studentow
    List <Student> listOfStudentsLocal;
    
    
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         
         HttpSession session = request.getSession();
         
         if (session.getAttribute("listOfStudentsSession") !=null) listOfStudentsLocal = (List<Student>) session.getAttribute("listOfStudentsSession");
         else listOfStudentsLocal = new ArrayList<>();

         
         listOfStudentsLocal.add(new Student(request.getParameter("firstName"), request.getParameter("lastName"),request.getParameter("email")));
         session.setAttribute("listOfStudentsSession",listOfStudentsLocal);
         request.setAttribute("studenci", session.getAttribute("listOfStudentsSession")); //Liste studentow wrzucam do parametru "studenci" do .jsp
         request.getRequestDispatcher("hello.jsp").forward(request, response);
     }
     
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException{
         HttpSession session = request.getSession();
         if (session.getAttribute("listOfStudentsSession") !=null) listOfStudentsLocal = (List<Student>) session.getAttribute("listOfStudentsSession");
         else listOfStudentsLocal = new ArrayList<>();
         request.setAttribute("studenci", session.getAttribute("listOfStudentsSession")); //Liste studentow wrzucam do parametru "studenci" do .jsp
         request.getRequestDispatcher("hello.jsp").forward(request, response);
                
     }
}