package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        // Classic
        System.out.println(getDBConnectionUrl());

        // Supplier
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlSupplierList.get());
    }

    // Classic
    static String getDBConnectionUrl(){
        return "JDBC://localhost:5432/users";
    }

    // Supplier
    static Supplier<String> getDBConnectionUrlSupplier = () -> "JDBC://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionUrlSupplierList = () -> List.of(
            "JDBC://localhost:5432/users",
            "JDBC://localhost:5432/customers",
            "JDBC://localhost:5432/products"
    );
}
