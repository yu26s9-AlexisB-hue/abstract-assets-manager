package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(){
        ArrayList<Asset> myAssets = new ArrayList<>();
        myAssets.add(new House("Renovated House","1989",37000.76,"123 Marget LN", 1, 2140, 43560));
        myAssets.add(new Vehicle("New car", "2025",50000,"GT Ford Mustang",2025,20000));
        myAssets.add(new House("Luxury Home", "2018", 425000.50, "742 Evergreen Terrace", 2, 3200, 50000));
        myAssets.add(new House("Beach Cottage", "2005", 215000.75, "88 Ocean Drive", 1, 1850, 30000));
        myAssets.add(new House("Country Farmhouse", "1997", 315500.00, "450 Country Rd", 3, 4100, 120000));
        myAssets.add(new House("Downtown Condo", "2021", 289999.99, "12 City Plaza", 1, 1400, 5000));
        myAssets.add(new House("Mountain Cabin", "2012", 198750.25, "77 Pine Trail", 2, 2100, 80000));
        myAssets.add(new Vehicle("Used Truck", "2016", 18500, "Chevrolet Silverado", 2016, 125000));
        myAssets.add(new Vehicle("Sports Car", "2024", 72000, "Chevrolet Corvette", 2024, 8500));
        myAssets.add(new Vehicle("Family SUV", "2020", 34000, "Toyota Highlander", 2020, 45000));
        myAssets.add(new Vehicle("Compact Sedan", "2019", 22000, "Honda Accord", 2019, 67000));
        myAssets.add(new Vehicle("Electric Vehicle", "2025", 61000, "Tesla Model 3", 2025, 3000));

        for (int i = 0; i < myAssets.size(); i++) {
            if (myAssets.get(i) instanceof House) {
                House house = (House) myAssets.get(i);
                System.out.println("House at " + house.getAddress() + " new appraised value is: " + house.getValue());
            } else if (myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets.get(i);
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel() + " Current value: " + vehicle.getValue());
            }
        }

    }
}
