/* 1.1 Individual Assignment

Develop two classes according to individual assignment. The first class should contain reference to an array of second class type. Classes must contain constructors, private fields, access methods (getters and setters), as well as methods needed for implementation of an individual assignment.

Each class should be separately tested. The main() function of the first class should contain creation of necessary object and invocation of methods implementing an individual assignment. Results should be shown on console window.

Particular function is given in the individual task according to your own index in the group students list (index of variant).

6, 22 	Conference 	Title, _place 	Session 	Date, topic, count of members 	Average count of members, session with the maximum count of members, length of title
*/

import utils.CommandLineTable;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;
import java.util.Date;

public class lab1_1 extends CommandLineTable {

    private static String _title, _place;
    private static CommandLineTable st;
    private static String[] conference;
    private static lab1_1_2 conf;
    private static Scanner scan;

    public static void main(String[] args) {
        methodCleaner();
    }

    private static void methodCleaner() {
        utils();
        setTitle();
        setPlace();
        conf.setTopic();
        conf.setDate();
        conf.setCountOfMembers();
        commandTable();
    }

    private static void utils() {
        scan = new Scanner(System.in);
        st = new CommandLineTable();
        conf = new lab1_1_2();
    }

    private static void commandTable() {
        st.setShowVerticalLines(true);
        st.setHeaders("Title", "Place", "Date", "Topic", "Count of Members", "Title Length");
        st.addRow(_title, _place, String.valueOf(conf.getDate()), conf.getTopic(), String.valueOf(conf.getCountOfMembers()), Integer.toString(getTitleLength()));
        st.print();
    }

    private static String setPlace() {
        System.out.println("Please Enter Conference Place : ");
        _place = scan.nextLine();
        return _title;
    }

    private static String setTitle() {
        System.out.println("Please Enter Conference Title : ");
        _title = scan.nextLine();
        return _title;
    }

    private static int getTitleLength() {
        int length = _title.length();
        return length;
    }

}

class lab1_1_2 {

    private Logger logger = Logger.getAnonymousLogger();
    private Scanner scan = new Scanner(System.in);
    private String _dd, _mm, _yy, topic;
    private int countOfMembers;
    private char _type;

    public void setCountOfMembers(){
        System.out.println("Please Enter Count of Members : ");
        countOfMembers = scan.nextInt();
    }

    public int getCountOfMembers() {
        return countOfMembers;
    }

    public void setTopic(){
        System.out.println("Please Enter Conference Topic : ");
        topic = scan.nextLine();
    }

    public String getTopic() {
        return topic;
    }

    public void setDate() {
        System.out.println("Please enter date");
        System.out.println("Day :");
        _dd = scan.nextLine();
        _dd = _dd + "-";
        System.out.println("Month :");
        _mm = scan.nextLine();
        _mm = _mm + "-";
        System.out.println("Year :");
        _yy = scan.nextLine();

        System.out.println("Please enter date type [1|2|3|4]");
        System.out.println("dd/MM/yyyy | mm/DD/yyyy | yyyy/MM/dd | yyyy/DD/mm ");

        try {
            _type = (char) System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Date getDate() {

        String date = _dd + _mm + _yy, dateType = "dd-MM-yyyy";
        SimpleDateFormat _date = null;
        Date _dateBy = null;
        switch (_type) {
            case '1':
                dateType = "dd-MM-yyyy";
                break;
            case '2':
                dateType = "mm-DD-yyyy";
                break;
            case '3':
                dateType = "yyyy-MM-dd";
                break;
            case '4':
                dateType = "yyyy-DD-mm";
                break;
        }
        try {
            _date = new SimpleDateFormat(dateType);
            _dateBy = _date.parse(date);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "an exception was thrown", e);
        }

        return _dateBy;
    }

}