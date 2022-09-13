public class MarsRover {
	private String currentDirection;
	public MarsRover() {
		this.currentDirection = "N";
	}

	public String getCurrentDirection() {
		return currentDirection;
	}

	public void turnRight() {
			if (currentDirection.equals("N")) {
				currentDirection = "E";
				return;
			}
			if (currentDirection.equals("E")) {
				currentDirection = "S";
				return;
			}
			if (currentDirection.equals("S")) {
				currentDirection = "W";
				return;
			}
			if (currentDirection.equals("W")) {
				currentDirection = "N";
			}
	}

	public void movement(String input) {
		char[] moveCommands = input.toCharArray();
		for (char moveCommand : moveCommands) {
			if (moveCommand == 'R') {
				turnRight();
			}
		}
	}
}