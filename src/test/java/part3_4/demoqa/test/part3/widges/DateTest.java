package part3_4.demoqa.test.part3.widges;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;


public class DateTest extends BaseTest {

    @Test
    public void testSelectedDate() throws InterruptedException {

        String month="December";
        String monthNumber="12";
        String years="2022";
        String day="25";

        var datePicker=homepage.goWidgesPage().toGoDatePicker();

        Thread.sleep(2000);
        datePicker.selectFieldDate();
        datePicker.selectMonth(month);
        datePicker.selectYears(years);

       if( datePicker.isDayExist(day)) {
           datePicker.SelectDays(day);
       }

       String actualDay=datePicker.getDate();
       String fechaeXpect=monthNumber + "/"+ day + "/"+ years;

        Assert.assertEquals(actualDay,fechaeXpect,"no es la misma fecha" + actualDay + " y se espera la fecha " + fechaeXpect + "");

    }
}
