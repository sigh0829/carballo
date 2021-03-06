package com.alonsoruibal.chess;

import com.alonsoruibal.chess.book.FileBook;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook() {
		int count = 0;
		Board board = new Board();
		board.startPosition();
		FileBook book = new FileBook("/book_small.bin");
		int move = book.getMove(board);
		while (move != -1) {
			System.out.println(move);
			board.doMove(move);
			System.out.println(board);
			move = book.getMove(board);

			count++;
		}
		assertTrue(count > 3);
	}
}