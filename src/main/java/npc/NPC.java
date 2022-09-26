package npc;

public class NPC {
	private String name;
	private String race;
	private int xPos;
	private int yPos;
	private String[] dialogue;
	private boolean hasSequentialDialogue;
	private int nextDialogue;

	NPC() {
		this.name = "UNNAMED";
		this.race = "NO RACE";
		this.xPos = 0;
		this.yPos = 0;
		this.dialogue = new String[1];
		this.hasSequentialDialogue = false;
		nextDialogue = 0;
	}
	
	NPC(String name, String race, int xPos, int yPos, String[] dialogue, boolean hasSeq) {
		this.name = name;
		this.race = race;
		this.xPos = xPos;
		this.yPos = yPos;
		this.dialogue = new String[dialogue.length];
		setDialogue(this.dialogue, dialogue);
		this.hasSequentialDialogue = hasSeq;
		nextDialogue = 0;
	}
	
	static void setDialogue(String[] dialogue, String[] setDialogue) {
		for(int i = 0; i < setDialogue.length; i++) {
			dialogue[i] = setDialogue[i];
		}
	}
	
	String printDialogue() {
		String result = "";
		for(int i = 1; i < dialogue.length; i++) {
			result += "\t\t" + dialogue[i] +"\n";
		}
		return result;
	}

	public String talk() {
		String result;
		if(!hasSequentialDialogue) { 
			int rand = (int) (Math.random() * dialogue.length);
			result = dialogue[rand];
		} else {
			nextDialogue = (nextDialogue == dialogue.length) ? 0 : nextDialogue;
			result = dialogue[nextDialogue];
			nextDialogue++;
		}
		return result;
	}
	
	public void walk(String direct) {
		if (direct.equals("up")) {
			this.setyPos(++yPos);
		} else if (direct.equals("down")) {
			if(yPos - 1 < 0 ) {
				System.out.println("Cannot enter negative region");
				return;
			}
			this.setyPos(--yPos);
		} else if (direct.equals("left")) {
			if(xPos - 1 < 0 ) {
				System.out.println("Cannot enter negative region");
				return;
			}
			this.setxPos(--xPos);
		} else if (direct.equals("right")) {
			this.setxPos(++xPos);
		}
	}
	
	//getters and setters	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		if (xPos < 0) {
			System.out.println("Cannot enter negative region");
			return;
		}
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		if (yPos < 0) {
			System.out.println("Cannot enter negative region");
			return;
		}
		this.yPos = yPos;
	}

	public String[] getDialogue() {
		return dialogue;
	}

	public void setDialogue(String[] dialogue) {
		this.dialogue = dialogue;
		nextDialogue = 0;
	}

	public boolean isHasSequentialDialogue() {
		return hasSequentialDialogue;
	}

	public void setHasSequentialDialogue(boolean hasSequentialDialogue) {
		this.hasSequentialDialogue = hasSequentialDialogue;
	}

	public String toString() {
		String result = "";
		result += "Name: \t\t" + name;
		result += "\nRace: \t\t" + race;
		result += "\nLocation: \t(" + xPos + ", " + yPos + ")";
		result += "\nSequentional: \t" + hasSequentialDialogue;
		result += "\nDialogue: \t" + dialogue[0] + "\n";
		result += printDialogue();
		
		return result;
	}
}
