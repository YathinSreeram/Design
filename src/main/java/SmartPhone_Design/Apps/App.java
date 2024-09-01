package SmartPhone_Design.Apps;

public abstract class App {
    public String appName;
    public String appDescription;
    public double appSizeInGb;

    public App(String appName, String appDescription, double appSizeInGb) {
        this.appName = appName;
        this.appDescription = appDescription;
        this.appSizeInGb = appSizeInGb;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", appDescription='" + appDescription + '\'' +
                ", appSizeInGb=" + appSizeInGb +
                '}';
    }
}
