package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        // write your code here
//        System.out.println("Hello world");
//        sayHi();
//        falseLuckyNumber();
//            luckyNumber();
//        numberPick();
//        loopNumberPick();
//        myDoWhile();
//        myForLoop();
//        multiplicationTable();
//        increasing();
//        decreasing();
//        sumTo100();
//        strictDivisors();
//        copyStrictDivisor();
//        myPrimeNumbers();
//        findMaxMin();
//        sumOfNumbers();
//        nthFibonacciNumber();
//        addSpace();
//        reverseString();
//        checkPalindrome();
//        numTimes();
//        starNum();
//        spaceTriangle();
//        printStar();
//        String name = getName();
//        int age = getAge();
//        System.out.println("Your name is " + name + " and you are " + age + " years old!");
//        printPrimeNumbers(1, 20);
//        int[] num = populateArray();
//
//        System.out.println("Sum is: " + mySum(num) + " and product is: " + myProduct(num) + " Average is: " + myAve(num));
//        searchOcc();
//        findMaxAndMin();
//        repetition();

//        System.out.println(Arrays.toString(findRestaurant()));
//        System.out.println(findRestaurant());
//        char [] myStrings = {'h', 'e', 'l', 'l', 'o', 'a'};
//        System.out.println(Arrays.toString(reverseString(myStrings)));
//        System.out.println(reverse(0123));
//        reverse(1230);
//        System.out.println("Cipher Encrypt " + encrypt("ATTACKATONCE", 4));
//        System.out.println("Cipher Decrypt " + decrypt("EXXEGOEXSRGI", 4));
//        System.out.println(printRow(new int[][]{{1, 3, 5}, {2, 4, 6}}));
        int[][] numbersArray = new int[][]{{1, 3, 5, 7}, {2, 4, 6, 8}, {3, 5, 6, 8}, {2, 2, 2, 2}};
//        printRow(numbersArray);
//        printColumn(numbersArray);
//        printMaxOnRow(numbersArray);
//        chall();
//        uniqueList();
        selectOption();
    }

    public static void selectOption() {
        ArrayList<Integer> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Add\n2. Remove\n3. Display\n4. Exit");
            System.out.print("Your Choice: ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter an integer: ");
                items.add(sc.nextInt());
                System.out.println("Added.");
            } else if (option == 2) {
                System.out.print("Enter an integer to remove: ");
                int temp = sc.nextInt();
                if (items.contains(temp)) {
                    items.remove(Integer.valueOf(temp));
                    System.out.println(temp + " Removed.");
                } else {
                    System.out.println(temp + " not found.");
                }

            } else if (option == 3) {
                System.out.println("Your List " + items);

            }

        } while (option != 4);
        System.out.println("Bye.");
    }


    public static void uniqueList() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();
        ArrayList<Integer> newItem = new ArrayList<>();
        System.out.print("Enter the length of your list: ");
        int len = sc.nextInt();
        for (int i = 1; i <= len; i++) {
            System.out.print("Enter the number " + i + " item: ");
            items.add(sc.nextInt());
        }
        Collections.sort(items);
        for (int item : items) {
            if (!newItem.contains(item)) {
                newItem.add(item);
            }
        }
        System.out.println(newItem);
    }

    public static void chall() {
        int[] arr = {5, 2, 2, 0};
        int index = 0;
        for (int item : arr) {
            System.out.println(item + " " + index++);
        }
    }

    public static void printMaxOnRow(int[][] nums) {
        int max = 0;
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            max = 0;
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max)
                    max = nums[i][j];
            }
            System.out.println("Max of row " + index + " is " + max);
            index++;
        }
    }

    public static void printColumn(int[][] numbs) {
        int num = 0;
        int index = 0;
        for (int i = 0; i < numbs.length; i++) {
            num = 0;
            for (int j = 0; j < numbs[i].length; j++) {
                num += numbs[j][i];
            }
            index++;
            System.out.println("Sum of Column " + index + ": " + num);
        }

    }


    public static void printRow(int[][] nums) {
        int num = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            num = 0;
            for (int j = 0; j < nums[i].length; j++) {
                num += nums[i][j];
            }
            index++;
            System.out.println("Sum of row " + index + ": " + num);
        }
    }

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static StringBuffer decrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) - s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) - s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static int reverse(int x) {
        int y = 0;
        System.out.println(x);
        do {
            y = x % 10;
            x /= 10;
        } while (x % 10 != 0);
        return x;
    }

    public static char[] reverseString(char[] s) {
        int j = s.length - 1;
        char temp = 'a';
        char[] tempo = new char[s.length];
        for (int i = 0; i < (s.length) / 2; i++) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            tempo[i] = s[j];
            j--;
        }
        return s;
    }

