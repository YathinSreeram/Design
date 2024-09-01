package SmartPhone_Design;

import SmartPhone_Design.Apps.App;

import java.util.List;

public class AppManager {

    public List<App> appList;

    public AppManager(List<App> appList) {

        this.appList = appList;
    }

    public List<App> downloadApp(App app)
    {
        if(appList.contains(app))
            System.out.println("App already exists");
        else
            appList.add(app);
        return appList;
    }

    public List<App> deleteApp(App app)
    {
        if(!appList.contains(app)){
            System.out.println("No such app exists");
        }
        else {
            appList.remove(app);
        }
        return appList;
    }

    public App displayAppInfo(App app)
    {
        System.out.println(app.toString());
        return app;
    }
}
