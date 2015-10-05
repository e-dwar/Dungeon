package dungeon.action;

public interface Action {

	/**
	 * Executes a different scenario for each action.
	 * 
	 * @param args
	 *            An array if arguments passed to this command.
	 */
	public void execute(String[] args);
}
