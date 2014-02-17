package dcll.ebel.MySimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayImplement implements SimpleStack{
	ArrayList<Item> uneArray = new ArrayList<Item>();
	@Override
	public boolean isEmpty() {
		return uneArray.isEmpty();
	}

	@Override
	public int getSize() {
		return uneArray.size();
	}

	@Override
	public void push(Item item) {
		uneArray.add(item);
		
	}

	@Override
	public Item peek() throws EmptyStackException {
		return uneArray.get(getSize());
	}

	@Override
	public Item pop() throws EmptyStackException {
		return uneArray.remove(getSize());
	}

}
