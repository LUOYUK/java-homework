import com.xunle.dao.AccountDao;
import com.xunle.domain.Account;
import com.xunle.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class AccountServiceTest {
    private AccountService accountService;

    @Before
    public void init() throws IOException{
        accountService = new AccountService();
    }

    @Test
    public  void testFIndAll() throws IOException {
        //1.获取sqlsessionFactory
        String resource = "SqlMapconfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取dao接口的代理对象
        // List<Account>  accounts = sqlSession.selectList("test.selectAll");
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //4.执行方法
        List<Account> account = accountDao.findAll();
        System.out.println(account);

        //5释放资源
        sqlSession.close();



    }

    @Test
    public  void testDeleteByPrimaryKey() throws IOException {
        String id = "001";

        //1.获取sqlsessionFactory
        String resource = "SqlMapconfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取dao接口的代理对象
        // List<Account>  accounts = sqlSession.selectList("test.selectAll");
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //4.执行方法
        accountDao.deleteByPrimarykey(id);
        sqlSession.commit();


        //5释放资源
        sqlSession.close();



    }

    @Test
    public void testInsert() throws IOException{
        //接收参数
        String id ="003";
        String name = "唐三";
        int money =250;
        Date createtime = new Date(2019-12-12);
        Date updatetime = new Date(2034-02-5);
        
        //封装对象
        Account account =new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
        account.setCreatetime(createtime);
        account.setUpdatetime(updatetime);
        
        
        //1.获取sqlsessionFactory
        String resource = "SqlMapconfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取dao接口的代理对象
        // List<Account>  accounts = sqlSession.selectList("test.selectAll");
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //4.执行方法
        accountDao.insert(account);
        sqlSession.commit();
        //5释放资源
        sqlSession.close();

    }

    @Test
    public void testSelectByPrimaryKey() throws IOException{
        //接收参数
        String id = "002";

        //1.获取sqlsessionFactory
        String resource = "SqlMapconfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取dao接口的代理对象
        // List<Account>  accounts = sqlSession.selectList("test.selectAll");
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //4.执行方法
        Account account = accountDao.selectByPrimaryKey(id);
        System.out.println( account);


        //5释放资源
        sqlSession.close();

    }

    @Test
    public void updateByPrimary() throws IOException{
        //接收参数
        String id ="001";
        String name = "金庸 1989";
        int money =5000;
        Date createtime = new Date(2019-12-12);
        Date updatetime = new Date(2034-02-5);

        //封装对象
        Account account =new Account();
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
        account.setCreatetime(createtime);
        account.setUpdatetime(updatetime);


        //1.获取sqlsessionFactory
        String resource = "SqlMapconfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取dao接口的代理对象
        // List<Account>  accounts = sqlSession.selectList("test.selectAll");
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //4.执行方法
        accountDao.updateByPrimarykey(account);
        sqlSession.commit();

        //5释放资源
        sqlSession.close();

    }


    @Test
    public void transfer() throws IOException{
        //1.获取sqlsessionFactory
        String resource = "SqlMapconfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取dao接口的代理对象
        // List<Account>  accounts = sqlSession.selectList("test.selectAll");
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //4.执行方法
        AccountDao.transfer("001", "002", 500);
        sqlSession.commit();

        //5释放资源
        sqlSession.close();

    }









}