import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        response.setContentType("text/html");
        
        if (password.length() < 8) {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Weak Password</title>");
            out.println("<style>");
            out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
            out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background: linear-gradient(to bottom right, #1a1a2e, #16213e, #0f3460); min-height: 100vh; display: flex; justify-content: center; align-items: center; position: relative; overflow: hidden; }");
            out.println("body::before { content: ''; position: absolute; width: 500px; height: 500px; background: radial-gradient(circle, rgba(102, 126, 234, 0.1), transparent); border-radius: 50%; top: -250px; right: -250px; }");
            out.println("body::after { content: ''; position: absolute; width: 400px; height: 400px; background: radial-gradient(circle, rgba(118, 75, 162, 0.1), transparent); border-radius: 50%; bottom: -200px; left: -200px; }");
            out.println(".message-box { background: rgba(255, 255, 255, 0.95); backdrop-filter: blur(10px); padding: 50px 45px; border-radius: 20px; box-shadow: 0 20px 60px rgba(0,0,0,0.3); text-align: center; max-width: 500px; position: relative; z-index: 1; }");
            out.println(".message-box::before { content: ''; position: absolute; top: 0; left: 0; right: 0; height: 5px; background: linear-gradient(90deg, #e74c3c, #c0392b); border-radius: 20px 20px 0 0; }");
            out.println(".icon-wrapper { width: 70px; height: 70px; margin: 0 auto 20px; background: linear-gradient(135deg, #e74c3c, #c0392b); border-radius: 50%; display: flex; align-items: center; justify-content: center; box-shadow: 0 10px 25px rgba(231, 76, 60, 0.3); }");
            out.println(".icon-wrapper svg { width: 35px; height: 35px; stroke: white; fill: none; stroke-width: 2; }");
            out.println("h2 { color: #1a1a2e; margin-bottom: 15px; font-size: 24px; font-weight: 700; line-height: 1.4; }");
            out.println(".error-text { color: #e74c3c; font-weight: 600; }");
            out.println("p { color: #666; margin-bottom: 25px; font-size: 14px; }");
            out.println("button { padding: 15px 35px; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); color: white; border: none; border-radius: 10px; font-size: 15px; font-weight: 700; cursor: pointer; margin-top: 10px; letter-spacing: 0.5px; text-transform: uppercase; transition: all 0.3s ease; }");
            out.println("button:hover { transform: translateY(-3px); box-shadow: 0 10px 25px rgba(102, 126, 234, 0.4); }");
            out.println("button:active { transform: translateY(-1px); }");
            out.println("a { text-decoration: none; }");
            out.println("</style></head><body>");
            out.println("<div class='message-box'>");
            out.println("<div class='icon-wrapper'>");
            out.println("<svg viewBox='0 0 24 24' xmlns='http://www.w3.org/2000/svg'>");
            out.println("<circle cx='12' cy='12' r='10'></circle>");
            out.println("<line x1='15' y1='9' x2='9' y2='15'></line>");
            out.println("<line x1='9' y1='9' x2='15' y2='15'></line>");
            out.println("</svg>");
            out.println("</div>");
            out.println("<h2>Hello <span class='error-text'>" + username + "</span>, your password is weak.</h2>");
            out.println("<p>Passwords must be at least 8 characters long. Please try again with a stronger password.</p>");
            out.println("<a href='login.html'><button>Try Again</button></a>");
            out.println("</div></body></html>");
        } else {
            response.sendRedirect("search.html?username=" + username);
        }
    }
}