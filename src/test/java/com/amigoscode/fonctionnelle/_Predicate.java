package com.amigoscode.fonctionnelle;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("******validation with normal writing****");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("****** **With predicate ***** *");
        //use test to run predicate
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println("***** combine group of predicates *******");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07009877300"));

    }

    static boolean isPhoneNumberValid(String phone) {
        return phone.startsWith("07") && phone.length() == 11;
    }
    static Predicate<String>  isPhoneNumberValidPredicate= s ->
            s.startsWith("07") && s.length() == 11;
    static  Predicate<String> containsNumber3=s ->
            s.contains("3");
}