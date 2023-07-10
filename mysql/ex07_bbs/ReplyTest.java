package mysql.ex07_bbs;

import java.util.List;

import mysql.ex07_bbs.dao.ReplyDao;
import mysql.ex07_bbs.entity.Reply;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao rDao = new ReplyDao();
		
		rDao.insertReply(new Reply("댓글 1", "maria", 3));
		rDao.insertReply(new Reply("댓글 2", "maria", 3));
		rDao.insertReply(new Reply("댓글 1", "james", 4));
		
		List<Reply> list = rDao.getReplyList();
		for (Reply r: list)
			System.out.println(r);
	}

}
