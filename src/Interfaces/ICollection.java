package Interfaces;
/**
 * Provides interface for adding objects to a collection and
 * getting an Iterator for the collection.
 * 
 * Part of Iterator Design Pattern.
 * @author Blake
 *
 */
public interface ICollection {
	
	public void add(Object newObject);
	public IIterator getIterator();

}
