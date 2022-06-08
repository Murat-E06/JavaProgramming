package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        /*
        Browser names: chrome, firefox, opera, safari, edge
        only one print stat.
        use nested if
         */
        String browserName = "opera";
        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "safari"
                || browserName == "edge" || browserName == "opera";
        if (validBrowser) {
            if (browserName == "chrome") {
                result = "chrome browser is selected";
            } else if (browserName == "firefox") {
                result = "firefox browser is selected";
            } else if (browserName == "safari") {
                result = "safari browser is selected";
            } else if (browserName == "opera") {
                result = "opera browser is selected";
            } else {
                result = "opera browser is selected";
            }

        } else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);



    }
}

