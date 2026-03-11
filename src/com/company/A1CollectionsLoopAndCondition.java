package com.company;

import java.util.Arrays;
import java.util.List;

public class A1CollectionsLoopAndCondition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3);
        int total = 0;
        for (int n : numbers)
        {
            if (n > 10) {
                total += n;
            }
        }

        System.out.println(total);
        // პირველ რიგში გვაქვს ლისტი სადაც გვაქვს ციფრები 5, 12, 8, 20, 3 .შემდეგ ვიგებთ რომ დათვლის დასაწყებად ჯამი გვაქვს 0.შემდეგ ვუყურებთ ყველა იმ ციფრს რაც შედის number-ებში.
// იმ პირობით რომ n>10 ზე ვიღებთ და ვამატებთ 0 ს (რადგან int total = 0).ამის შემდეგ ყველა მონაცემს რომ გადაუვლის და დაუმატებს 0ს -ციფრებს : 12 და 20 დაპრინტავს 32 .

//Questions:
//✓ What will be printed? -32 Because only the numbers 12 and 20 are greater than 10, and they are added together.
//✓ Which elements affect the result and why?-The numbers in the list that are greater than 10 affect the result (12 and 20 in this case). The condition if (n > 10) ensures that only numbers greater than 10 are added to the total.
//✓ What happens if the condition is changed to n >= 10?-If the condition is changed to n >= 10, 12, 20, and 10 will all be added. So, the result will become:10 + 12 + 20 = 42.0 will be included in the total because it's greater than or equal to >=10.

        //Bonus:
        // Rewrite the logic using Java Streams


        List<Integer> numbers2 = Arrays.asList(5,10,12, 8, 20, 3);
        int total2 = 8;
        total2 += numbers2.stream()
                .filter(n -> n >= 10)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(total2);
        //java streams-მა გაკეთა უფრო მკაფიოდ და მოკლედ ოპერაცია
        //List<Integer> გადავიდა numbers2(2 რადგან ამ დასახელებით გვაქვს უკვე).stream()
        //ვნახე ჯერ ზემოთ მოცემული პირობი გადაყვანა JAVA STREAM-ში და შემდეგ გავაკეთე ოდნავ პირობების შეცვლა. ანუ პირობაში ჩავუწერე რომ ტოტალი იყოს 8 და დაუმატოს მონაცემებიდან ციფრი რომელიც ტოლი და მეტი იქნება 10 ზ
        //eseigi 8+10(რადგან ტოლია)+12(რადგან მეტია )+20(რადგან მეტია)=50
    }

}

