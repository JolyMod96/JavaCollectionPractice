package org.itstep;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Map<String, TreeSet<String>> networkMap = new HashMap<>();
        var input = new Scanner(System.in);
        for(var i = 0; i < 10; i++) {
            System.out.print("Input tv network: ");
            var network = input.nextLine();
            System.out.print("Input tv show on " + network + ": ");
            var show = input.nextLine();
            var showsSet = networkMap.computeIfAbsent(network, k -> new TreeSet<>());
            showsSet.add(show);
            System.out.println(networkMap + "\n");
        }
        System.out.println("\nContents of networkMap:");
        List<String> networks = new ArrayList<>(networkMap.keySet());
        Collections.sort(networks);
        for (var network : networks) {
            System.out.println(network + ": " + networkMap.get(network));
        }
        // TreeSet автоматически сортирует свои элементы в порядке возрастания, поэтому не нужно сортировать ТВ-шоу в кажом канале вручную.
    }
}
