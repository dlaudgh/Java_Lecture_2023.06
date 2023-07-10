package ch13_collection.sec01_list;

import java.util.List;

public interface BoardDao {
	List<Board> getBoardList(int count);	// count 갯수 만큼의 리스트 반환
	
	Board getBoard(int bid);	// bid 검색 결과 반환
	
	Board getBoardBySubject(String subject);
	
	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(int bid);
}