//    public static String[] findRestaurant() {
//        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
//        List<String> myList = new ArrayList<String>();
//        String[] result = new String[list1.length];
//        String[] myResult = new String[1];
//        int k = 0;
//        for (int i = 0; i < list1.length; i++) {
//            for (int j = 0; j < list2.length; j++) {
//                if (list1[i].equals(list2[j])) {
//                    myList.add(list1[i]);
////                    result[k++] = list1[i];
//                }
//            }
//        }
//        String[] finalResult = new String[myList.size()];
//        for (int m = 0; m < finalResult.length; m++) {
//            finalResult[m] = myList.get(m);
//        }
////        myResult[0] = result[0];
//        return finalResult;
//    }

    public static int[] oddFirst() {
        int[] numbers = {1, 2, 4, 5, 7, 9, -2, 3};
        int[] temp = new int[numbers.length];
        int j = 0;
        int k = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                temp[j++] = numbers[i];
            } else if (numbers[i] % 2 == 0) {
                temp[k--] = numbers[i];
            }
        }

        return temp;
    }

    public static String plusMult(List<Integer> A) {
        String and = "";
        for (int i = 0; i <= A.size(); i++) {
            if (A.get(i) == 0) {
                System.out.println(A.get(i));
            }
        }
        return and;
    }

    public static double trimMean() {
        int[] arr = new int[]
//                {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
                {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        double mean = 0;
        double divisor = arr.length - 2;
        Arrays.sort(arr);
        double percent = ((double) 5 / (double) 100 * (double) arr.length);
        double sum = 0;
        for (double i = percent; i < arr.length - percent; i++) {
            sum += arr[(int) i];
        }
        System.out.println("Perc " + (int) percent);

        mean = sum / divisor;
        return mean;
    }

    public static int searchInsert() {
        int target = 2;
        int[] nums = new int[]{1, 3, 5, 6};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                j = i;
                break;
            }
            if (target > nums[nums.length - 1]) {
                j = nums.length;
            }
        }
        return j;
    }

    public static void repetition() {
        int[] nums = {2, 2, 1};
        int min = nums[0];
        int occ = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("here");
        }


    }

    public static void findMaxAndMin() {
        int[] numbers = {3, 2, 1, 5, 4, 2, 4, 6, -3, 5};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];

        }
        System.out.println("Min is: " + min + " max is: " + max);

    }

    public static void searchOcc() {
        int[] numbers = {1, 1, 1, 1, 2, 3};
        int searchElement = 1;
        int occ = 0;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == searchElement)
                occ++;
        System.out.println(occ);
    }

    public static int[] populateArray() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = s.nextInt();
        int[] num = new int[len];
        System.out.println("Populate the array: ");
        for (int i = 0; i <= len - 1; i++) {
            num[i] = s.nextInt();
        }
        return num;
    }

    public static int myAve(int[] numbers) {
        int ave;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        ave = sum / numbers.length;
        return ave;

    }

    public static int myProduct(int[] numbers) {
        int prod = 1;
        for (int i = 0; i < numbers.length; i++)
            prod *= numbers[i];

        return prod;

    }


    public static int mySum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum;

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;

    }

    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static String getName() {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = s.next();
        return name;
    }

    public static int getAge() {
        Scanner s = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = s.nextInt();
        return age;
    }

    public static void printStar() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n)
                for (int j = 1; j <= n; j++)
                    System.out.print("*");
            else
                for (int j = 1; j <= n; j++)
                    if (j == 1 || j == n)
                        System.out.print(" ");
                    else
                        System.out.print("*");

            System.out.println();

        }
    }

    public static void spaceTriangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - 1; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                if (i == num)
                    System.out.print("*");
                else if (j == i || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();
        }


    }

    public static void starNum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - 1; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void numTimes() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();

        }
    }

    public static void checkPalindrome() {
        String str = "abba";
        boolean isPalindrome = true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j))
                continue;

            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not palindrome");


    }

    public static void reverseString() {
        String a = "somewhere cool";
        String j = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            j += a.charAt(i);
//            System.out.print(a.charAt(i));

        }
        System.out.println(j);
    }

    public static void addSpace() {
        String str = "somewhere cool";
        for (int i = 0; i <= str.length() - 1; i++)
            System.out.print(str.charAt(i) + " ");

    }

    public static void nthFibonacciNumber() {
        Scanner s = new Scanner(System.in);
        int result = 0;
        int v1 = 1;
        int v2 = 1;
        int n = s.nextInt();
        for (int i = 1; i <= n - 2; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("Result = " + (result == 0 ? 1 : result));


    }

    public static void sumOfNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sequence of number: ");
        int n = s.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
    }

    public static void findMaxMin() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        int n = s.nextInt();
        int max = n;
        int min = n;
        do {
            n = s.nextInt();
            if (n < 0)
                break;
//            max = Math.max(n, max);
            if (n > max)
                max = n;
//            min = Math.min(n, min);
            if (n < min)
                min = n;

        } while (!(n < 1));
        System.out.print("Max is " + max + " and min is " + min);
    }

    public static void myPrimeNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int sum = 1;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                sum += i;
        System.out.println(sum == 1 ? "prime number" : "Not a prime number");
    }

    public static void copyStrictDivisor() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }

        }
        System.out.print(sum + n);
    }

    public static void strictDivisors() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number to find its strict divisor: ");
        int n = sn.nextInt();
        int i;
        int j = 0;
        for (i = n / 2; i > 0; i--) {
            if (n % i != 0)
                continue;
            j += i;
            System.out.print(i + " + ");


        }
        System.out.println(" = " + j);


    }

    public static void sumTo100() {
        Scanner s = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("Enter a number: ");
            i += s.nextInt();
            System.out.print("i = " + i + "\n");

        } while (i < 100);
        System.out.println("Done " + i);


    }

    public static void decreasing() {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0)
                continue;
            System.out.print(i + " ");
        }

    }

    public static void increasing() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "");
            }
            System.out.println();

        }
    }

    public static void myForLoop() {
        int i;
        for (i = 1; i < 6; i++) {
            System.out.println("Hello " + i);
        }
        System.out.println("Number is now " + i);
    }

    public static void myDoWhile() {
        int num;
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            num = s.nextInt();
        } while (num < 1 || num > 10);
        System.out.println(num + " is between 1 and 10");
    }

    public static void sayHi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 op num2:");
        double firstNumber = input.nextDouble();
        char op = input.next().charAt(0);
        double secondNumber = input.nextDouble();

        if (op == '*')
            System.out.println(firstNumber * secondNumber);
        else if (op == '/')
            System.out.println(firstNumber / secondNumber);
        else if (op == '-')
            System.out.println(firstNumber - secondNumber);
        else if (op == '+')
            System.out.println(firstNumber + secondNumber);
        else
            System.out.println("invalid operator");
    }

    public static void falseLuckyNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 4 numbers separating them with space to decide if it is a lucky number");
        int numA = in.nextInt();
        int numB = in.nextInt();
        int numC = in.nextInt();
        int numD = in.nextInt();
        if (numA + numB == numC + numD)
            System.out.println("The numbers are lucky numbers");
        else
            System.out.println("Not lucky numbers");


    }

    public static void luckyNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int n = s.nextInt();
        if (!(n > 999 && n < 10000)) {
            System.out.println(n + " is not a 4 digit number");
        } else {
            int fourthDigit = n % 10; // D
            int thirdDigit = (n / 10) % 10; //ABD % 10 = C
            int secondDigit = (n / 100) % 10; // AB % 10 = B
            int firstDigit = (n / 1000) % 10; // A % 10 = A

            System.out.println(firstDigit);
            System.out.println(secondDigit);
            System.out.println(thirdDigit);
            System.out.println(fourthDigit);

            if (firstDigit + secondDigit == thirdDigit + fourthDigit)
                System.out.println("Lucky number");
            else
                System.out.println("Not lucky");

        }


    }

    public static void numberPick() {
        System.out.println("Enter a number between 1 and 10");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (!(number >= 1 && number <= 10))
            System.out.println(number + " is not between 1 and 10");
        else
            System.out.println(number + " is between 1 and 10");
    }

    public static void loopNumberPick() {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        while (number < 1 || number > 10) {
            System.out.print(number + " is not between 1 and 10, Try again: ");
            number = s.nextInt();
        }
        System.out.print(number + " is between 1 and 10");
    }
}
