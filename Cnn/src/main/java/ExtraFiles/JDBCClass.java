package ExtraFiles;

import java.sql.*;

/**
 * Created by Gufran on 4/26/14.
 */
public class JDBCClass  {
    public static void main(String[] args) {

    Connection con = null;//null is used to initialize;
    Statement stmn = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/gufran?" + "user=root&password=Mysql786");
        stmn = con.createStatement();

        //String newClasses = "Insert into classes values(5863, 'Asif','Adeel','Jamaica Ave','Jamaica')";
        String Update = "Update classes SET City = 'Flushing' WHERE LastName='Asif'";

        stmn.execute(Update);

        String sql = "Select * From classes";
        rs =stmn.executeQuery(sql);
        while(rs.next()){
            System.out.print(rs.getString(1) + "\t");
            System.out.print(rs.getString(2) + "\t");
            System.out.print(rs.getString(3) + "\t");
            System.out.print(rs.getString(4) + "\t");
            System.out.println(rs.getString(5) + "\t");

        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e){
        e.printStackTrace();

    }finally {
        try{
            rs.close();
            stmn.close();
            con.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
}

