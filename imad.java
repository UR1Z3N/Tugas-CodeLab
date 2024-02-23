import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class imad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Pilih Gender (P/L): ");
        String gender = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir (yyyy-MM-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate currentDate = LocalDate.now();
        Period agePeriod = Period.between(dob, currentDate);

        String genderDisplay = "Perempuan";
        if (gender.equalsIgnoreCase("P")) {
            genderDisplay = "Laki-laki";
        }

        System.out.println("Nama: " + name);
        System.out.println("Gender: " + genderDisplay);
        System.out.println("Umur: " + agePeriod.getYears() + " Tahun " + agePeriod.getMonths() + " Bulan " + agePeriod.getDays() + " Hari");
    }
}