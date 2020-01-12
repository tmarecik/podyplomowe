package collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(123);
        myList.add(4);
        myList.add(56);

//        System.out.println(myList.size());
//        System.out.println(myList.get(0));
//        System.out.println(myList.remove(2));
//        System.out.println(myList.size());
//
//        myList.clear();
//
//        System.out.println(myList.size());

        //iterator

//        Iterator<Integer> iterator = myList.iterator();  //pozyskanie itartora
//        while (iterator.hasNext()){
//            if(iterator.next().equals(4)){
//                iterator.remove();
//            }
//            System.out.println(iterator.hasNext());
//        }

        ListIterator<Integer> listIterator = myList.listIterator();  //list iterator
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex() + " " + listIterator.next());
        }

        System.out.println("----------------------");

        while (listIterator.hasPrevious()){
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println(index + " " + value);
        }

        //kopiowanie arraylisty do zwykłej tablicy

        Integer[] arr = new Integer[myList.size()];
        arr = myList.toArray(arr);

        System.out.println("-----------");
        System.out.println(arr[0]);

        //dodawanie hurtowe

        List<Integer> bigList = new ArrayList<>();
        bigList.addAll(myList);
        bigList.addAll(myList);
        bigList.addAll(myList);
        bigList.addAll(myList);

        for(int i = 0; i < bigList.size(); i++){
            System.out.println(bigList.get(i));
        }

        System.out.println("*****************");
        System.out.println(myList);

    }



}
