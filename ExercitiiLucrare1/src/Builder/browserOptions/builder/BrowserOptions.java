package Builder.browserOptions.builder;

public class BrowserOptions {

    private String numeBrowser;
    private boolean headless;
    private boolean acceptCookies;
    private boolean enableJavascript;
    private boolean disablePopups;
    private boolean maximizeWindow;

    protected BrowserOptions(String numeBrowser, boolean headless, boolean acceptCookies, boolean enableJavascript, boolean disablePopups, boolean maximizeWindow) {
        this.numeBrowser = numeBrowser;
        this.headless = headless;
        this.acceptCookies = acceptCookies;
        this.enableJavascript = enableJavascript;
        this.disablePopups = disablePopups;
        this.maximizeWindow = maximizeWindow;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BrowserOptions{");
        sb.append("numeBrowser='").append(numeBrowser).append('\'');
        sb.append(", headless=").append(headless);
        sb.append(", acceptCookies=").append(acceptCookies);
        sb.append(", enableJavascript=").append(enableJavascript);
        sb.append(", disablePopups=").append(disablePopups);
        sb.append(", maximizeWindow=").append(maximizeWindow);
        sb.append('}');
        return sb.toString();
    }
}
