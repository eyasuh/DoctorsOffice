public class DoctorsOffice {
    public static void main(String[] args) {

        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numVisits = 5;
        int copayAmount = 4;
        String appDate = "monday";
        long contactNumber = 2021112222;


        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temprature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Patient's copay amount: $" + copayAmount);
        System.out.println("Appointment date: " + appDate);
        System.out.println("Contact number: " + contactNumber);
    }
}
