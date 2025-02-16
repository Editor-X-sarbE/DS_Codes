// import java.util.Scanner;

// public class Psve_ve_0 {
//     static int num;

//     public static void Conditions_1(int num) {
//         if (num % 2 == 0 && num < 0) {
//             System.out.println("Even Number .");
//         } else {
//             System.out.println("Odd Number .");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number :");
//         String number = sc.nextLine();
//         num = Integer.parseInt(number);

//         try {
//             if (num > 0) {
//                 System.out.println("The number is +ve .");
//                 Conditions_1(num);
//             } else if (num < 0) {
//                 System.out.println("The number is -ve .");
//                 Conditions_1(num);
//             } else {
//                 System.out.println("the Number is 0 .");
//                 Conditions_1(num);
//             }
//         } catch (Exception e) {
//             System.out.println("You have entered Character input . " + number);
//             for (int i = 0; i < number.length(); i++) {
//                 char c = number.charAt(i);
//                 if (c > 0) {
//                     System.out.println(c + " : " + (int) c + " +ve .");
//                 } else if (c < 0) {
//                     System.out.println(c + " : " + (int) c + " -ve .");
//                 } else {
//                     System.out.println(c + " : " + (int) c + " 0 .");
//                 }
//             }
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class Psve_ve_0 {
    static int num;

    public static void Conditions_1(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number.");
        } else {
            System.out.println("Odd Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String input = sc.nextLine();

        try {
            num = Integer.parseInt(input);

            if (num > 0) {
                System.out.println("The number is +ve.");
            } else if (num < 0) {
                System.out.println("The number is -ve.");
            } else {
                System.out.println("The number is 0.");
            }

            Conditions_1(num);

        } catch (NumberFormatException e) {
            System.out.println("You have entered a string: " + input);

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int asciiValue = (int) c;

                if (asciiValue % 2 == 0) {
                    System.out.println(c + " : ASCII Value" + asciiValue + " -> Even");
                } else {
                    System.out.println(c + " : ASCII Value" + asciiValue + " -> Odd");
                }
            }
        }
        // modify catch block problem was +ve ,-ve not shown in catch block
        sc.close();
    }
}
