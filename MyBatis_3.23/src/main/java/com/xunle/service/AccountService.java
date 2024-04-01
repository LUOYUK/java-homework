package com.xunle.service;

import com.xunle.dao.AccountDao;
import com.xunle.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountService {

    private InputStream inputStream;
    private SqlSession sqlSession;
    private AccountDao accountDao;

    //初始化
    public AccountService() throws IOException {
        inputStream = Resources.getResourceAsStream("SqlMapconfig.xml");
        SqlSessionFactory factory = new
                SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = factory.openSession();

        accountDao = sqlSession.getMapper(AccountDao.class);

    }

    //释放资源
    private void destroy() {
        try {
            sqlSession.commit();
            sqlSession.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //1查询所有记录
    List<Account> findAll() {
        List<Account> account = sqlSession.selectList("test.selectAll");
        System.out.println(account);
        return account;
    }

    //2通过id删除记录
    void deleteByPrimarykey(String id){
        accountDao.deleteByPrimarykey(id);

    }

    //3插入记录
    void insert(Account record){
        accountDao.insert(record);
    }

    //4通过id查找对象
    Account selectByPrimaryKey(String id){
        Account account = accountDao.selectByPrimaryKey(id);
        System.out.println( account);
        return account;
    }

    //5更新Account
    void updateByPrimarykey(Account record){
        accountDao.updateByPrimarykey(record);
    }

    //6转账功能 输出输入id 转入人id 转账金额 实现转账
    void transfer(String remitterId,String remitteeId,int money){
        AccountDao.transfer("001", "002", 500);
    }


}



