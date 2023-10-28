package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.font.ImageGraphicAttribute;
import java.io.File;

import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {

        open("/automation-practice-form");
        $("#firstName").setValue("Alexander");
        $("#lastName").setValue("Drozenko");
        $("#userEmail").setValue("drozenko21@gmail.com");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("0506488515");

        //$("#dateOfBirthInput").byValue("21 Sep 1993");
        //$("#dateOfBirthInput").click();
        //$(".react-datepicker__year-select").click();
        //$(byValue("1993")).click();
        //$(".react-datepicker__month-select").selectOption("September");
       // $("[aria-label='Choose Friday, September 24th, 1999' ]").click();

        $("#subjectsInput").val("Arts").pressEnter();
        $("#subjectsInput").val("History").pressEnter();

        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-2']").click();
        $("[for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFromClasspath("IMG_0063.JPG");

        $("#currentAddress").setValue("Discovery gardens.");                                   // Заполнение поля Current Address
        $("#react-select-3-input").val("Uttar Pradesh").pressEnter();                        // Выбор страны
        $("#react-select-4-input").val("Merrut").pressEnter();

        $("#submit").pressEnter();

    }

}
//$("#dateOfBirthInput").setValue("21 Sep 1993");
//$(".react-datepicker__year-select").click();
// $(byValue("21 sep 1993")).click();
// $(".react-datepicker__month-select").selectOption("September");
// $("[aria-label='Choose Tuesday, September 21th, 1993']").click();