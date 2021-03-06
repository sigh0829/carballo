package com.alonsoruibal.chess;

import junit.framework.TestCase;

public class ParseMoveTest extends TestCase {

	public void testGetFromString1() {
		Board b = new Board();
		b.setFen("1r1qk2r/1bp1n1pp/p2b1p2/2B1p3/2Q1P3/2N2N2/PPP2PPP/R4RK1 w k - 1 26");
		assertEquals("Ra1-d1", Move.toStringExt(Move.getFromString(b, "Ra1-d1", true)));
	}

	public void testGetFromString2() {
		Board b = new Board();
		b.setFen("1r1qk2r/1bp1n1pp/p2b1p2/2B1p3/2Q1P3/2N2N2/PPP2PPP/R4RK1 w k - 1 26");
		assertEquals("Ra1-d1", Move.toStringExt(Move.getFromString(b, "Rad1", true)));
	}

	public void testGetFromString3() {
		Board b = new Board();
		b.setFen("1r1qk2r/1bp1n1pp/p2b1p2/2B1p3/2Q1P3/2N2N2/PPP2PPP/R4RK1 w k - 1 26");
		assertEquals("Ra1-d1", Move.toStringExt(Move.getFromString(b, "a1 d1", true)));
	}

	public void testGetFromString4() {
		Board b = new Board();
		b.setFen("rnbqkb1r/pp3ppp/2p5/3pP3/8/2Q1BN2/PPP2PPP/R3KB1R b QKqk - 1 0");
		assertEquals("Nb8-d7", Move.toStringExt(Move.getFromString(b, "b8d7", true)));
	}

	public void testGetFromStringDisambiguateOneMoveNotLegal() {
		// Another knight can move to the same square but leaving the king in check
		Board b = new Board();
		b.setFen("r1bqk1nr/pp3ppp/2n5/1Bbp4/8/5N2/PPPN1PPP/R1BQ1RK1 b kq - 1 8");
		assertEquals("Ng8-e7", Move.toStringExt(Move.getFromString(b, "Ne7", true)));
	}

}