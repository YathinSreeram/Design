package SmartPhone_Design.Features;

public abstract class Feature {
    public String featureTitle;
    public String featureDescription;

    public Feature(String featureTitle, String featureDescription) {
        this.featureTitle = featureTitle;
        this.featureDescription = featureDescription;
    }
}
