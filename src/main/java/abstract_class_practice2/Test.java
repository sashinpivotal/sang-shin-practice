package abstract_class_practice2;

import java.sql.*;

@FunctionalInterface
interface MyFunctionalInterface {
    public Integer sqr(int a);

    default String sqr(String a) {
        return a + a;
    }
}

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /* You can ignore this block and assuming the connection was successful*/
        Class.forName("org.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "");
        /*------------------------*/

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("show databases");

        //while (rs.next() == true) {
        System.out.println(rs.getString(0));
        //}
    }
}
