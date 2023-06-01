package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> arrayOfAllFlies = Files.readAllLines(path, charset);

        startTravel(arrayOfUniqCities(arrayOfAllFlies), arrayOfAllFlies);


    }


    public static Set<String> arrayOfUniqCities(List<String> arrayOfAllFlies) {
        Set<String> arrayOnlyCities = new HashSet<>();
        for (String string : arrayOfAllFlies) {
            String[] cities = string.split("->");
            arrayOnlyCities.addAll(List.of(cities[0].trim(), cities[1].trim()));
        }
        return arrayOnlyCities;

    }

    public static void displayCities(Set<String> arrayOfUniqCities) {
        List<String> listOfCities = new ArrayList<>(arrayOfUniqCities);
        System.out.println("There are the list of all available cities:");
        for (int i = 0; i < listOfCities.size(); i++) {
            System.out.println((i + 1) + ". " + listOfCities.get(i));
        }
    }


    public static void startTravel(Set<String> arrayOfAllCities, List<String> arrayOfAllFlies) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("To show list of available cities press 1");
        System.out.println("To exit program press #");

        String input = scanner.nextLine();

        if (input.equals("1")) {

            displayCities(arrayOfAllCities);
            System.out.println("To select a city from which you would like to start, enter the city name:");
            String chosenCity = scanner.nextLine();

            List<String> route = new ArrayList<>();
            route.add(chosenCity);

            String currentCity = chosenCity;
            while (true) {
                List<String> destinations = showAvailableDestinations(arrayOfAllFlies).get(currentCity);

                System.out.println("Destinations from " + currentCity + ":");
                for (String destination : destinations) {
                    System.out.println(destination);
                }

                System.out.println("Select the next city or press # to finish:");
                String nextCity = scanner.nextLine();

                if (nextCity.equals("#")) {
                    System.out.println("Exiting program...");
                    break;
                }

                if (!destinations.contains(nextCity)) {
                    System.out.println("Invalid destination. Please try again.");
                    continue;
                }
                if (chosenCity.equals(nextCity)) {
                    route.add(nextCity);
                    System.out.println("Round-trip route chosen:");
                    for (String city : route) {
                        System.out.println(city);
                    }
                    break;
                }

                route.add(nextCity);
                currentCity = nextCity;
            }

        } else if (input.equals("#")) {
            System.out.println("Exiting program...");
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }


    public static Map<String, List<String>> showAvailableDestinations(List<String> flights) {
        Map<String, List<String>> allFlies = new HashMap<>();
        for (String flight : flights) {
            String[] parts = flight.split(" -> ");
            String source = parts[0];
            String destination = parts[1];

            allFlies.putIfAbsent(source, new ArrayList<>());
            allFlies.get(source).add(destination);
        }
        return allFlies;
    }


}

