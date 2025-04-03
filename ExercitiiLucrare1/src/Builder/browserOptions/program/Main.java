package Builder.browserOptions.program;

import Builder.browserOptions.builder.BrowserOptionsBuilder;
import Builder.browserOptions.builder.BrowserOptions;

public class Main {
    public static void main(String[] args) {
        BrowserOptionsBuilder builder = BrowserOptionsBuilder.getInstance("Mozilla");
        builder.setAcceptCookies(true).setEnableJavascript(true);
        BrowserOptions mozilla = builder.build();
        System.out.println(mozilla.toString());

        BrowserOptionsBuilder builder2 = BrowserOptionsBuilder.getInstance("Google");
        builder2.setMaximizeWindow(true);
        BrowserOptions google = builder.build();

        System.out.println(google.toString());

        //BrowserOptions nuDinFabrica = new BrowserOptions("nuDinFabrica", false,
        //false, false, false, false);

    }
}
