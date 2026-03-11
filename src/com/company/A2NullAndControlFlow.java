package com.company;

import java.util.Optional;

public class A2NullAndControlFlow {
    public static void main(String[] args) {
        String text = null;
        int length;

        if (text != null) {
            length = text.length();
        } else {
            length = 5;
        }

        System.out.println(length);
        //შეიქმნა strin ტიპის ცვლაიდ სახელად Text მაგრამ მივანიჭეთ NULL მნიშვნელობა, ანუ ამ ცვლადს არაფერი მნიშვნელობა არ აქვს
        //ასევე გვაქვს ცვლადი lenght  რომელიც არ არის განსაზღვრული
        //if ის საშუალებით ვამოწმებთ nullს ანუ თუ ტექსტი არ უდრის ნალს  (მაგ ექნება რაიმე მნიშ) შეასრულოს პირობა
        //რადგან length = text.length() აქვე ჩანს რომ გამოთვლისას text=null ს ამიტომ if პირობა აქვე გადადის else-ზე როგორც მივხვდი
        //და თუ ტექსი არის null გადავიდეს შემდეგ  ბლოკზე , ანუ else ზე(აქაც იგივეს ვწერ)
        //else-ის პირობა შესრულდება . text არის null, length-ს აქვს მნიშვნელობა 5. ამიტომ დაიბეჭდება 5.

        //What will be printed?-The program will print 5 because text is null. Since text is null, it enters the else block where length is set to 5
        //Why does the program not crash? -The program does not crash because of the null-checking (if (text != null)).This check ensures that the program only tries to call text.length() if text is not null. If text is null, the program skips calling text.length() and directly goes to the else block where length is assigned the value 5.(იმიტომ არ ფეილდება რომ სანამ length ს გამოიძახებს ამოწმებს ტექსტს if ბლოკით თუ ის არის null არ ცდილობს დაპრინტვას.და გადადის else-ზე სადაც ხვდება პირობა რომელიც მისცემს საშუალებას დაპრინტოს.
        //What would cause a NullPointerException here? -A NullPointerException would occur if we tried to call text.length() directly on a null value, like this :NullPointerException მოხდება, თუ text არის null და ცდილობ text.length()-ს გამოძახებას
//        String text2 = null;
//        int length2 = text.length();


        //
        String text3 = null;
        int length3;
        length3 = Optional.ofNullable(text3)
                .map(String::length)
                .orElse(5);

        System.out.println(length3);
    }

}
