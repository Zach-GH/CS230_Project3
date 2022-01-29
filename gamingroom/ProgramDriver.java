package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		// Creates instance of GameService
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		Game game3 = service.addGame("Goblet of Fire");
		System.out.println(game3);
		
		// testing creation of a new game with the same name
		Game game4 = service.addGame("Goblet of Fire");
		System.out.println(game4);
		
		Game game5 = service.addGame("Mario Kart");
		System.out.println(game5);
		// testing functionality after duplicate game attempt
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
		System.out.println("\nCreating Teams");
		System.out.println(service.getGame(2).addTeam("Gryffindor"));
		System.out.println(service.getGame(2).addTeam("Hufflepuff"));
		System.out.println(service.getGame(2).addTeam("Ravenclaw"));
		System.out.println(service.getGame(2).addTeam("Slytherin"));
		// testing duplicate teams 
		System.out.println(service.getGame(2).addTeam("Slytherin"));
		// testing functionality after duplicate team attempt
		System.out.println(service.getGame(2).addTeam("Hogwarts"));
		
		System.out.println("\nAdding Players");
		System.out.println(service.getGame(2).addTeam("Gryffindor").addPlayer("Godric Gryffindor"));
		System.out.println(service.getGame(2).addTeam("Hufflepuff").addPlayer("Helga Hufflepugg"));
		System.out.println(service.getGame(2).addTeam("Ravenclaw").addPlayer("Rowena Ravenclaw"));
		System.out.println(service.getGame(2).addTeam("Slytherin").addPlayer("Salazar Slytherin"));
		System.out.println(service.getGame(2).addTeam("Slytherin").addPlayer("Salazar Slytherin"));
		// testing duplicate players 
		System.out.println(service.getGame(2).addTeam("Hogwarts").addPlayer("Dumbledore"));
		// testing functionality after duplicate player attempt
		
	}
	
	
}
