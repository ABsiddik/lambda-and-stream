package com.itkhamar.streamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryListTester {
    /**
     * Capitalize everything
     * Filter out countries beginning with "C"
     * Sort countries in alphabetical order
     * Print result to console
     */
    private static List<String> countryList;
    static {
        countryList = new ArrayList<String>();
        countryList.add("Bangladesh");
        countryList.add("Australia");
        countryList.add("China");
        countryList.add("Brazil");
        countryList.add("India");
        countryList.add("Russia");
        countryList.add("Ireland");
        countryList.add("United Kingdom");
        countryList.add("Spain");
        countryList.add("United States");
    }

    public static void main(String[] args) {
        System.out.println("Country List process with For Loop");
        doTestWithForLoop();
        System.out.println();
        System.out.println("Country List process with Stream");
        doTestWithStream();
    }

    private static void doTestWithForLoop() {
        Collections.sort(countryList);
        for (String country : countryList) {
            country = country.toUpperCase();
            if (!country.startsWith("C")) {
                System.out.println(country);
            }
        }
    }

    private static void doTestWithStream() {
        countryList.stream()
                .map(String::toUpperCase)
                .filter((country) -> !country.startsWith("C"))
                .sorted()
                .forEach(System.out::println);
    }
}
