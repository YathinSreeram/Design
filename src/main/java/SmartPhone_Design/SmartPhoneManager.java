package SmartPhone_Design;

import SmartPhone_Design.Apps.App;
import SmartPhone_Design.Features.Feature;
import SmartPhone_Design.SmartPhones.SmartPhone;
import SmartPhone_Design.SmartPhones.SmartPhoneStatus;

import java.util.List;

public class SmartPhoneManager {
    public SmartPhone smartPhone;

    public AppManager appManager ;

    public SmartPhoneManager(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
        this.appManager = new AppManager(smartPhone.appList);
    }



    public SmartPhone turnOnPhone()
    {
        smartPhone.smartPhoneStatus = SmartPhoneStatus.ON;
        return smartPhone;
    }

    public SmartPhone turnOffPhone()
    {
        smartPhone.smartPhoneStatus = SmartPhoneStatus.OFF;
        return smartPhone;
    }
    public SmartPhone addFeature(Feature feature)
    {
        smartPhone.featureList.add(feature);
        return smartPhone;
    }

    public SmartPhone removeFeature(Feature feature)
    {
        smartPhone.featureList.remove(feature);
        return smartPhone;
    }

    public List<App> downloadApp(App app)
    {
        return appManager.downloadApp(app);
    }

    public List<App> deleteApp(App app)
    {
        return appManager.deleteApp(app);
    }

    public App displayAppInfo(App app)
    {
        return appManager.displayAppInfo(app);
    }

}
