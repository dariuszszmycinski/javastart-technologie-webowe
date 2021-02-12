package dasz.currencyCalc;

import java.math.BigDecimal;

public enum ExchangeType {
    EURPLN("€","zł", new BigDecimal("4.55")),
    PLNEUR("zł", "€", new BigDecimal("0.22"));

    private String baseCurrency;
    private String targetCurrency;
    private BigDecimal exchangeRate;

    ExchangeType(String baseCurrency, String targetCurrency, BigDecimal exchangeRate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }
}
