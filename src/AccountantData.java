import java.sql.Driver;

public class AccountantData{
	public static void main(main[] String)
	{
			
			
			public static int save(AccountantBean bean){
				int status=0;
				try{
					//load driver
					class.forName("oracle.jdbc.driver.OracleDriver");
					//make connection betwn db and java
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","bit07cts11");
					PreparedStatement pstmt = con.prepareStatement("insert into FEE_ACCOUNTANT values(?,?,?,?,?)");						
					pstmt.setString(1,bean.getName());
					pstmt.setString(2,bean.getEmail());
					pstmt.setString(3,bean.getPassword());
					//pstmt.setString(5,bean.getCourse());
					//pstmt.setInt(6,bean.getFee());
					//pstmt.setInt(7,bean.getPaid());
					//pstmt.setInt(8,bean.getDue());
					pstmt.setString(4,bean.getAddress());
					pstmt.setString(5, bean.getContact());
					status s=pstmt.execute();
					con.close();
				}catch(Exception ex){System.out.println(ex);}
				return status;
			}
			
			public static boolean validate(String email,String password){
				boolean status=false;
				try{
					//load driver
					class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","bit07cts11");
					PreparedStatement ps=con.prepareStatement("select * from fee_accountant where email=? and password=?");
					ps.setString(1,email);
					ps.setString(2,password);
					ResultSet rs=ps.executeQuery();
					status=rs.next();
					con.close();
				}catch(Exception ex){System.out.println(ex);}
			return status;
			}
			
			public static int update(AccountantBean bean){
			int status=0;
			try{
				//load driver
				class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","bit07cts11");
				PreparedStatement pstmt=con.prepareStatement("update fee_accountant set name=?,email=?,password=?,address=?,contact=? where id=?");
				pstmt.setString(1,bean.getName());
				pstmt.setString(2,bean.getEmail());
				pstmt.setString(3,bean.getPassword());
				pstmt.setString(4,bean.getAddress());
				pstmt.setString(5,bean.getContact());
				pstmt.setInt(6,bean.getId());
				status = pstmt.executeUpdate();
				con.close();
			}catch(Exception ex){System.out.println(ex);}
			return status;
			}
			
			
			public static int delete(int id){
			int status=0;
			try{
				//load driver
				class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","bit07cts11");
				PreparedStatement ps=con.prepareStatement("delete from fee_accountant where id=?");
				ps.setInt(1,id);
				status=ps.executeUpdate();
				con.close();
			}catch(Exception ex){System.out.println(ex);}
			return status;
			}
			
			public static List<AccountantBean> getAllRecords(){
				List<AccountantBean> list=new ArrayList<AccountantBean>();
				try{
				//load driver
				class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","bit07cts11");
					PreparedStatement ps=con.prepareStatement("select * from fee_accountant");
					ResultSet rs=ps.executeQuery();
					while(rs.next()){
						AccountantBean bean=new AccountantBean();
						bean.setId(rs.getInt(1));
						bean.setName(rs.getString(2));
						bean.setEmail(rs.getString(3));
						bean.setPassword(rs.getString(4));
						bean.setAddress(rs.getString(5));
						bean.setContact(rs.getString(6));
						list.add(bean);
					}
					con.close();
				}catch(Exception ex){System.out.println(ex);}
	
				return list;
			}

			public static AccountantBean getRecordById(int id){
				AccountantBean bean=new AccountantBean();
				try{
					//load driver
					class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","bit07cts11");
					PreparedStatement ps=con.prepareStatement("select * from fee_accountant where id=?");
					ps.setInt(1,id);
					ResultSet rs=ps.executeQuery();
					while(rs.next()){
						bean.setId(rs.getInt(1));
						bean.setName(rs.getString(2));
						bean.setEmail(rs.getString(3));
						bean.setPassword(rs.getString(4));
						bean.setAddress(rs.getString(5));
						bean.setContact(rs.getString(6));
					}
					con.close();
			}catch(Exception ex){System.out.println(ex);}
			return bean;
			}
	}
}
