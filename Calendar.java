public class Calendar {
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
    public static void main(String args[]) {
		int inputYear = Integer.parseInt(args[0]);
        while (year < inputYear) {
            advance();
        }
        while (year == inputYear) {
			if (dayOfWeek == 1) {
				System.out.print(dayOfMonth + "/" + month + "/ " + year);	
                System.out.println(" Sunday");
            } 
            else{
				System.out.println(dayOfMonth + "/" + month + "/ " + year);	
			}
	 		advance();
        }
}
private static void advance() {
    if (dayOfWeek == 7) {
        dayOfWeek = 1;
    }
    else{
        dayOfWeek += 1;
    }

    if (dayOfMonth == nDaysInMonth) {
        if (month == 12) {
            year += 1;
            month = 1;
        }
        else{
            month += 1;
        }
        dayOfMonth = 1;
        nDaysInMonth = nDaysInMonth(month, year);
    }
    else{
        dayOfMonth += 1;
    }
 } 
     
// Returns true if the given year is a leap year, false otherwise.
public static boolean isLeapYear(int year) {
    if (year % 100 == 0){
        if (year % 400 == 0) {
           return true; 
        }
    }
    else if(year % 4 == 0){
        return true;
    }
    return false;
}
 
// Returns the number of days in the given month and year.
// April, June, September, and November have 30 days each.
// February has 28 days in a common year, and 29 days in a leap year.
// All the other months have 31 days.
public static int nDaysInMonth(int month, int year) {
    int daysOfMonth = 0;
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            daysOfMonth = 31;
            break;
    
        case 4:
        case 6:
        case 9:
        case 11:
            daysOfMonth = 30;
            break;

        case 2:
            if (isLeapYear(year)){
                daysOfMonth = 29;
                break;
            }
            daysOfMonth = 28;
            break;
    }
    return daysOfMonth;
}
}
