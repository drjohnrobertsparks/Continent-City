package org.johnrsparks;

import java.util.Locale;

public class Continent {
    private String city;

    public void setCity(String continentName){
        String continentNameToLower = continentName.toLowerCase();

        switch(continentNameToLower){
            case "north america":
                city = "Mexico City, Mexico";
                break;
            case "south america":
                city = "Sao Paulo, Brazil";
                break;
            case "europe":
                city = "Istanbul, Turkey";
                break;
            case "africa":
                city = "Lagos, Nigeria";
                break;
            case "asia":
                city = "Tokyo, Japan";
                break;
            case "australia":
                city = "Sydney, Australia";
                break;
            case "antartica":
                city = "Top Secret (Probably Santa's vacation home!)";
                break;
            default:
                city = "Undefined continent!";
                break;
        }
    }
    public String getCity(){
        return city;
    }
}
