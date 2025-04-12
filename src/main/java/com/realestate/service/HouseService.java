package com.realestate.service;

import com.realestate.model.House;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    // Verilen evlerin toplam fiyatını hesaplar.
    public double getTotalPriceForHouses(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    // Verilen villaların toplam fiyatını hesaplar.
    public double getTotalPriceForVillas(List<? extends House> villas) {
        return getTotalPriceForHouses(villas);
    }

    // Verilen tatil evlerinin toplam fiyatını hesaplar.
    public double getTotalPriceForHolidayHomes(List<? extends House> holidayHomes) {
        return getTotalPriceForHouses(holidayHomes);
    }

    // Tüm mülklerin toplam fiyatını hesaplar.
    public double getTotalPriceForAllHouses(List<? extends House> houses,
                                            List<? extends House> villas,
                                            List<? extends House> holidayHomes) {
        return getTotalPriceForHouses(houses) + getTotalPriceForVillas(villas) + getTotalPriceForHolidayHomes(holidayHomes);
    }

    // Verilen evlerin ortalama alanını hesaplar.
    public double getAverageAreaForHouses(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    // Verilen villaların ortalama alanını hesaplar.
    public double getAverageAreaForVillas(List<? extends House> villas) {
        return getAverageAreaForHouses(villas);
    }

    // Verilen tatil evlerinin ortalama alanını hesaplar.
    public double getAverageAreaForHolidayHomes(List<? extends House> holidayHomes) {
        return getAverageAreaForHouses(holidayHomes);
    }

    // Tüm mülklerin ortalama alanını hesaplar.
    public double getAverageAreaForAllHouses(List<? extends House> houses,
                                             List<? extends House> villas,
                                             List<? extends House> holidayHomes) {
        double totalArea = houses.stream().mapToDouble(House::getArea).sum()
                + villas.stream().mapToDouble(House::getArea).sum()
                + holidayHomes.stream().mapToDouble(House::getArea).sum();
        int totalCount = houses.size() + villas.size() + holidayHomes.size();
        return totalCount == 0 ? 0 : totalArea / totalCount;
    }

    // Belirtilen oda ve oturma odası sayısına göre evleri filtreler.
    public List<House> filterHousesByRoomsAndLivingRooms(List<House> houses, int roomCount, int livingRoomCount) {
        return houses.stream()
                .filter(h -> h.getNumberOfRooms() == roomCount && h.getNumberOfLivingRooms() == livingRoomCount)
                .collect(Collectors.toList());
    }
}