package Builder.browserOptions.builder;

public class BrowserOptionsBuilder implements AbstractBuilder {
    private String browserName;
    private boolean headless;
    private boolean acceptCookies;
    private boolean enableJavascript;
    private boolean disablePopups;
    private boolean maximizeWindow;

    public BrowserOptionsBuilder() {
        this.browserName = "N/A";
        this.headless = false;
        this.acceptCookies = false;
        this.enableJavascript = false;
        this.disablePopups = false;
        this.maximizeWindow = false;
    }

    public BrowserOptionsBuilder setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }

    public BrowserOptionsBuilder setHeadless(boolean headless) {
        this.headless = headless;
        return this;
    }

    public BrowserOptionsBuilder setAcceptCookies(boolean acceptCookies) {
        this.acceptCookies = acceptCookies;
        return this;
    }

    public BrowserOptionsBuilder setEnableJavascript(boolean enableJavascript) {
        this.enableJavascript = enableJavascript;
        return this;
    }

    public BrowserOptionsBuilder setDisablePopups(boolean disablePopups) {
        this.disablePopups = disablePopups;
        return this;
    }

    public BrowserOptionsBuilder setMaximizeWindow(boolean maximizeWindow) {
        this.maximizeWindow = maximizeWindow;
        return this;
    }

    @Override
    public BrowserOptions build(String browserName) {
        BrowserOptions browserOptions = new BrowserOptions(browserName, this.headless,
                this.acceptCookies, this.enableJavascript, this.disablePopups,
                this.maximizeWindow);
        return browserOptions;
    }
}
