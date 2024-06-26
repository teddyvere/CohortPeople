package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {

        //String student_source = "students.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        //List listOfStudents = programObject.loadCSVFile(LoadCSVFile(student_source));
        List listOfStudents = programObject.handWrittenLoadOfData();



        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());

//    //private List loadCSVFile(String student_source) {
//        ArrayList<Person> records = new ArrayList<>();
//
//        //InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);
//
//        try (Scanner scanner = new Scanner(inputStream)) {
//            while (scanner.hasNextLine()) {
//                records.add(this.getRecordFromLine(scanner.nextLine()));
//            }
//        } catch (Exception e) {
//            System.out.println("File NOT FOUND.");
//            e.printStackTrace();
//        }
//        return records;
//    }



//        // changed line to list
//        // changed line.split to List
//        //...to here. Paste below the `getRecordFromLine()` method in Main.java
//         Person getRecordFromLine(String List){
//            // take the String of lastname,firstname and create a new Person object with it.
//            String[] values = List.split;
//            String commaDelimiter = Main.COMMA_DELIMITER;
//            //Person newPerson = new Person(values[0], values[1], values[2], values[3], values[4], values[5]);
//            //return newPerson;
//            return null;
        }


     }
    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson1 = new Person("Teddy", "Archibald");
        newPerson1.setBeverage("Half&Half");
        newPerson1.setColor("Latte");
        newPerson1.setbirthmonth("March");
        newPerson1.setPets(false);
        students.add(newPerson1);

        Person newPerson2 = new Person("Peter", "VanBeever");
        newPerson2.setBeverage("Latte");
        newPerson2.setColor("Purple");
        newPerson2.setbirthmonth("Feburary");
        newPerson2.setPets(true);
        students.add(newPerson2);

        Person newPerson3 = new Person("Tim", "Linkous");
        newPerson3.setBeverage("Water");
        newPerson3.setColor("Green");
        newPerson3.setbirthmonth("September");
        newPerson3.setPets(false);
        students.add(newPerson3);

        Person newPerson4 = new Person("Qian", "Wang");
        newPerson4.setBeverage("Water");
        newPerson4.setColor("Blue");
        newPerson4.setbirthmonth("October");
        newPerson4.setPets(false);
        students.add(newPerson4);

        Person newPerson5 = new Person("Diptika", "Devi");
        newPerson5.setBeverage("June");
        newPerson5.setColor("Orange");
        newPerson5.setbirthmonth("June");
        newPerson5.setPets(false);
        students.add(newPerson5);



















        // and so on for EACH person in the cohort.

        return students;
    }

}

