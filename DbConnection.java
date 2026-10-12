package Learn_DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) throws SQLException {
		
		
		String url = "jdbc:mysql://localhost:3306/poorna_tech";
		String user = "root";
		String password = "root";
		
		Connection db = DriverManager.getConnection(url,user,password);
//		PreparedStatement ps = db.prepareStatement("create database poorna_tech");
//		PreparedStatement ps = db.prepareStatement("create table info(name varchar(50),age int, dept varchar(50),salary int)");
//		PreparedStatement ps = db.prepareStatement("insert into info values('Praveen', 20, 'IT', 40000)");
//		PreparedStatement ps = db.prepareStatement("insert into info values('Pradeep', 23, 'CSE', 60000)");
//		PreparedStatement ps = db.prepareStatement("update info set dept='Mech' where age=20");
//		PreparedStatement ps = db.prepareStatement("delete from info where name='Kumar'");
//		PreparedStatement ps = db.prepareStatement("Alter Table info add column phone_number int");
		PreparedStatement ps = db.prepareStatement("Alter Table info drop column salary ");
		
		
		
		
		ps.execute();
		db.close();
		
		System.out.println("Data drop");
		

	}

}
