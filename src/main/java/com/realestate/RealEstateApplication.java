package com.realestate;

import com.realestate.model.*;
import com.realestate.service.HouseService;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RealEstateApplication {
    public static void main(String[] args) {
        // Evlerin bir listesini oluşturur.
        List<House> houses = Arrays.asList(
                new House("House1", 150000, 120, 3, 1),
                new House("House2", 180000, 150, 4, 2),
                new House("House3", 200000, 180, 5, 3)
        );

        // Villaların bir listesini oluşturur.
        List<Villa> villas = Arrays.asList(
                new Villa("Villa1", 300000, 250, 4, 2),
                new Villa("Villa2", 350000, 300, 5, 3),
                new Villa("Villa3", 400000, 350, 6, 4)
        );

        // Tatil evlerinin bir listesini oluşturur.
        List<HolidayHome> holidayHomes = Arrays.asList(
                new HolidayHome("HolidayHome1", 100000, 80, 2, 1),
                new HolidayHome("HolidayHome2", 120000, 100, 3, 1),
                new HolidayHome("HolidayHome3", 150000, 120, 3, 2)
        );

        // HouseService sınıfından bir servis nesnesi oluşturur.
        HouseService service = new HouseService();

        // Evlerin toplam fiyatını hesaplar ve ekrana yazdırır.
        System.out.println("Total house price: " + service.getTotalPriceForHouses(houses));

        // Villaların toplam fiyatını hesaplar ve ekrana yazdırır.
        System.out.println("Total villa price: " + service.getTotalPriceForVillas(villas));

        // Tatil evlerinin toplam fiyatını hesaplar ve ekrana yazdırır.
        System.out.println("Total holiday home price: " + service.getTotalPriceForHolidayHomes(holidayHomes));

        // Tüm mülklerin toplam fiyatını hesaplar ve ekrana yazdırır.
        System.out.println("Total all properties price: " + service.getTotalPriceForAllHouses(houses, villas, holidayHomes));

        // Evlerin ortalama alanını hesaplar ve ekrana yazdırır.
        System.out.println("Average house area: " + service.getAverageAreaForHouses(houses));

        // Villaların ortalama alanını hesaplar ve ekrana yazdırır.
        System.out.println("Average villa area: " + service.getAverageAreaForVillas(villas));

        // Tatil evlerinin ortalama alanını hesaplar ve ekrana yazdırır.
        System.out.println("Average holiday home area: " + service.getAverageAreaForHolidayHomes(holidayHomes));

        // Tüm mülklerin ortalama alanını hesaplar ve ekrana yazdırır.
        System.out.println("Average all properties area: " + service.getAverageAreaForAllHouses(houses, villas, holidayHomes));

        // 3 odalı ve 1 oturma odalı evleri filtreler ve ekrana yazdırır.
        System.out.println("Filtered houses with 3 rooms and 1 living room:");
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(houses); // Evleri listeye ekler.
        allHouses.addAll(villas); // Villaları listeye ekler.
        allHouses.addAll(holidayHomes); // Tatil evlerini listeye ekler.

        // Filtreleme işlemini gerçekleştirir ve sonuçları ekrana yazdırır.
        service.filterHousesByRoomsAndLivingRooms(allHouses, 3, 1)
                .forEach(System.out::println);
    }
}