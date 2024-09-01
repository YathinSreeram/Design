package Tests;

import SmartPhone_Design.*;
import SmartPhone_Design.Apps.Amazon;
import SmartPhone_Design.Apps.App;
import SmartPhone_Design.Apps.Netflix;
import SmartPhone_Design.Features.CameraFeatures;
import SmartPhone_Design.Features.Feature;
import SmartPhone_Design.Features.ProcessorFeatures;
import SmartPhone_Design.SmartPhones.Iphone;
import SmartPhone_Design.SmartPhones.SmartPhone;
import SmartPhone_Design.SmartPhones.SmartPhoneStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartPhoneTests {

    public SmartPhoneManager smartPhoneManager;
//    public AppManager appManager;
    public App netflix;
    public App amazon;

    public SmartPhone iphone;

    public Feature processor;
    public CameraFeatures cameraFeatures;

    @BeforeEach
    public void SetUp()
    {
        iphone = new Iphone("Iphone 15 pro");
        processor = new ProcessorFeatures("Processor Features", "Has a A13 bionic chip, with 8 cores, the fastest chip");
        cameraFeatures = new CameraFeatures("Camera features", "Has 3 cameras , can get you the best picture quality");

        netflix = new Netflix("Netflix", "Ocean of Movies", 2.3d);
        amazon = new Amazon("Amazon", "World's biggest market place", 1.2d);


        iphone = new Iphone("Iphone 15 pro");
        smartPhoneManager = new SmartPhoneManager(iphone);
    }

    @Test
    public void turnOnPhoneTest()
    {
        assertEquals(SmartPhoneStatus.ON, smartPhoneManager.turnOnPhone().smartPhoneStatus);
    }

    @Test
    public void turnOffPhoneTest()
    {
        assertEquals(SmartPhoneStatus.OFF, smartPhoneManager.turnOffPhone().smartPhoneStatus);
    }

    @Test
    public void addFeatureTest()
    {
        assertEquals(1, smartPhoneManager.addFeature(processor).featureList.size());
    }

    @Test
    public void removeFeatureTest()
    {
        iphone.featureList.add(processor);
        assertEquals(0, smartPhoneManager.removeFeature(processor).featureList.size());
    }

    @Test
    public void downloadAppTest()
    {
        assertEquals(1, smartPhoneManager.downloadApp(netflix).size());
    }

    @Test
    public void deleteApp()
    {
        iphone.appList.add(netflix);
        assertEquals(0, smartPhoneManager.deleteApp(netflix).size());
    }

}
