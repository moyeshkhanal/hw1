package hw1;

import java.sql.Types;
import java.util.HashMap;

/**
 * This class represents a tuple that will contain a single row's worth of information
 * from a table. It also includes information about where it is stored
 * @author Sam Madden modified by Doug Shook
 *
 */
public class Tuple {
	
	private TupleDesc tupleDesc;
	private int pid, id;
	private Field[] fields;
	/**
	 * Creates a new tuple with the given description
	 * @param t the schema for this tuple
	 */
	public Tuple(TupleDesc t) {
		//your code here
		this.tupleDesc = t;
		this.fields = new Field[t.numFields()];
	}
	
	public TupleDesc getDesc() {
		//your code here
		return this.tupleDesc;
	}
	
	/**
	 * retrieves the page id where this tuple is stored
	 * @return the page id of this tuple
	 */
	public int getPid() {
		//your code here
		return this.pid;
	}

	public void setPid(int pid) {
		//your code here
		this.pid = pid;
	}

	/**
	 * retrieves the tuple (slot) id of this tuple
	 * @return the slot where this tuple is stored
	 */
	public int getId() {
		//your code here
		return this.id;
	}

	public void setId(int id) {
		//your code here
		this.id = id;
	}
	
	public void setDesc(TupleDesc td) {
		//your code here;
		this.tupleDesc = td;
	}
	
	/**
	 * Stores the given data at the i-th field
	 * @param i the field number to store the data
	 * @param v the data
	 */
	public void setField(int i, Field v) {
		//your code here
		 if (i >= 0 && i < fields.length) {
		        fields[i] = v;
		 } 
	}
	
	public Field getField(int i) {
		//your code here
		 if (i >= 0 && i < fields.length) {
		        return fields[i];
		 }
	}
	
	/**
	 * Creates a string representation of this tuple that displays its contents.
	 * You should convert the binary data into a readable format (i.e. display the ints in base-10 and convert
	 * the String columns to readable text).
	 */
	public String toString() {
		//your code here
		return "";
	}
}
	