package comm.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends GenericServlet {
	ResultSet rs;
	Statement st;
	PreparedStatement pst;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public EmployeeServlet() {
        super();
        System.out.println("Constructor");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("trying to load driver");
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver is loaded");
			System.out.println("trying to get connection");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","sowmya");
			System.out.println("connected to database");
			response.setContentType("text/html");
			System.out.println("trying to make a preparedstatement for DML(update)");
			pst=conn.prepareStatement("select * from emp");
			ResultSet rs=pst.executeQuery();
			PrintWriter pw=response.getWriter();
			pw.println("<html><body><table border=1><tr><td>empno</th><td>ename</td><td>job</td><td>mgr</td><td>hiredate</td><td>salary</td><td>comm</td><td>deptno</td></tr>");
			while(rs.next()) {
				pw.println("<tr><td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getInt(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getInt(6)+"</td>"+"<td>"+rs.getInt(7)+"</td>"+"<td>"+rs.getInt(8)+"</td></tr>");
					}
					pw.println("</table><body></table>");
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
							
						
			
					
			
		
	


