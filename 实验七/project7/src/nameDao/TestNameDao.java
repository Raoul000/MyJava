package nameDao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestNameDao {

	public static void main(String[] args) {
		String[] strings = { "小明", "小张", "小红", "小李" };
		List<String> list = new ArrayList<String>();
		NameDaoImpl namelist = new NameDaoImpl();
		int index;// 需要查找的下标
		list = namelist.getNameFromArray(strings);// 数组中的字符串放入列表
		ListIterator<String> it = list.listIterator();
		System.out.println("列表中的字符串：");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		index = namelist.searchName(list, "小红");
		System.out.println("查找字符的在列表中的下标：");
		System.out.println(index);
		namelist.removeFromList(list, index);
		System.out.println("删除后列表中的字符串：");
		for (String st : list) {
			System.out.println(st);
		}
	}
}
