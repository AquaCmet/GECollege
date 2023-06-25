package kensyu_20230602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Creatorに相当する
abstract class ListPrinter {
    // anOperationに相当する
    public void printList(List<String> list) {
        Comparator<String> comparator = createComparator();
        list = new ArrayList<String>(list);

        Collections.sort(list, comparator);

        for (String item : list) {
            System.out.println(item);
        }
    }

    // factoryMethodに相当する
    protected abstract Comparator<String> createComparator();
}

// ConcreteCreatorに相当する
class DictionaryOrderListPrinter extends ListPrinter {
    @Override
    protected Comparator<String> createComparator() {
        return new DictionaryOrderComparator();
    }
}

// java.util.ComparatorがProductに相当する

// ConcreteProductに相当する
class DictionaryOrderComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}

// ConcreteCreatorに相当する
class LengthOrderListPrinter extends ListPrinter {
    @Override
    protected Comparator<String> createComparator() {
        return new LengthOrderComparator();
    }
}

// ConcreteProductに相当する
class LengthOrderComparator implements Comparator<String> {
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }
}

// メインクラス
public class FactoryMethod {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("いちご", "もも", "いちじく");

        System.out.println("五十音順で表示:");
        new DictionaryOrderListPrinter().printList(list);

        System.out.println();

        System.out.println("長さ順で表示:");
        new LengthOrderListPrinter().printList(list);
    }
}