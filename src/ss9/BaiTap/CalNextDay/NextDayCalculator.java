package ss9.BaiTap.CalNextDay;

import java.time.LocalDate;
import java.time.YearMonth;

public class NextDayCalculator {
    public static LocalDate calNextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
//        YearMonth yearMonth = YearMonth.of(year, month); // Create a YearMonth object
//        int daysInMonth = yearMonth.lengthOfMonth(); // Get the number of days in the month
        int daysInMonth = calculateDaysInEachMonth(month, year); // Get the number of days in the month

        if (day == daysInMonth) {
            nextDay = 1;
            nextMonth++;
            if (month == 12) {
                nextMonth = 1;
                nextYear++;
            }
        } else {
            nextDay++;
        }
        return LocalDate.of(nextYear, nextMonth, nextDay);

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int calculateDaysInEachMonth(int month, int year) {
        // Mảng lưu số ngày cho từng tháng (tháng 2 có 28 ngày mặc định)
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Nếu là năm nhuận, tháng 2 sẽ có 29 ngày
        if (isLeapYear(year)) {
            daysInMonths[1] = 29; // Tháng 2 có chỉ số là 1 (thứ tự mảng bắt đầu từ 0)
        }
        return daysInMonths[month - 1];
    }
}
