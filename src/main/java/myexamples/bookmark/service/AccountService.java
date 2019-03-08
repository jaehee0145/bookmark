package myexamples.bookmark.service;

import myexamples.bookmark.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    public List<AccountDto> selectMember() throws Exception;
}
