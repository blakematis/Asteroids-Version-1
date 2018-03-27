package com.mycompany.a2;
/**
 * This proxy accepts and holds a GameWorld, also provides implementation
 * of all public methods in a GameWorld, forwards allowed calls to the actual
 * GameWorld, and rejects calls to methods which the outside should not be able
 * to access in the GameWorld.
 */
import java.util.Observable;
import Interfaces.IGameWorld;

public class GameWorldProxy extends Observable implements IGameWorld{

	public GameWorldProxy() {
		// TODO Auto-generated constructor stub
	}

}
