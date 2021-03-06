import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayOrganizer organizer = new ArrayOrganizer();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(500);
        list1.add(900);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(800);
        list2.add(600);
        list2.add(300);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(400);
        list3.add(700);
        list3.add(200);

        ArrayList<Integer> result = organizer.concatAndSort(list1, list2, list3);

        System.out.print("Result => [");
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.println(result.get(result.size() - 1) + "]");

        System.out.println("---------------------------------");

        Player tom = new Player("Tom");
        Player john = new Player("John");
        Player james = new Player("James");
        Player henry = new Player("Henry");

        Die die = new Die();
        for (int i = 0; i < 5; i++) {
            tom.addScore(die.rollDie());
            john.addScore(die.rollDie());
            james.addScore(die.rollDie());
            henry.addScore(die.rollDie());
        }

        System.out.println(tom);
        System.out.println(john);
        System.out.println(james);
        System.out.println(henry);
    }
}
