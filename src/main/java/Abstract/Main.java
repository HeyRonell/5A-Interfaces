package Abstract;

public class Main {
    abstract static class RentalVehicle {
        private String registrationPlate;
        private double pricePerDay;

        public RentalVehicle(String registrationPlate, double pricePerDay) {
            this.registrationPlate = registrationPlate;
            this.pricePerDay = pricePerDay;
        }

        public String getRegistrationPlate() {
            return registrationPlate;
        }

        public double getPricePerDay() {
            return pricePerDay;
        }

        public void printQuote() {
            System.out.println(getCategory() + " " + registrationPlate
                    + " rents for $" + pricePerDay + " per day.");
        }

        public abstract String getCategory();
    }

    static class CompactCar extends RentalVehicle {
        public CompactCar(String registrationPlate, double pricePerDay) {
            super(registrationPlate, pricePerDay);
        }

        @Override // conventionally correct when we polymorph a method
        public String getCategory() {
            return "Compact car";
        }
    }

    static class CargoVan extends RentalVehicle {
        public CargoVan(String registrationPlate, double pricePerDay) {
            super(registrationPlate, pricePerDay);
        }

        @Override
        public String getCategory() {
            return "Cargo van";
        }
    }

    static class ElectricCar extends RentalVehicle {
        private int rangeKm; // declaring new data type for this one specifically.

        public ElectricCar(String registrationPlate, double pricePerDay, int rangeKm) {
            super(registrationPlate, pricePerDay);
            this.rangeKm = rangeKm; // setting this here so that it'll read
        }

        @Override
        public String getCategory() {
            return "Electric car (" + rangeKm + " km)";
        }
    }

    public static void main(String[] args) {
        RentalVehicle[] fleet = {
                new CompactCar("CAR-204", 42.0),
                new CargoVan("VAN-518", 64.0),
                new ElectricCar("ELE-600", 59.0, 410)
        };

        for (RentalVehicle vehicle : fleet) {
            vehicle.printQuote();
        }
    }
}