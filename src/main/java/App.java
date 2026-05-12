import com.pluralsight.Asset;
import com.pluralsight.House;
import com.pluralsight.Vehicle;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        //Creating an ArrayList of Asset
        ArrayList<Asset> myAsset = new ArrayList<>();

        //Instantiate 2 Houses to add to the ArrayList
        House beachHouse = new House("Beach House", "10/10/2026", 500000,"123 Meadow Dr.", 1, 2500,2);
        House lakeHouse = new House("Lake House", "05/05/2020",450000,"456 Poplar Trl.", 3, 1200, 2);

        //Instantiate 2 Vehicles to add to the ArrayList
        Vehicle motorcycle = new Vehicle("Motorcycle","04/06/2025",15000,"Toyota",2025,8000);
        Vehicle suv = new Vehicle("SUV", "05/15/2008", 13750,"Volkswagen",2010,13500);

        //Add them to the list
        myAsset.add(beachHouse);
        myAsset.add(lakeHouse);
        myAsset.add(motorcycle);
        myAsset.add(suv);

        //Loop through the ArrayList
        for(Asset asset: myAsset){
            //Find the Houses inside the Array List
            if(asset instanceof House){
                House assetHouse = (House) asset;
                System.out.println("The value of " + assetHouse.getDescription() + " is $" + assetHouse.getValue());
            }

            if(asset instanceof Vehicle){
                Vehicle assetVehicle = (Vehicle) asset;
                System.out.println("The value of " + assetVehicle.getDescription() + " is " + assetVehicle.getValue());
            }
        }







    }


}
