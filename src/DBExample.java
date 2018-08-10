import java.sql.*;


/**
 * Created by expertzlab12 on 7/26/18.
 */
public class DBExample {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",
                "root","abc123");

      //try(Statement statement=connection.createStatement())
        //{
            //PreparedStatement preparedStatement=connection.
                  //  prepareStatement("insert into student values(?,?)");
           // preparedStatement.setInt(1,23);
          //  preparedStatement.setString(2,"anu");
        //  preparedStatement.setString(3,"aaa");
         //   preparedStatement.executeUpdate();

//int i= statement.executeUpdate("insert into student values(9,'aish')");

       // System.out.println(i);
        //Statement statement1=connection.createStatement();
        //ResultSet rs=statement1.executeQuery("select * from student");
        //while (rs.next()){
          //  System.out.println(rs.getInt("id")+" "+rs.getString("name"));
        //}
        CallableStatement cs=connection.prepareCall("{call get_department(?,?,?)}");
       cs.setInt(1,3);
        cs.setString(2,"eng");
        cs.registerOutParameter(3,Types.INTEGER);
       cs.execute();//data base olla value anakil 1 return chyyum
        //allenkil 0 return cheyyum
       //int x=cs.getInt(3);
       //or
        int y=cs.getInt("total");
       System.out.println(y);
        //ResultSet rs1=cs.getResultSet();
      //  while(rs1.next()) {
           // System.out.println(rs1.getInt("id") + " " + rs1.getString("name"));
        //}
        connection.close();


}}
