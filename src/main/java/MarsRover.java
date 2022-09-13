public class MarsRover {
	private String currentDirection;
	public MarsRover() {
		this.currentDirection = "N";
	}

	public String getCurrentDirection() {
		return currentDirection;
	}

	public String turnRight() {
			if (currentDirection.equals("N")) {
				currentDirection = "E";
				return currentDirection;
			}
			if (currentDirection.equals("E")) {
				currentDirection = "S";
				return currentDirection;
			}
			if (currentDirection.equals("S")) {
				currentDirection = "W";
				return currentDirection;
			}
			if (currentDirection.equals("W")) {
				currentDirection = "N";
				return currentDirection;
			}
		return currentDirection;
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