package com.mycompany.a2;

import java.util.Vector;

import Interfaces.ICollection;
import Interfaces.IIterator;

public class GameObjectCollection implements ICollection{
	
	private Vector gameObjectCollection;

	public GameObjectCollection() {
		gameObjectCollection = new Vector();
	}

	public void add(Object newObject) {
		gameObjectCollection.addElement(newObject);
	}

	public IIterator getIterator() {
		return new GameObjectIterator();
	}

	private class GameObjectIterator implements IIterator{
		
		private int currentElementIndex;
		
		public GameObjectIterator(){
			currentElementIndex = -1;
		}

		public boolean hasNext() {
			if(gameObjectCollection.size() <= 0){
				return false;
			}
			if(currentElementIndex == gameObjectCollection.size() - 1){
				return false;
			}
			return true;
		}

		public Object getNext() {
			currentElementIndex++;
			return(gameObjectCollection.elementAt(currentElementIndex));
		}
		
	}
}
