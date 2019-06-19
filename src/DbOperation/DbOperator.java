package DbOperation;

import Interface.ErrorInterface;

import javax.naming.Name;
import java.sql.*;

public class DbOperator {

    ErrorInterface errorInterface;
    private static String USERNAME = "scott";
    private static String PASSWORD = "tiger";
    private static String DRIVER = "oracle.jdbc.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";    //localhost本机IP，1521端口号，ORCL为Oracle默认数据库名

    Connection connection = null;                    //创建一个数据库连接
    PreparedStatement pst = null;       // 创建预编译语句对象，一般都是用这个而不用Statement
    ResultSet resultSet = null;                         // 创建一个结果集对象

    private Connection getConnection(){
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("成功连接数据库");
        }catch (ClassNotFoundException e){
            throw new RuntimeException("class not find !",e);
        }catch (SQLException e){
            throw new RuntimeException("get connection error !",e);
        }
        return  connection;
    }

    private ResultSet GetResultSet(String No, String Name,int flag){
        connection = getConnection();
        String sql;
        ResultSet res = null;
        if(flag == 0){
            sql = "select * from USERPASSWORD where 1 = 1";
        }
        else if(flag == 1) {
            sql = "select * from USERPASSWORD where SNO = ?";
        }
        else if(flag == 3){
            sql = "select * from USERPASSWORD where SNAME = ?";
        }
        else{
            sql = "select * from USERPASSWORD where SNO = ? AND SNAME = ?";
        }
        try{

            pst = connection.prepareStatement(sql);
            if(flag == 3) {
                    pst.setString(1, Name);
            }
            else if(flag == 1){
                    pst.setString(1,No);
            }
            else if(flag == 2){
                pst.setString(1,No);
                pst.setString(2,Name);
            }
            res = pst.executeQuery();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }

    public String Select(String No,String Name, int flag){
        resultSet = GetResultSet(No,Name,flag);
        String temp = "";
        try {
            while (resultSet.next()) {
                temp = temp + "\t  " + resultSet.getString("SNO");
                temp = temp + "\t" + resultSet.getString("SNAME");
                temp = temp + "\t\t" + resultSet.getString("PASSWORD");
                temp = temp + "\n";
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ReleaseResource();
        }
        return temp;
    }

    private boolean JudgeNo(String No,String Name,int flag){
        resultSet = GetResultSet(No,Name,flag);
        return true;
    }

    public boolean AddUserData(String sno,String sname, String password){

        connection = getConnection();
        String sql = "select count(*) from UserPassword where 1 = 1";
        String sqlStr = "insert into UserPassword values(?,?,?)";
       // int count = 0;
        try {
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
            while (resultSet.next()) {
               // count = resultSet.getInt(1) + 1;
                System.out.println(resultSet.getInt(1));
            }
            //执行插入数据操作
            pst = connection.prepareStatement(sqlStr);
            pst.setString(1,sno);
            pst.setString(2,password);
            pst.setString(3,sname);
            pst.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ReleaseResource();
        }
    }

    public void DeleteUserData(String sno,String sname,int flag) {
        connection = getConnection();
        String sqlStr;
        if(flag == 1) {
            sqlStr = "delete from USERPASSWORD where sno=?";         //学号不为空
        }
        else if(flag == 2){
            sqlStr = "delete from USERPASSWORD where sno=? and  sname=?";         //学号姓名都不为空
        }
        else{
            sqlStr = "delete from USERPASSWORD where sname=?";               //姓名不为空
        }
        try {
            // 执行删除数据操作
            pst = connection.prepareStatement(sqlStr);
            if(flag == 1) {
                pst.setString(1, sno);
            }
            else if(flag ==2){
                pst.setString(1, sno);
                pst.setString(2, sname);
            }
            else{
                pst.setString(1, sname);
            }
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ReleaseResource();
        }
    }

    private void ReleaseResource() {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
