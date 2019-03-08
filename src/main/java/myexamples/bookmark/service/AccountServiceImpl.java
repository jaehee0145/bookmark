package myexamples.bookmark.service;

import myexamples.bookmark.dao.AccountDao;
import myexamples.bookmark.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao dao;

    @Override
    public List<AccountDto> selectMember() throws Exception {
        return dao.selectMember();
    }
}
