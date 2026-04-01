package ru.mirea;

public class CashBack {
    public float bonusPercentageSubscribed = 0.1f;
    public float bonusPercentageUnsubscribed = 0.05f;
    public int maxCashBack = 10_000;

    public int bonusCalculator(boolean ifSubscribed, int purchaseSum) {
        int cashBack;
        if (ifSubscribed) {
            cashBack = (int) (purchaseSum * bonusPercentageSubscribed);
        } else {
            cashBack = (int) (purchaseSum * bonusPercentageUnsubscribed);
        }

        if (cashBack > maxCashBack) {
            cashBack = maxCashBack;
        }
        return cashBack;
    }
}