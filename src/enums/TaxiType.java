package enums;

import java.math.BigDecimal;

public enum TaxiType {
    STANDARD(new BigDecimal(20), new BigDecimal(40)),
    COMFORT(new BigDecimal(40), new BigDecimal(50)),
    BUSINESS(new BigDecimal(60), new BigDecimal(70));
    private BigDecimal pricePerKm;
    private BigDecimal priceForLanding;

    TaxiType(BigDecimal pricePerKm, BigDecimal priceForLanding) {
        this.pricePerKm = pricePerKm;
        this.priceForLanding = priceForLanding;
    }
}
