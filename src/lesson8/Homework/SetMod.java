package lesson8.Homework;

import java.util.Set;

public class SetMod<T> {
	public void union(Set<T> set1, Set<T> set2){
		set1.addAll(set2);
	}
	
	public void intersect(Set<T> set1, Set<T> set2){
		set1.retainAll(set2);
	}
}
