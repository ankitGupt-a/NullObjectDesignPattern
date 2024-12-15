public class GetVehicleObject {

    public static Vehicle getVehicleObject(String vehicleType) {
        if ("car".equals(vehicleType)) {
            return new CarVehicle();
        } else {
            return new NullVehicle();
        }
    }
}
