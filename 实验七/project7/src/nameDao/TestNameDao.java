package nameDao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestNameDao {

	public static void main(String[] args) {
		String[] strings = { "С��", "С��", "С��", "С��" };
		List<String> list = new ArrayList<String>();
		NameDaoImpl namelist = new NameDaoImpl();
		int index;// ��Ҫ���ҵ��±�
		list = namelist.getNameFromArray(strings);// �����е��ַ��������б�
		ListIterator<String> it = list.listIterator();
		System.out.println("�б��е��ַ�����");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		index = namelist.searchName(list, "С��");
		System.out.println("�����ַ������б��е��±꣺");
		System.out.println(index);
		namelist.removeFromList(list, index);
		System.out.println("ɾ�����б��е��ַ�����");
		for (String st : list) {
			System.out.println(st);
		}
	}
}
