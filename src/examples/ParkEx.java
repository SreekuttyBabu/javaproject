package examples;

import java.util.ArrayList;

/**
 * Created by expertzlab12 on 7/4/18.
 */
public class ParkEx {

    public ParkEx(int type, int time, String id) {
        this.type = type;
        this.time = time;
        this.id = id;
    }

    int type;
    int time;
    String id;

    static void addVehicle(ParkEx p, ArrayList<ParkEx> parkings) {
        //int count=0;
        if (parkings.size() < 3) {
            parkings.add(p);
            System.out.println("added");
        } else {
            System.out.println("slot is filled");
        }
    }

    static void removeVehicle(ArrayList<ParkEx> parkings, String num) {
        for (ParkEx p : parkings) {
            if (p.id.equals(num)) {
                parkings.remove(p);
                System.out.println("removed vehicle id" + num);
                System.out.println("amount to be paid=" + p.time * 50);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ParkEx p = new ParkEx(2, 3, "101");
        ParkEx p1 = new ParkEx(2, 3, "102");
        ParkEx p2 = new ParkEx(2, 3, "103");
        ParkEx p3 = new ParkEx(2, 3, "104");
        ParkEx p11 = new ParkEx(4, 3, "401");
        ParkEx p12 = new ParkEx(4, 3, "402");
        ParkEx p13 = new ParkEx(4, 3, "403");
        ParkEx p14 = new ParkEx(4, 3, "404");
        ArrayList<ParkEx> park2 = new ArrayList<>();
        ArrayList<ParkEx> park4 = new ArrayList<>();
        //al.park.add(p);
        addVehicle(p, park2);
        addVehicle(p1, park2);
        addVehicle(p2, park2);
        addVehicle(p3, park2);
        removeVehicle(park2, "101");
        addVehicle(p11, park4);
        addVehicle(p12, park4);
        addVehicle(p13, park4);
        addVehicle(p14, park4);
        removeVehicle(park4, "403");
        addVehicle(p14, park4);
    }
}