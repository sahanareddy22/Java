package TelecomBillingSystem;

public class MobileSubscriber extends Subscriber {

    int roamingNoOfMinutes;
    double roamingCostPerMinute;

    public MobileSubscriber(
            String subscriberName,
            long subscriberId,
            long subscriberPhoneNumber,
            String subscriberPlanName,
            int subscriberFreeCalls,
            double subscriberPackageCost,
            int subscriberExtraCallsInMinutes,
            double subscriberExtraCallCostPerMinutes,
            int roamingNoOfMinutes,
            double roamingCostPerMinute) {

        this.subscriberName = subscriberName;
        this.subscriberId = subscriberId;
        this.subscriberPhoneNumber = subscriberPhoneNumber;
        this.subscriberPlanName = subscriberPlanName;
        this.subscriberFreeCalls = subscriberFreeCalls;
        this.subscriberPackageCost = subscriberPackageCost;
        this.subscriberExtraCallsInMinutes = subscriberExtraCallsInMinutes;
        this.subscriberExtraCallCostPerMinutes = subscriberExtraCallCostPerMinutes;
        this.roamingNoOfMinutes = roamingNoOfMinutes;
        this.roamingCostPerMinute = roamingCostPerMinute;
    }

    @Override
    public void getSubscriberDetails() {

        System.out.println("\n========================================");
        System.out.println("       MOBILE SUBSCRIBER DETAILS");
        System.out.println("========================================");

        super.getSubscriberDetails();

        System.out.println("Roaming Minutes        : " + roamingNoOfMinutes);
        System.out.println("Roaming Cost/Minute    : Rs." + roamingCostPerMinute);
    }

    public double calculateBill() {

        double extraCallAmount =
                subscriberExtraCallsInMinutes *
                subscriberExtraCallCostPerMinutes;

        double roamingAmount =
                roamingNoOfMinutes *
                roamingCostPerMinute;

        double subtotal =
                subscriberPackageCost +
                extraCallAmount +
                roamingAmount;

        double tax =
                subtotal * 0.10;

        double totalBill =
                subtotal + tax;

        System.out.println("\n========================================");
        System.out.println("          MOBILE BILL");
        System.out.println("========================================");

        System.out.println("Package Cost       : Rs." + subscriberPackageCost);
        System.out.println("Extra Call Charges : Rs." + extraCallAmount);
        System.out.println("Roaming Charges    : Rs." + roamingAmount);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal           : Rs." + subtotal);
        System.out.println("Tax (10%)          : Rs." + tax);
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BILL         : Rs." + totalBill);
        System.out.println("========================================");

        return totalBill;
    }
}