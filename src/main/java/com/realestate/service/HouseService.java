package com.realestate.service;

import com.realestate.model.House;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    public double getTotalPriceForHouses(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceForVillas(List<? extends House> villas) {
        return getTotalPriceForHouses(villas);
    }

    public double getTotalPriceForHolidayHomes(List<? extends House> holidayHomes) {
        return getTotalPriceForHouses(holidayHomes);
    }

    public double getTotalPriceForAllHouses(List<? extends House> houses,
                                            List<? extends House> villas,
                                            List<? extends House> holidayHomes) {
        return getTotalPriceForHouses(houses) + getTotalPriceForVillas(villas) + getTotalPriceForHolidayHomes(holidayHomes);
    }

    public double getAverageAreaForHouses(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaForVillas(List<? extends House> villas) {
        return getAverageAreaForHouses(villas);
    }

    public double getAverageAreaForHolidayHomes(List<? extends House> holidayHomes) {
        return getAverageAreaForHouses(holidayHomes);
    }

    public double getAverageAreaForAllHouses(List<? extends House> houses,
                                             List<? extends House> villas,
                                             List<? extends House> holidayHomes) {
        double totalArea = houses.stream().mapToDouble(House::getArea).sum()
                + villas.stream().mapToDouble(House::getArea).sum()
                + holidayHomes.stream().mapToDouble(House::getArea).sum();
        int totalCount = houses.size() + villas.size() + holidayHomes.size();
        return totalCount == 0 ? 0 : totalArea / totalCount;
    }

    public List<House> filterHousesByRoomsAndLivingRooms(List<House> houses, int roomCount, int livingRoomCount) {
        return houses.stream()
                .filter(h -> h.getNumberOfRooms() == roomCount && h.getNumberOfLivingRooms() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
