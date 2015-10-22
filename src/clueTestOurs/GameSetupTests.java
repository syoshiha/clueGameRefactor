package clueTestOurs;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import clueGame.Board;
import clueGame.ComputerPlayer;

public class GameSetupTests {
	
	Board board;
	
	@Before
	public void setup() {
		board = new Board();
		
		// Initialize calls functions to load the board, the rooms,
		// the people and the weapons.
		board.initialize();
	}
	
	@Test
	public void testPeopleLoading() {
		
		// The first person in the file (John Smith) should be
		// the human player. The remaining 5 people will be
		// computer players.
		
		assertEquals(board.getHumanPlayer().getName(), "John Smith");
		assertEquals(board.getHumanPlayer().getColor(), Color.red);
		assertEquals(board.getHumanPlayer().getRow(), 3);
		assertEquals(board.getHumanPlayer().getCol(), 9);
		
		Set<ComputerPlayer> compPlayers = board.getCompPlayers();
		assertEquals(compPlayers.size(), 5);
		
		for (ComputerPlayer player : compPlayers) {
			switch (player.getName()) {
			case "Joe Brown":
				assertEquals(player.getColor(), Color.blue);
				assertEquals(player.getRow(), 8);
				assertEquals(player.getCol(), 17);
				break;
			case "Bill Adams":
				assertEquals(player.getColor(), Color.cyan);
				assertEquals(player.getRow(), 19);
				assertEquals(player.getCol(), 19);
				break;
			case "Jake Williams":
				assertEquals(player.getColor(), Color.green);
				assertEquals(player.getRow(), 14);
				assertEquals(player.getCol(), 7);
				break;
			case "Connor Davis":
				assertEquals(player.getColor(), Color.yellow);
				assertEquals(player.getRow(), 10);
				assertEquals(player.getCol(), 7);
				break;
			case "Grrant Jones":
				assertEquals(player.getColor(), Color.orange);
				assertEquals(player.getRow(), 12);
				assertEquals(player.getCol(), 2);
				break;
			default:
				// The name should be one of the names listed above. If it
				// is not, the test fails.
				assertEquals(1, 0);	
			}
		}
	}

}