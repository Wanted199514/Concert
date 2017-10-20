package Concert.Comparable;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        TreeSet<People> treeSet = new TreeSet<>();

        treeSet.add(new Djentelmans("Владимир Дубовский", 10));
        treeSet.add(new Ladies("Светлана Дубовская", 5));
        treeSet.add(new Djentelmans("Дмитрий Дубовский", 20));
        treeSet.add(new Ladies("Юля Усинина", 6));
        treeSet.add(new Ladies("Катя Уррицская", 30));
        treeSet.add(new Ladies("Диана Невская", 70));


        for (People people :
                treeSet) {
            if (people.woman == true) {
                System.out.println("Имя: " + people.name + ", количество брошек: " + people.razmerUsovAndBroshek);
            }
        }

        for (People people :
                treeSet) {
            if (people.woman == false) {
                System.out.println("Имя: " + people.name + ", размер усов: " + people.razmerUsovAndBroshek);
            }
        }
    }
}