package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        // Classic
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000012"));
        System.out.println(isPhoneNumberValid("0700000001212"));


        // Predicate
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000012"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000001212"));

        // Predicate Chain
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("07000000003"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("09000000012"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumberThree).test("07000000012312"));

    }

    // Classic
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }


    // Predicate
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;


    static Predicate<String> containsNumberThree = phoneNumber ->
            phoneNumber.contains("3");
}


