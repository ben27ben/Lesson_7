public class CarFactory {
    public static Drivable getcar(String carType) throws Exception {
        switch (carType){
            case "Fiat":
                return new Fiat();
            case "BMW":
                return new BMW();
            case "Porsche":
                return new Porsche();
            default:
                throw new Exception(carType + "?");
        }
    }
}
