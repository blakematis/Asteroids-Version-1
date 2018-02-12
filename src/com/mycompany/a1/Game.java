package com.mycompany.a1;

import com.codename1.ui.Form;

/**
 * Primary class Game is a controller that encapsulates the flow of control in the game.
 * Contains several components: GameWorld, and play() method to accept and execute user 
 * commands. The Game controller enforces rules such as what actions a player may take
 * and what happens as a result. This class accepts user input in the form of keyboard
 * commands from the human player and invokes appropriate methods in the game world to
 * perform the requested commands to manipulate data in the GameWorld model.
 * 
 * @author Blake Matis
 *
 */
public class Game extends Form{
	
	/*---------------------------------------DATA---------------------------------------*/
	private GameWorld gw;

	

	/*-----------------------------------CONSTRUCTORS-----------------------------------*/
	
	/**
	 * Default Constructor performs the following:
	 * Game has-a GameWorld object. 
	 * Game initializes the GameWorld object with the init() method.
	 * Game then calls the play() method accepting user commands.
	 */
	public Game(){
		this.gw = new GameWorld();
		this.gw.init();
		play();
	}
	

	
	/*----------------------------------PRIVATE METHODS---------------------------------*/
	
	/**
	 * Accepts and executes user commands
	 */
	public void play(){
		//TODO
		
	}
}
