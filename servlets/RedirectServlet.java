import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class RedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String query = request.getParameter("query");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Redirecting...</title>");
        out.println("<meta http-equiv='refresh' content='2;url=https://www.google.com/search?q=" + query + "'>");
        out.println("<style>");
        out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
        out.println("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background: linear-gradient(to bottom right, #1a1a2e, #16213e, #0f3460); min-height: 100vh; display: flex; justify-content: center; align-items: center; position: relative; overflow: hidden; }");
        out.println("body::before { content: ''; position: absolute; width: 500px; height: 500px; background: radial-gradient(circle, rgba(102, 126, 234, 0.1), transparent); border-radius: 50%; top: -250px; right: -250px; animation: float 3s ease-in-out infinite; }");
        out.println("body::after { content: ''; position: absolute; width: 400px; height: 400px; background: radial-gradient(circle, rgba(118, 75, 162, 0.1), transparent); border-radius: 50%; bottom: -200px; left: -200px; animation: float 4s ease-in-out infinite reverse; }");
        out.println("@keyframes float { 0%, 100% { transform: translate(0, 0); } 50% { transform: translate(20px, 20px); } }");
        out.println(".redirect-box { background: rgba(255, 255, 255, 0.95); backdrop-filter: blur(10px); padding: 50px 45px; border-radius: 20px; box-shadow: 0 20px 60px rgba(0,0,0,0.3); text-align: center; max-width: 500px; position: relative; z-index: 1; }");
        out.println(".redirect-box::before { content: ''; position: absolute; top: 0; left: 0; right: 0; height: 5px; background: linear-gradient(90deg, #667eea, #764ba2, #f093fb); border-radius: 20px 20px 0 0; }");
        out.println(".icon-wrapper { width: 80px; height: 80px; margin: 0 auto 25px; background: linear-gradient(135deg, #667eea, #764ba2); border-radius: 50%; display: flex; align-items: center; justify-content: center; box-shadow: 0 10px 25px rgba(102, 126, 234, 0.3); animation: pulse 2s ease-in-out infinite; }");
        out.println("@keyframes pulse { 0%, 100% { transform: scale(1); } 50% { transform: scale(1.05); } }");
        out.println(".icon-wrapper svg { width: 40px; height: 40px; fill: white; }");
        out.println("h2 { color: #1a1a2e; margin-bottom: 15px; font-size: 26px; font-weight: 700; }");
        out.println(".query-text { color: #667eea; font-size: 18px; font-weight: 600; margin-bottom: 20px; background: rgba(102, 126, 234, 0.1); padding: 12px 20px; border-radius: 10px; display: inline-block; }");
        out.println("p { color: #666; margin-bottom: 25px; font-size: 14px; }");
        out.println(".loader { width: 50px; height: 50px; margin: 20px auto; border: 4px solid #f3f3f3; border-top: 4px solid #667eea; border-radius: 50%; animation: spin 1s linear infinite; }");
        out.println("@keyframes spin { 0% { transform: rotate(0deg); } 100% { transform: rotate(360deg); } }");
        out.println(".countdown { color: #764ba2; font-size: 16px; font-weight: 600; margin-top: 15px; }");
        out.println("</style></head><body>");
        out.println("<div class='redirect-box'>");
        out.println("<div class='icon-wrapper'>");
        out.println("<svg viewBox='0 0 24 24' xmlns='http://www.w3.org/2000/svg'>");
        out.println("<path d='M12 2L2 7v10c0 5.55 3.84 10.74 9 12 5.16-1.26 9-6.45 9-12V7l-10-5zm0 18c-3.31 0-6-2.69-6-6s2.69-6 6-6 6 2.69 6 6-2.69 6-6 6z'/>");
        out.println("<circle cx='12' cy='14' r='2'/>");
        out.println("</svg>");
        out.println("</div>");
        out.println("<h2>Redirecting to Google</h2>");
        out.println("<div class='query-text'>\"" + query + "\"</div>");
        out.println("<p>Taking you to Google search results...</p>");
        out.println("<div class='loader'></div>");
        out.println("<p class='countdown'>Redirecting in 2 seconds</p>");
        out.println("</div>");
        out.println("<script>");
        out.println("let count = 2;");
        out.println("const countdownEl = document.querySelector('.countdown');");
        out.println("const timer = setInterval(() => {");
        out.println("  count--;");
        out.println("  if (count > 0) {");
        out.println("    countdownEl.textContent = 'Redirecting in ' + count + ' second' + (count !== 1 ? 's' : '');");
        out.println("  } else {");
        out.println("    countdownEl.textContent = 'Redirecting now...';");
        out.println("    clearInterval(timer);");
        out.println("  }");
        out.println("}, 1000);");
        out.println("</script>");
        out.println("</body></html>");
    }
}