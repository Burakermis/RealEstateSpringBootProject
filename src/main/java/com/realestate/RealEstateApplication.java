package com.realestate;

import com.realestate.model.*;
import com.realestate.service.HouseService;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RealEstateApplication {
    public static void main(String[] args) {
        List<House> houses = Arrays.asList(
                new House("House1", 150000, 120, 3, 1),
                new House("House2", 180000, 150, 4, 2),
                new House("House3", 200000, 180, 5, 3)
        );

        List<Villa> villas = Arrays.asList(
                new Villa("Villa1", 300000, 250, 4, 2),
                new Villa("Villa2", 350000, 300, 5, 3),
                new Villa("Villa3", 400000, 350, 6, 4)
        );

        List<HolidayHome> holidayHomes = Arrays.asList(
                new HolidayHome("HolidayHome1", 100000, 80, 2, 1),
                new HolidayHome("HolidayHome2", 120000, 100, 3, 1),
                new HolidayHome("HolidayHome3", 150000, 120, 3, 2)
        );

        HouseService service = new HouseService();

        System.out.println("Total house price: " + service.getTotalPriceForHouses(houses));
        System.out.println("Total villa price: " + service.getTotalPriceForVillas(villas));
        System.out.println("Total holiday home price: " + service.getTotalPriceForHolidayHomes(holidayHomes));
        System.out.println("Total all properties price: " + service.getTotalPriceForAllHouses(houses, villas, holidayHomes));

        System.out.println("Average house area: " + service.getAverageAreaForHouses(houses));
        System.out.println("Average villa area: " + service.getAverageAreaForVillas(villas));
        System.out.println("Average holiday home area: " + service.getAverageAreaForHolidayHomes(holidayHomes));
        System.out.println("Average all properties area: " + service.getAverageAreaForAllHouses(houses, villas, holidayHomes));

        System.out.println("Filtered houses with 3 rooms and 1 living room:");
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(houses);
        allHouses.addAll(villas);
        allHouses.addAll(holidayHomes);

        service.filterHousesByRoomsAndLivingRooms(allHouses, 3, 1)
                .forEach(System.out::println);
    }
}
