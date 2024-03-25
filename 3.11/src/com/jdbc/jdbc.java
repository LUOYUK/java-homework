package com.jdbc;
import java.sql.*;

public class jdbc {

    public static void main(String[] args) throws Exception {

        String url ="jdbc:mysql://10.17.124.193:3306/csa--mysql?useSSL=false&allowPublicKeyRetrieval=true";
        String usename ="root";
        String password ="Yu91029102";

        Connection conn;
        Statement stmt;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, usename, password);
            stmt = conn.createStatement();

            // 1. 插入数据
            String insertSql = "insert into stu (sno, name, age, college) values" +
                    "('s001', '老大', 20, '计算机学院'), " +
                    "('s002', '老二', 19, '计算机学院'), " +
                    "('s003', '老三', 18, '计算机学院'), " +
                    "('s004', '老四', 17, '计算机学院')";
            stmt.executeUpdate(insertSql);
            System.out.println("数据插入成功！");

            // 2. 查看表中所有信息并输出到控制台
            String selectSql = "select * from stu";
            ResultSet resultSet = stmt.executeQuery(selectSql);
            System.out.println("学生表中的所有信息：");
            while (resultSet.next()) {
                String sno = resultSet.getString("sno");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String college = resultSet.getString("college");
                System.out.println("SNO: " + sno + ", Name: " + name + ", Age: " + age + ", College: " + college);
            }
            resultSet.close();

            // 3. 删除sno为s004的记录
            String deleteSql = "delete from stu where sno='s004'";
            stmt.executeUpdate(deleteSql);
            System.out.println("sno为s004的记录删除成功！");

            // 4. 查询sno为s003的记录
            String selectOneSql = "select * from stu where sno='s003'";
            ResultSet result = stmt.executeQuery(selectOneSql);
            if (result.next()) {
                String sno = result.getString("sno");
                String name = result.getString("name");
                int age = result.getInt("age");
                String college = result.getString("college");
                System.out.println("查询到的记录：SNO: " + sno + ", Name: " + name + ", Age: " + age + ", College: " + college);
            } else {
                System.out.println("未找到sno为s003的记录！");
            }
            result.close();

            // 5. 修改sno为s001的记录
            String updateSql = "update stu set college='通信学院' where sno='s001'";
            stmt.executeUpdate(updateSql);
            System.out.println("sno为s001的记录修改成功！");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}