package Builder.browserOptions.program;

import Builder.browserOptions.builder.BrowserOptionsBuilder;
import Builder.browserOptions.builder.BrowserOptions;

public class Main {
    public static void main(String[] args) {
        BrowserOptionsBuilder builder = new BrowserOptionsBuilder();
        builder.setAcceptCookies(true).setEnableJavascript(true);
        BrowserOptions mozilla = builder.build("Mozilla");
        System.out.println(mozilla.toString());

        //BrowserOptions nuDinFabrica = new BrowserOptions("nuDinFabrica", false,
                //false, false, false, false);

    }
}
