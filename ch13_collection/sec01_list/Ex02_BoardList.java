package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex02_BoardList {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		// 객체 추가
		list.add(new Board(1, "James", "글 제목", "글 내용"));
		list.add(new Board(2, "Maria", "Title", "Content"));

		// 객체 순회 출력
		for (Board board: list)
			System.out.println(board);
		
		list = generateBoard(3);
		for (Board board: list)
			System.out.println(board);
		
		Board board = searchBoard(list, 102);
		System.out.println("검색결과: " + board);
	}

	private static List<Board> generateBoard(int count) {
		List<Board> list = new ArrayList<Board>();
		for (int i = 1; i <= count; i++) {
			Board board = new Board(100+i, "저자"+i, "제목"+i, "글내용"+i);
			list.add(board);
		}
		return list;
	}
	
	private static Board searchBoard(List<Board> list, int id) {
		for (Board board: list) {
			if (board.getBid() == id)
				return board;
		}
		return null;
	}
}
