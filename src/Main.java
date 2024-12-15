public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = GetVehicleObject.getVehicleObject("car");
        Vehicle vehicle2 = GetVehicleObject.getVehicleObject("truck");

        System.out.println(vehicle1.getBrand());
        System.out.println(vehicle2.getBrand());

    }
}