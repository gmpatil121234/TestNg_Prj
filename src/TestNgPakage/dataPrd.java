package TestNgPakage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataPrd {
	@DataProvider(name = "Login")
    public Object[][] getDataforLogin() {
        // Multidimensional Object
        // 3X3 or 4X3 or 4X5
        return new Object[][] {

 

                {"Admin", "admin123" },
                {"kumar", "admin123" },
                {"dixit", "admin123" }
                };

 

    }
}
