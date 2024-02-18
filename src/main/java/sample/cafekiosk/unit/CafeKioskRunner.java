package sample.cafekiosk.unit;

import lombok.extern.slf4j.Slf4j;
import sample.cafekiosk.unit.beverage.Americano;
import sample.cafekiosk.unit.beverage.Latte;

@Slf4j
public class CafeKioskRunner {
    public static void main(String[] args) {
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());
        log.info(">>> Add Americano");

        cafeKiosk.add(new Latte());
        log.info(">>> Add Latte");

        int calculateTotalPrice = cafeKiosk.calculateTotalPrice();
        log.info(">>> Total Price = {}", calculateTotalPrice);
    }
}
