package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(builderClassName = "FooBuilder")
public class Foo {
    private String myFooStringField;
    private Integer myFooIntegerField;
    private Bar myFooBarField;

    public static class FooBuilder {
        private String myFooStringField = "defaultFooString"; // Default value for the builder
        private Integer myFooIntegerField = -1; // Default value for the builder
        private Bar myFooBarField = new Bar.BarBuilder().build();
    }
}
