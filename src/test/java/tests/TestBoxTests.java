package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @Test
    void dataAppearsInOutputBlockTest() {
        String name = "Bob";
        String email = "bob@gmail.com";
        String currentAddress = "Nevsky";
        String permanentAddress = "Market";

        open("https://demoqa.com/text-box");

        $(".main-header").shouldHave(text("Text Box"));

        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        $("submit").click();

        $("#output").shouldHave(text(name), text(email), text(currentAddress), text(permanentAddress));
    }

    @Test
    void testStructure() {
        // arrange | given | подготовка
        // act     | when  | действие
        // assert  | then  | проверка
    }
}
