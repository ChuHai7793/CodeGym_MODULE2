package ss9.BaiTap.CalNextDay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import static ss9.BaiTap.CalNextDay.NextDayCalculator.calNextDay;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NextDayCalculatorTest {

    private final int day,month,year; // Giá trị đầu vào
    private final LocalDate expectedOutput; // Kết quả mong đợi

    public NextDayCalculatorTest(int day, int month, int year, LocalDate expectedOutput) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1,1,2018, LocalDate.of(2018,1,2)},
                {31,1,2018, LocalDate.of(2018,2,1)},
                {30,4,2018, LocalDate.of(2018,5,1)},
                {28,2,2018, LocalDate.of(2018,3,1)},
                {29,2,2020, LocalDate.of(2020,3,1)},
                {31,12,2018, LocalDate.of(2019,1,1)},
        });
    }

    @Test
    public void testCalNextDay() {
        assertEquals(this.expectedOutput,calNextDay(this.day,this.month,this.year));
    }
}

