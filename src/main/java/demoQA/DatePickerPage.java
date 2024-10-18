package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DatePickerPage extends WidgesPage{


    private By idDatePacker= By.id("datePickerMonthYearInput");

    private By month=By.className("react-datepicker__month-select");
    private By year=By.className("react-datepicker__year-select");

    private By datevalue(String day){  /// este metodo privado lo uso para obtener cualquier dia del panel d la fecha

        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");

    }


    public void selectFieldDate(){

        ClicByElement(idDatePacker);
    }

    public String getDate(){

        return Find(idDatePacker).getAttribute("value");
    }

    public void selectMonth(String textMonth){
        Select mesesSelect=new Select(Find(month));

        mesesSelect.selectByVisibleText(textMonth);
    }

    public void selectYears(String textYear){
        Select anoSelect=new Select(Find(year));

       anoSelect.selectByVisibleText(textYear);
    }

    public void SelectDays(String day){

        ClicByElement(datevalue(day));
    }
    public boolean isDayExist(String day){

        return Find(datevalue(day)).isDisplayed();
    }
}
