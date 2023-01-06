package G_깃허브;

public class TestEntity {
	private String playerName;
	private String backNumber;
	private String height;
	
	public TestEntity(String playerName, String backNumber, String height) {
		super();
		this.playerName = playerName;
		this.backNumber = backNumber;
		this.height = height;
		
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(String backNumber) {
		this.backNumber = backNumber;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	
	
}
