package pattern.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 访问者模式适合数据结构稳定，算法频繁变化的情况
 * 
 * @author ljh
 *
 */
public class Client {
	public static void main(String[] args) {
		List<Element> list = new ArrayList<Element>();
		
		for(int i=0;i<50;i++) {
			int random = new Random().nextInt(100);
			if(random>50) {
				list.add(new Element1());
			}else {
				list.add(new Element2());
			}
		}
		
		for(Element liste : list) {
			liste.doSomething();
		}
	}
}
