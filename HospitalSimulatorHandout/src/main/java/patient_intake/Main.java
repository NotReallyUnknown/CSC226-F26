package patient_intake;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      String filePath = "src/main/java/patient_intake/patients.csv";
      PatientRegistry patients = new PatientRegistry();

      try (Scanner fileReader = new Scanner(new File(filePath))) {
         if (fileReader.hasNextLine()) {
            fileReader.nextLine(); // Skip the CSV header.
         }

         while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(",");

            // TODO REQUIRED: Parse the fields from parts.
            String patientID = parts[0];
            String fullName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String chiefComplaint = parts[3];
            int triagelevel = Integer.parseInt(parts[4]);
            String currentStage = parts[5];
            String assignedRoom = parts[6];
            int arrivalHour = Integer.parseInt(parts[7]);
            String insuranceID = parts[8];
            // TODO REQUIRED: Split the full name into firstName and lastName.

            String name[] = fullName.split(" ");
            String firstName = name[1];
            String lastName = name[2];
            
            // TODO REQUIRED: Create a Patient and add it to patients.
            
         }

         // TODO REQUIRED: Display the completed registry.
      } catch (FileNotFoundException exception) {
         // TODO REQUIRED: Report a missing input file.
      }
   }
}
