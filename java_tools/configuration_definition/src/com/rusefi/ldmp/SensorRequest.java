package com.rusefi.ldmp;

import java.util.Objects;

import static com.rusefi.ConfigDefinition.EOL;

public class SensorRequest extends Request {
    private final String value;

    public SensorRequest(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SensorRequest{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorRequest that = (SensorRequest) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String getJavaCode() {
        return "/*sens*/" + EOL;
    }
}