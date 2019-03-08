package myexamples.bookmark.dao;

import myexamples.bookmark.dto.AccountDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao{
    @Autowired
    private SqlSession sqlSession;
    private static final String nameSpace = "myexamples.bookmark.mappers.userMapper";

    @Override
    public List<AccountDto> selectMember() throws Exception {
        return sqlSession.selectList(nameSpace+".selectMember");
    }
}
