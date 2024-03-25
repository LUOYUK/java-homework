package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mysql {
    public static void main(String[] args) throws Exception {
        //1注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        
        //2获取连接
        String url ="jdbc:mysql://10.17.124.193:3306/itheima?useSSL=false&allowPublicKeyRetrieval=true";
        String usename ="root";
        String password ="Yu91029102";
        Connection conn = DriverManager.getConnection(url, usename, password);

        //3定义sql
        String sql = "update emp set age = 20 where id = 1;";

        //4获取执行sql的对象statement
        Statement stmt = conn.createStatement();

        //5执行sql
        int count = stmt.executeUpdate(sql);//受影响的行数

        //6处理结果
        System.out.println(count);

        //7释放资源
        stmt.close();
        conn.close();
    }
}
