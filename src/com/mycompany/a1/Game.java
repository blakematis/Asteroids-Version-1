package com.mycompany.a1;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

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
	@SuppressWarnings("rawtypes")
	private void play(){
		Label myLabel = new Label("Enter a Command: ");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();
		try{
			myTextField.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent evt){
						
					String sCommand = myTextField.getText().toString();
					myTextField.clear();
					if(gw.isExitGame()){
						if(sCommand.charAt(0) == 'y'){
							gw.quit();
						}else{
							gw.setExitGame(false);
							return;
						}
						
					}else{
						
						switch(sCommand.charAt(0)){
							case 'a':
								gw.newAsteroid();
								break;
							case 'y':
								gw.newFlyingSaucer();
								break;
							case 'b':
								gw.newBlinkingSpaceStation();
								break;
							case 's':
								gw.newShip();
								break;
							case 'i':
								gw.increaseShipSpeed();
								break;
							case 'd':
								gw.decreaseShipSpeed();
								break;
							case 'l':
								gw.turnShipLeft();
								break;
							case 'r': 
								gw.turnShipRight();
								break;
							case 'f':
								gw.fireMissile();
								break;
							case 'j':
								gw.jumpThroughSpace();
								break;
							case 'n':
								gw.loadNewMissiles();
								break;
							case 'k':
								gw.missileKilledAsteroid();
								break;
							case 'e':
								gw.eliminate();
								break;
							case 'c':
								gw.shipCrashedIntoAsteroid();
								break;
							case 'h':
								gw.shipHitFlyingSaucer();
								break;
							case 'x':
								gw.asteroidExterminated();
								break;
							case 'w':
								gw.asteroidWhackedFlyingSaucer();
								break;
							case 't':
								gw.tick();
								break;
							case 'p':
								gw.print();
								break;
							case 'm':
								gw.map();
								break;
							case 'q':
								gw.quit();
								break;
							default:
								break;
							
						}
					}
				}
			});
		}catch (StringIndexOutOfBoundsException e){
			e.addSuppressed(e);
		}
	}
}
