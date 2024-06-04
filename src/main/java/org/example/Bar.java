package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(builderClassName = "BarBuilder")
public class Bar {
    private String myBarStringField;
    private Integer myBarIntegerField;

    public static class BarBuilder {
        private String myBarStringField = "defaultBarString"; // Default value for the builder
        private Integer myBarIntegerField = -1; // Default value for the builder
    }
}
