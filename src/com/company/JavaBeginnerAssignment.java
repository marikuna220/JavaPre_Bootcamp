

public class JavaBeginnerAssignment {
    public static void main(String[] args) {
        function();
        functionadd();
        functionA2();
        functionA3();
    }

    public static void function() {
        int x = 10;
        int y = 5;
        int result = 0;
        if (x > y) {
            result = x * y;
        } else {
            result = x + y;
        }
        System.out.println(result);
    }

    public static void functionadd() {
        int x = 5;
        int y = 10;
        int result = 0;
        if (x > y) {
            result = x * y;
        } else {
            result = x + y;
        }
        System.out.println(result);
    }

    //აქ გავაკეთ ერთ ნამრავლზე და მეორე მიმატებაზე როდესაც არ სრულდება პირველი პირობა და გადადის else-ზე
    public static void functionA2() {
        int count = 1;
        while (count <= 4) {
            System.out.println(count);
            count++;
        }

    }
//სანამ ქაუნთ ნაკლებია 4 ზე ბეჭდავს  და ბეჭვდის მერე ამატებს ერთს მანამდე სანამ ქაუნთი არ გახდება 5
    public static void functionA3() {
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }}

// სანამ ი ნაკლებია  String word  ზე მანამდე დაბეჭდავს ყველა ასოს
//რამდენი ასოც არის ამ  String word -ში იმდენჯერ ანუ 4 ჯერ
