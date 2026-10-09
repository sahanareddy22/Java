package TelecomBillingSystem;

public class LandLineSubscriber extends Subscriber {

    int noOfSTDCallMinutes;
    double costPerEachSTDMinute;

    public LandLineSubscriber(
            String subscriberName,
            long subscriberId,
            long subscriberPhoneNumber,
            String subscriberPlanName,
            int subscriberFreeCalls,
            double subscriberPackageCost,
            int subscriberExtraCallsInMinutes,
            double subscriberExtraCallCostPerMinutes,
            int noOfSTDCallMinutes,
            double costPerEachSTDMinute) {

        this.subscriberName = subscriberName;
        this.subscriberId = subscriberId;
        this.subscriberPhoneNumber = subscriberPhoneNumber;
        this.subscriberPlanName = subscriberPlanName;
        this.subscriberFreeCalls = subscriberFreeCalls;
        this.subscriberPackageCost = subscriberPackageCost;
        this.subscriberExtraCallsInMinutes = subscriberExtraCallsInMinutes;
        this.subscriberExtraCallCostPerMinutes = subscriberExtraCallCostPerMinutes;
        this.noOfSTDCallMinutes = noOfSTDCallMinutes;
        this.costPerEachSTDMinute = costPerEachSTDMinute;
    }

    @Override
    public void getSubscriberDetails() {

        System.out.println("\n========================================");
        System.out.println("      LANDLINE SUBSCRIBER DETAILS");
        System.out.println("========================================");

        super.getSubscriberDetails();

        System.out.println("STD Call Minutes       : " + noOfSTDCallMinutes);
        System.out.println("STD Cost/Minute        : Rs." + costPerEachSTDMinute);
    }

    public double calculateBill() {

        double extraCallAmount =
                subscriberExtraCallsInMinutes *
                subscriberExtraCallCostPerMinutes;

        double stdCallAmount =
                noOfSTDCallMinutes *
                costPerEachSTDMinute;

        double subtotal =
                subscriberPackageCost +
                extraCallAmount +
                stdCallAmount;

        double tax =
                subtotal * 0.10;

        double totalBill =
                subtotal + tax;

        System.out.println("\n========================================");
        System.out.println("         LANDLINE BILL");
        System.out.println("========================================");

        System.out.println("Package Cost       : Rs." + subscriberPackageCost);
        System.out.println("Extra Call Charges : Rs." + extraCallAmount);
        System.out.println("STD Call Charges   : Rs." + stdCallAmount);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal           : Rs." + subtotal);
        System.out.println("Tax (10%)          : Rs." + tax);
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BILL         : Rs." + totalBill);
        System.out.println("========================================");

        return totalBill;
    }
}