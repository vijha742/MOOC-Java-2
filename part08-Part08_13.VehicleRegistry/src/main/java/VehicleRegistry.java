/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author vikas
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> directory;
    
    public VehicleRegistry() {
        this.directory = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(!this.directory.containsKey(licensePlate)) {
            this.directory.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return directory.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!directory.containsKey(licensePlate)) {
            return false;
        }
        directory.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : directory.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> val2 = new ArrayList<>();
        ArrayList<String> val = new ArrayList<>(directory.values());
        for (String licensePlate : val) {
            if(!val2.contains(licensePlate)) {
                System.out.println(licensePlate);
                val2.add(licensePlate);
            }
        }
    }
}
