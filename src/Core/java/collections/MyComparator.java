package Core.java.collections;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MyComparator {
    public static void main(String[] args) { new MyComparator().go(); }
        public  void go() {
            List<Player> footballTeam = new ArrayList<>();
            footballTeam.add(new Player(45, "Steven", 24));
            footballTeam.add(new Player(59, "John", 20));
            footballTeam.add(new Player(67, "Roger", 22));

            footballTeam.sort((Player member1, Player member2)
                            -> member2.getAge().compareTo(member1.getAge()));
            System.out.println(footballTeam);
           footballTeam.sort(Comparator.comparingInt(Player::getAge));
            System.out.println(footballTeam);
        }
    }

class Player{
     int ranking;
     String name;
     int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }
    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String toString() {
        return ranking + " " + name + " ";
    }
}