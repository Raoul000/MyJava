package nameDao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NameDaoImpl implements NameDao {

	@Override
	public List<String> getNameFromArray(String[] names) {
		List<String> list = new ArrayList<String>();
		ListIterator<String> it = list.listIterator();
		for (int i = 0; i < names.length; i++) {
			it.add(names[i]);
		}
		return list;
	}

	@Override
	public int searchName(List nameList, String name) {
		ListIterator<String> it = nameList.listIterator();
		while (it.hasNext()) {
			if (it.next() == name)
				return it.nextIndex();
		}
		return -1;

	}

	@Override
	public boolean removeFromList(List nameList, int id) throws IllegalArgumentException {
		ListIterator<String> it = nameList.listIterator();
		if (nameList.remove(id) != null)
			return true;
		if (id < 0 || id > nameList.size())
			throw new IllegalArgumentException();
		return false;
	}
}
