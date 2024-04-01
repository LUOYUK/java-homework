package com.xunle.dao;
import com.xunle.domain.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountDao {

    //1查询所有记录
    List<Account> findAll();


    //2通过id删除记录
    int deleteByPrimarykey(String id);

    //3插入记录
    int insert(Account account) ;

    //4通过id查找对象
    Account selectByPrimaryKey(String id);


    //5更新Account
    int updateByPrimarykey(Account record);

    int transfer(String fromId,String toId,int money);

}
