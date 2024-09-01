package SmartPhone_Design.SmartPhones;

import SmartPhone_Design.Apps.App;
import SmartPhone_Design.Features.Feature;

import java.util.ArrayList;
import java.util.List;

public abstract class SmartPhone {
    public String smartPhoneName;
    public List<App> appList;
    public List<Feature> featureList;
    public SmartPhoneStatus smartPhoneStatus;

    public SmartPhone(String smartPhoneName) {
        this.smartPhoneName = smartPhoneName;
        appList = new ArrayList<>();
        featureList = new ArrayList<>();
        smartPhoneStatus = SmartPhoneStatus.OFF;
    }

}
