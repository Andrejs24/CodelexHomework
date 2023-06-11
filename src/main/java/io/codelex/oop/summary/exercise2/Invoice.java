package io.codelex.oop.summary.exercise2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class Invoice {
    private List<AbstractItem> items;
    private Order order;
    private String number;

    private InvoiceStatus status;

    private BigDecimal price;

    private BigDecimal priceWithVAT;

    public Invoice(Order order, String number) {
        this.order = order;
        this.number = number;
        this.items = order.getListOfItems();
        this.status = InvoiceStatus.APPROVED;

    }


    public void send() {
        status = InvoiceStatus.SENT;
    }


    private String formatPrice(BigDecimal price) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        return decimalFormat.format(price);
    }

    private BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (AbstractItem item : items) {
            totalPrice = totalPrice.add(item.price());
        }
        return totalPrice;
    }

    private BigDecimal calculatePriceWithVAT() {
        return priceWithVAT = calculateTotalPrice().multiply(new BigDecimal(0.21));
    }

    private String invoiceTextFormatted(String line) {
        StringBuilder text = new StringBuilder();
        int maxLength = 70;
        if (line.length() < maxLength) {
            int numberOfCharacters = maxLength - (line.length() - 1);
            line = line + String.valueOf(" ").repeat(numberOfCharacters) + "=";
        }
        text.append(line).append(System.lineSeparator());
        return text.toString();
    }


    public String invoiceText() {
        StringBuilder invoiceText = new StringBuilder();
        String line = "========================================================================"; //length=51
        invoiceText.append(invoiceTextFormatted(line));
        invoiceText.append(invoiceTextFormatted("= INVOICE NUMBER: " + number));
        invoiceText.append(invoiceTextFormatted("= INVOICE STATUS: " + status));
        invoiceText.append(order.getOrderText());
        invoiceText.append(invoiceTextFormatted("= SUM: " + formatPrice(calculateTotalPrice()) + " EUR"));
        invoiceText.append(invoiceTextFormatted("= VAT (21%) : " + formatPrice(calculatePriceWithVAT()) + " EUR"));
        invoiceText.append(invoiceTextFormatted("= TOTAL: " + formatPrice(calculateTotalPrice().add(calculatePriceWithVAT())) + " EUR"));
        invoiceText.append(invoiceTextFormatted(line));
        return invoiceText.toString();
    }


}
