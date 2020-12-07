package nameDao;

import java.util.List;
import java.util.ListIterator;

public interface NameDao {
	public List<String> getNameFromArray(String[] names);

	public int searchName(List nameList, String name);

	public boolean removeFromList(List nameList, int id);
}
