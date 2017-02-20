package arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists_01 {
	public static void main(String[] args) {
		ArrayList<Car> carsList = new ArrayList<Car>();
		
		Car c = new Car("H234");
		
		carsList.add(c);
		
		System.out.println(carsList.size());
		
		for(int i=0; i<5; i++) {
			carsList.add(new Car("H" + i));
		}
		
		// TAKE NOTE: add() 'pushes' the trailing elements further down.
		carsList.add(4, new Car("H345"));
		
		// Iterator
		Iterator<Car> carIterator = carsList.iterator();
		while(carIterator.hasNext()) {
			System.out.println(carIterator.next());
		}
		
		// Clone
		ArrayList<Car> carsList2 = (ArrayList<Car>)carsList.clone();
		
		Iterator<Car> carIterator2 = carsList2.iterator();
		while(carIterator2.hasNext()) {
			System.out.println("----" + carIterator2.next());
		}
		
		// Contains
		System.out.println(carsList.contains(new Car("H234")));
	}
}
