package acorn.omakase.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter @Getter
public class modCommentDTO {

    private int comment_no;
    private String comment_content;
    private int comment_like_cnt;
    private Date comment_date;
    private String user_nickname;
    private int post_no;
}
