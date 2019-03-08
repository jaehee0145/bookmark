package myexamples.bookmark.dao;

import myexamples.bookmark.dto.AccountDto;

import java.util.List;

public interface AccountDao {
    public List<AccountDto> selectMember() throws Exception;
}
