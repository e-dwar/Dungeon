package dungeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import dungeon.action.*;
import dungeon.character.*;
import dungeon.level.*;
import dungeon.room.*;

public class Dungeon {

	protected boolean gameIsFinished = false;
	protected static ArrayList<Level> levels = new ArrayList<Level>();
	protected final static HashMap<String, Action> actions = new HashMap<String, Action>();
	protected final static Scanner scanner = new Scanner(System.in);
	protected final static Hero hero = new Hero("Marcel");

	public static void interpretCommand(String command) {
		String[] argv = command.trim().split(" ", 2);
		Action action = actions.get(argv[0]);
		if (action == null) {
			messageIdk();
		}
		else {
			action.execute(argv);
		}
	}

	public static void main(String[] args) {
		actions.put("go", new Go());
		actions.put("about", new About());
		actions.put("unlock", new Unlock());
		actions.put("help", new Help());
		actions.put("fight", new Fight());
		actions.put("heal", new Heal());
		actions.put("feed", new Feed());
		actions.put("press", new Press());
		actions.put("open", new Open());
		levels.add(new Level1());
		levels.add(new Level2());
		start();
	}

	public static void start() {
		printLine();
		message("Type \"help\" to see a list of the commands.");
		printLine();
		actions.get("about").execute("about here".split(" ", 2));
		do {
			printLine();
			message("What do you want to do?");
			// Read a command from the user (stdin)
			interpretCommand(prompt());
		} while (!levelIsFinished());
		printLine();
		if (gameIsWon()) {
			message("You win!");
			levels.remove(0);
			if (levels.size() > 0) {
				start();
			}
		} else {
			message("You loose!");
		}
	}

	public static Level getCurrentLevel() {
		return levels.get(0);
	}

	public static Hero getHero() {
		return hero;
	}
	
	public static Action getAction(String name) {
		return actions.get(name);
	}

	public static boolean levelIsFinished() {
		return gameIsLost() || gameIsWon();
	}

	public static boolean gameIsLost() {
		Level level = getCurrentLevel();
		Room room = level.getCurrentRoom();
		return room.getName().equals("trap") || hero.isDead();
	}

	public static boolean gameIsWon() {
		Level level = getCurrentLevel();
		Room room = level.getCurrentRoom();
		return room.getName().equals("exit");
	}

	public static String prompt() {
		print("> ");
		return scanner.nextLine();
	}

	public static void printLine() {
		message("----------");
	}

	public static void messageFight() {
		message("Fight or feed this monster! Otherwise, step back!");
	}

	public static void messageIdk() {
		message("I don’t know what you mean.");
	}

	public static void message(String text) {
		System.out.println(text);
	}

	public static void print(String text) {
		System.out.print(text);
	}
}
