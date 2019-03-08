package myexamples.bookmark.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AccountDto {
    private long id;
    private String name;
    private String passwd;
    private String email;
    private Date regDate;
}
