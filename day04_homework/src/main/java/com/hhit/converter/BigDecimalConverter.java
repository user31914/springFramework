package com.hhit.converter;

import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

public class BigDecimalConverter implements Converter<String, BigDecimal> {
    @Override
    public BigDecimal convert(String source) {
        double d = Double.parseDouble(source);
        BigDecimal bigDecimal = BigDecimal.valueOf(d);
        return bigDecimal;
    }
}
