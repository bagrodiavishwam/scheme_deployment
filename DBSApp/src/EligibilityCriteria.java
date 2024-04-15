import java.sql.*;

import javax.swing.JOptionPane;
public class EligibilityCriteria {
	
	public static  void SchemeEligible(Connection con, PreparedStatement pst, String scheme_id) 
	{
		con = MySQLConnection.connectDB();
		String sql = "insert into is_eligible(aadhar_id, scheme_id) select aadhar_id, ? from citizen where bank_account = 1";
		try
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, scheme_id);
			pst.execute();
			pst.close();	
		}
		 catch (Exception e1) 
		{
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
		}
	}

}
