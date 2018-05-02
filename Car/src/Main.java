import java.awt.Color;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Main {
 
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-mm-DD");
        Date productionDateOfMyCar = dateFormat.parse("2020-01-01");
 
        Price priceOfMyCar = new Price();
        priceOfMyCar.amount = 3_000_000;
        priceOfMyCar.currency = Currency.USD;
 
        Picture pictureOfMyCarForSale = new Picture();
        pictureOfMyCarForSale.fileName = "pic1.jpg";
        pictureOfMyCarForSale.fileExtension = PictureExtension.JPEG;
        pictureOfMyCarForSale.fileSizeInBytes = 1_000_000;
        pictureOfMyCarForSale.widthInPixels = 1024;
        pictureOfMyCarForSale.heightInPixels = 768;
 
        Picture[] myPictures = new Picture[1];
        myPictures[0] = pictureOfMyCarForSale;
 
        Date licenseValidUntil = dateFormat.parse("2018-11-01");
 
        License licenseOfMyAutoForSale = new License();
        licenseOfMyAutoForSale.vehicleLicenseValidInHungary = true;
        licenseOfMyAutoForSale.vehicleLicenseValidUntil = licenseValidUntil;
 
        Car myAutoForSale = new Car();
        myAutoForSale.brand = Brand.OPEL;
        myAutoForSale.color = Color.PINK;
        myAutoForSale.description = "első női nem dohányzó tulajdonostól, harmadik autónak használt, ajándék téligumi szett";
        myAutoForSale.driveType = WheelDrive.FOUR;
        myAutoForSale.emissionClass = EmissionClass.EURO6;
        myAutoForSale.fuelType = FuelType.HYBRID;
        myAutoForSale.handDriveType = HandDriveType.RIGHT;
        myAutoForSale.license = licenseOfMyAutoForSale;
        myAutoForSale.massInKiloGrams = 1_620;
        myAutoForSale.mileageInKiloMeters = 20_000;
        myAutoForSale.model = "Grandland X";
        myAutoForSale.numberOfDoors = 5;
        myAutoForSale.numberOfSeats = 5;
        myAutoForSale.performanceInHorsePower = 69;
        myAutoForSale.pictures = myPictures;
        myAutoForSale.price = priceOfMyCar;
        myAutoForSale.productionDate = productionDateOfMyCar;
        myAutoForSale.serviceBook = true;
        myAutoForSale.state = State.WRECKED;
        myAutoForSale.transmission = Transmission.AUTOMATIC;
        myAutoForSale.type = CarType.SUV;
    }
 
}