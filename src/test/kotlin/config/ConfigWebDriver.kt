package config

import com.codeborne.selenide.Configuration
import io.github.bonigarcia.wdm.FirefoxDriverManager
import org.junit.BeforeClass

open class ConfigWebDriver {
    @BeforeClass
    open fun setUp() {
        FirefoxDriverManager.getInstance().setup()
        Configuration.browser = "chrome"
        Configuration.baseUrl = "http://demo.vaadin.com/AddressBook/"
    }
}