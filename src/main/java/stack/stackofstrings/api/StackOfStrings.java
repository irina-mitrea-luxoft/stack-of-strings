package stack.stackofstrings.api;

public interface StackOfStrings {
	
	/**
	 * Pushes an String onto the top of this stack.
	 * 
	 * @param   name   the String to be pushed onto this stack.
	 */
	public void push(String name);
	
	/**
	 * Removes the object at the top of this stack.
     * 
	 * @return  The object at the top of this stack.
	 */
	public String pop();
	
	/**
	 * Create a StringBuilder with all values from stack.
	 * 
	 * @return A String which represents the stack content.
	 */
	public String toString();
	
	/**
	 * Return the size of stack.
	 * 
	 * @return The size of stack represented by number of objects
	 * that are in stack.
	 */
	public int getSize();

}
