import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {

	private MarsRover marsRover;

	@BeforeEach
	void setup() {
		marsRover = new MarsRover();
	}

	@Test

	public void
	turn_right_given_one_R() {
		marsRover.movement("R");
		assertEquals("E", marsRover.getCurrentDirection());
	}

	@Test
	public void
	turn_right_given_two_R() {
		marsRover.movement("RR");
		assertEquals("S", marsRover.getCurrentDirection());
	}

	@Test
	public void
	turn_right_given_three_R() {
		marsRover.movement("RRR");
		assertEquals("W", marsRover.getCurrentDirection());
	}

	@Test
	public void
	turn_right_given_four_R() {
		marsRover.movement("RRRR");
		assertEquals("N", marsRover.getCurrentDirection());
	}
}
