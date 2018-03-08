package sample;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

public class SelenideTest {

	@BeforeClass
	public static void beforeClass() {
		// Chrome(要ドライバー)
		Configuration.browser = WebDriverRunner.CHROME;
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	}

    @Test
    public void test() {

        // Googleトップページ
        // "selenide"を検索
        open("https://www.google.co.jp/");
        $("#lst-ib").val("selenide").pressEnter();

        // 検索ページ
        // Selenideの公式ページをクリック
        $(By.linkText("Selenide: concise UI tests in Java")).click();

        // Selenide公式ページ
        // 「What is Selenide?」という文言があることを確認
        $("body").shouldHave(text("What is Selenide?"));
    }

}
