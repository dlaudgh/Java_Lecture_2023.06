package ch13_collection.sec91_q7list;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		List<Board> list = bDao.getBoardList();
		for (Board b: list)
			System.out.println(b);
	}

}
