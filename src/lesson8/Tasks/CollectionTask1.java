package lesson8.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionTask1 {

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> myCollection = new ArrayList<Integer>();
		//Generate Collection(List) with 10 random Integers
		for(int i=0;i<10;i++){
			myCollection.add(new Integer(rand.nextInt(50)));
		}
		System.out.println("Generated collection myCollection: " + Arrays.toString(myCollection.toArray()));
		
		//Elements more than 5
		List<Integer> newCollection = new LinkedList<Integer>();
		for(int i=0;i<myCollection.size();i++){
			if(myCollection.get(i)>5){
				newCollection.add(myCollection.get(i));
			}
		}
		System.out.println("All positions of element more than 5 " + Arrays.toString(newCollection.toArray()));
		
		//Removed all elements greater 20
		Iterator<Integer> iter = myCollection.iterator();
		while(iter.hasNext()){
			if(iter.next()>20){
				iter.remove();
			}
		}
		System.out.println("Removed all elements greater 20: " + Arrays.toString(myCollection.toArray()));
		
		//Insert some elements
		//check if has enough elements
		if(myCollection.size()<8){
			int size=myCollection.size();
			for(int i=0;i<(8-size);i++){
				myCollection.add(0);
			}
		}
		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		
		for(int i=0;i<myCollection.size();i++){
			System.out.printf("position – %d, value of element – %d %n",i,myCollection.get(i));
		}
		
		//Sort collection
		myCollection.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		System.out.println("Collection sorted in ascending order: " + Arrays.toString(myCollection.toArray()));
	}

}
