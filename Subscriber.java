package TelecomBillingSystem;

public class Subscriber {

    String subscriberName;
    long subscriberId;
    long subscriberPhoneNumber;
    String subscriberPlanName;
    int subscriberFreeCalls;
    double subscriberPackageCost;
    int subscriberExtraCallsInMinutes;
    double subscriberExtraCallCostPerMinutes;
    double subscriberTaxOnBill;

    public void getSubscriberDetails() {
        System.out.println("Subscriber Name        : " + subscriberName);
        System.out.println("Subscriber ID          : " + subscriberId);
        System.out.println("Phone Number           : " + subscriberPhoneNumber);
        System.out.println("Plan Name              : " + subscriberPlanName);
        System.out.println("Free Calls             : " + subscriberFreeCalls + " minutes");
        System.out.println("Package Cost           : Rs." + subscriberPackageCost);
        System.out.println("Extra Call Minutes     : " + subscriberExtraCallsInMinutes);
        System.out.println("Extra Call Cost/Minute : Rs." + subscriberExtraCallCostPerMinutes);
    }
}