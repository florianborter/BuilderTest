package org.example;

public class Main {
    public static void main(String[] args) {
        // Using the builder to create an instance with default values
        Foo fooWithDefaults = new Foo.FooBuilder().build();

        // Output the values to verify
        System.out.println("Using Builder:");
        System.out.println("String Field: " + fooWithDefaults.getMyFooStringField());
        System.out.println("Integer Field: " + fooWithDefaults.getMyFooIntegerField());
        System.out.println("Bar String Field: " + fooWithDefaults.getMyFooBarField().getMyBarStringField());
        System.out.println("Bar Integer Field: " + fooWithDefaults.getMyFooBarField().getMyBarIntegerField());

        // Using the constructor to create an instance without default values
        Foo fooWithConstructor = new Foo("val1", 10, new Bar.BarBuilder().build());

        // Output the values to verify
        System.out.println("\nUsing Constructor:");
        System.out.println("String Field: " + fooWithConstructor.getMyFooStringField());
        System.out.println("Integer Field: " + fooWithConstructor.getMyFooIntegerField());
        System.out.println("Bar String Field: " + fooWithConstructor.getMyFooBarField().getMyBarStringField());
        System.out.println("Bar Integer Field: " + fooWithConstructor.getMyFooBarField().getMyBarIntegerField());

        // Using the builder to create an instance and override the default value
        Bar customBar = new Bar.BarBuilder().myBarStringField("customBarField").myBarIntegerField(20).build();
        Foo fooWithCustomValue = new Foo.FooBuilder().myFooStringField("customValue").myFooBarField(customBar).build();

        // Output the values to verify
        System.out.println("\nUsing Builder with Custom Value:");
        System.out.println("String Field: " + fooWithCustomValue.getMyFooStringField());
        System.out.println("Integer Field: " + fooWithCustomValue.getMyFooIntegerField());
        System.out.println("Bar String Field: " + fooWithCustomValue.getMyFooBarField().getMyBarStringField());
        System.out.println("Bar Integer Field: " + fooWithCustomValue.getMyFooBarField().getMyBarIntegerField());

    }

}