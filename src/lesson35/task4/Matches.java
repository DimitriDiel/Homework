package lesson35.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Matches {
    public static void main(String[] args) throws IOException {

        List<MatchLesson37> matches = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("src/lesson35/task4/matches.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.trim().split(", ");
            Calendar date = new GregorianCalendar(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            String team1 = parts[3];
            String result = parts[4];
            String team2 = parts[5];
            int watchers = 0;
            if (!Objects.equals(parts[6], "NULL")) {
                watchers = Integer.parseInt(parts[6]);
            }
            String stadium = parts[7];

            MatchLesson37 newMatch = new MatchLesson37(date, team1, result, team2, watchers, stadium);
            matches.add(newMatch);

        }

//        a) выбрать все матчи которые были в первой половине месяца

        int count = 1;
        List<MatchLesson37> collect = matches.stream()
                .filter(match -> match.getDate().get(Calendar.DATE) <= 15)
                .toList();

        for (MatchLesson37 match : collect) {
            System.out.println(count + ". " + match);
            count++;
        }

//        b) посчитать общее количество матчей в выборке

        System.out.println("Общее количество матчей в списке: " + matches.stream().count());
        System.out.println("-------------");

//        c) выбрать топ 10 самых посещаемых матчей

        count = 1;
        List<MatchLesson37> top10Match = matches.stream()
                .sorted(Comparator.comparing(MatchLesson37::getWatchers).reversed())
                .limit(10)
                .toList();

        for (MatchLesson37 match : top10Match) {
            System.out.println(count + ". " + match);
            count++;
        }

        System.out.println("-------------");


//        d) выбрать топ 3 матчей с самой большой разницей в счете на стадионе WWK Arena

            count = 1;
            List<MatchLesson37> wwkArena = matches.stream()
                    .filter(matchWWK -> matchWWK.getStadium().equals("WWK Arena"))
                    .sorted((m1,m2) -> Math.abs(m2.getResult1() - m2.getResult2()) - Math.abs(m1.getResult1() - m1.getResult2()))
                    .limit(3)
                    .toList();

        for (MatchLesson37 match : wwkArena) {
            System.out.println(count + ". " + match);
            count++;
        }

        System.out.println("-------------");
//        e) посчитать сколько матчей содержат упоминания о стадионе

            matches.stream()
                    .filter(matchWWK -> matchWWK.getStadium().equals("WWK Arena"))
                    .forEach(matchWWK -> System.out.println(matchWWK));

        System.out.println("-------------");
//        f) посчитать сколько матчей сыграла каждая команда в качестве гостя (в формате map)

        countGuestMatch(matches);

//        g) выделить наиболее популярный день проведения матча

        Map<Integer, Long> dayOfWeek = matches.stream()
                .collect(Collectors.groupingBy(match -> match.getDate().get(Calendar.DAY_OF_WEEK),Collectors.counting()));
//
        Map<Integer, Long> dayOfWeekSorted = dayOfWeek.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<Integer,Long> entry : dayOfWeekSorted.entrySet()){
            System.out.println("Самый популярный день: " + entry.getKey() + ", количество матчей: " + entry.getValue());
        }



    }


    public static Map<String, Integer> countGuestMatch(List<MatchLesson37> matches) {
        Map<String,Integer> guestMathesCounter = matches.stream()
                .collect(Collectors.groupingBy(MatchLesson37::getTeam2, Collectors.summingInt(a->1)));

        printMap(guestMathesCounter);
        return guestMathesCounter;
    }

    public static void printMap(Map<String, Integer> map) {
        int count = 1;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(count + " на выезде: " + entry.getKey() + ", кол-во матчей: " + entry.getValue());
            count++;
        }
    }
}
