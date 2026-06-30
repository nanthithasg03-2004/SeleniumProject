package tests;

import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;

@Listeners(AllureTestNg.class)
public class BaseTest {
}

//records pass,fail,etc and send to allure