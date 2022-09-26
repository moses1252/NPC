package npc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//default NPC
		NPC test = new NPC();

		//2nd NPC
		String name = "John";
		String race = "Human";
		int xPos = 823;
		int yPos = 289;
		String[] dialogue = {
				"Hello there",
				"What a nice day outside",
				"Whats your mission",
				"You cannot pass yet"				
		};
		boolean seq = true;
		NPC test2 = new NPC(name, race, xPos, yPos, dialogue, seq);
		
		//3rd NPC
		String name2 = "Wolverine";
		String race2 = "Mutant";
		int xPos2 = 222;
		int yPos2 = 3;
		String[] dialogue2 = {
				"What bub",
				"what are you staring at",
				"get lost"
		};
		boolean seq2 = false;
		NPC test3 = new NPC(name2, race2, xPos2, yPos2, dialogue2, seq2);
	
		//main menu
		System.out.println("Welcome to the NPC Menu");
		boolean mainMenu = true;
		while(mainMenu) {
			Scanner user = new Scanner(System.in);
			
			//user options
			System.out.print("Choose an NPC\n" + "1. " + test.getName() + "\n2. " 
			+ test2.getName() + "\n3. " + test3.getName() + "\n4. Exit prgram\nEnter the number choice (1-4):");
			int userChoice1 = user.nextInt();
			
			//check user input
			boolean check = true;
			while(check) {
				if (userChoice1 < 0 || userChoice1 > 4) {
					System.out.println("Error: enter a number between 1-4\n");
					System.out.print("Choose an NPC\n" + "1. " + test.getName() + "\n2. " 
					+ test2.getName() + "\n3. " + test3.getName() + "\n4. Exit prgram\nEnter the number choice (1-4):");
					userChoice1 = user.nextInt();
				} else {
					check = false;
				}
			}
			
			//npc menu
			boolean npcMenu = true;
			while(npcMenu) {
				//npc 1
				if(userChoice1 == 1) {
					//user options
					System.out.println("\nTest Menu for " + test.getName());
					printOptions();
					int userChoice2 = user.nextInt();
					
					//check user input
					boolean check2 = true;
					while(check2) {
						if (userChoice1 < 0 || userChoice1 >=  7) {
							System.out.print("Error: enter a number between 1-7\n");
							printOptions();
							userChoice2 = user.nextInt();
						} else {
							check2 = false;
						}
					}
					
					//options for npc actions
					if(userChoice2 == 1) {
						System.out.println(test.toString());
					} else if(userChoice2 == 2) {
						System.out.println(test.talk());
					} else if(userChoice2 == 3) {
						test.walk("up");
						System.out.println(test.getyPos());
					} else if(userChoice2 == 4) {
						test.walk("down");
						System.out.println(test.getyPos());
					} else if(userChoice2 == 5) {
						test.walk("left");
						System.out.println(test.getxPos());
					} else if(userChoice2 == 6) {
						test.walk("right");
						System.out.println(test.getxPos());
					} else if(userChoice2 == 7) {
						npcMenu = false;
					}
				}
				
				//npc 2
				if(userChoice1 == 2) {
					//user options
					System.out.println("\nTest Menu for " + test2.getName());
					printOptions();
					int userChoice2 = user.nextInt();
					
					//check user input
					boolean check2 = true;
					while(check2) {
						if (userChoice1 < 0 || userChoice1 >=  7) {
							System.out.print("Error: enter a number between 1-7\n");
							printOptions();
							userChoice2 = user.nextInt();
						} else {
							check2 = false;
						}
					}
					
					//options for npc actions
					if(userChoice2 == 1) {
						System.out.println(test2.toString());
					} else if(userChoice2 == 2) {
						System.out.println(test2.talk());
					} else if(userChoice2 == 3) {
						test2.walk("up");
						System.out.println(test2.getyPos());
					} else if(userChoice2 == 4) {
						test2.walk("down");
						System.out.println(test2.getyPos());
					} else if(userChoice2 == 5) {
						test2.walk("left");
						System.out.println(test2.getxPos());
					} else if(userChoice2 == 6) {
						test2.walk("right");
						System.out.println(test2.getxPos());
					} else if(userChoice2 == 7) {
						npcMenu = false;
					}
				}
				
				//npc 3
				if(userChoice1 == 3) {
					//user options
					System.out.println("\nTest Menu for " + test3.getName());
					printOptions();
					int userChoice2 = user.nextInt();
					
					//check user input
					boolean check2 = true;
					while(check2) {
						if (userChoice1 < 0 || userChoice1 >=  7) {
							System.out.print("Error: enter a number between 1-7\n");
							printOptions();
							userChoice2 = user.nextInt();
						} else {
							check2 = false;
						}
					}
					
					//options for npc actions
					if(userChoice2 == 1) {
						System.out.println(test3.toString());
					} else if(userChoice2 == 2) {
						System.out.println(test3.talk());
					} else if(userChoice2 == 3) {
						test3.walk("up");
						System.out.println(test3.getyPos());
					} else if(userChoice2 == 4) {
						test3.walk("down");
						System.out.println(test3.getyPos());
					} else if(userChoice2 == 5) {
						test3.walk("left");
						System.out.println(test3.getxPos());
					} else if(userChoice2 == 6) {
						test3.walk("right");
						System.out.println(test3.getxPos());
					} else if(userChoice2 == 7) {
						npcMenu = false;
					}
				}
				//exit program
				if(userChoice1 == 4) {
					System.out.print("\nThank you for using my program");
					mainMenu = false;
					npcMenu = false;
				}
			}
		}
	}
	
	static void printOptions() {
		String result = "";
		result += "1. Display NPC Information.";
		result += "\n2. Talk to NPC.";
		result += "\n3. Make NPC walk up";
		result += "\n4. Make NPC walk down";
		result += "\n5. Make NPC walk left";
		result += "\n6. Make NPC walk right";
		result += "\n7. Go back to previous menu";
		result += "\nEnter the number choice (1-7): ";
		System.out.print(result);
	}

}
