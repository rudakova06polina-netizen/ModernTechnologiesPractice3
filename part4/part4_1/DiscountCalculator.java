package part4.part4_1;

public class DiscountCalculator {

    public static double calculateDiscount(double price, String customerType) {
        // TODO: реализуйте скидку по типу клиента.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (customerType.equals("vip")) return price * 0.20;
        if (customerType.equals("regular")) return price * 0.10;
        if (customerType.equals("new")) return price * 0.05;
        return 0.0;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int purchaseCount) {
        // TODO: реализуйте скидку по количеству покупок.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (purchaseCount >= 100) return price * 0.25;
        if (purchaseCount >= 50) return price * 0.20;
        if (purchaseCount >= 20) return price * 0.15;
        if (purchaseCount >= 10) return price * 0.10;
        if (purchaseCount >= 5) return price * 0.05;
        return 0.0;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        // TODO: реализуйте скидку по промокоду + бонус за первый заказ.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0.0;
        if (promoCode.equals("SAVE20")) discount = 0.20;
        if (promoCode.equals("SAVE10")) discount = 0.10;
        if (promoCode.equals("SAVE5")) discount = 0.05;
        if (isFirstOrder) discount = discount + 0.05;
        if (discount > 0.30) discount = 0.30;
        return price * discount;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int age, String season) {
        // TODO: четвертая перегрузка (пример: возраст + сезон).
        // Подсказка: ограничьте максимальную скидку 50% от price.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0.0;
        if (age >= 60) discount = 0.25;
        if (age <= 18) discount = 0.15;
        if (season.equals("winter")) discount = discount + 0.15;
        if (season.equals("summer")) discount = discount + 0.18;
        if (discount > 0.50) discount = 0.50;
        return price * discount;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}
