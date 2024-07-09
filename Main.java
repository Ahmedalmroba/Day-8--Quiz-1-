import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Write a Java program that accept three numbers from the user and print the largest number .

         */
        Scanner input= new  Scanner(System.in);
        int largestNumber=0;
        System.out.println("enter frist num");
        int num1= input.nextInt();
        System.out.println("enter scond num");
        int num2= input.nextInt();
        System.out.println("enter third num");
        int num3= input.nextInt();
        if (num1>num2&&num1>num3) {
            largestNumber=num1;

        } else if (num2>num1&&num2>num3) {
            largestNumber=num2;

        }else
            largestNumber=num3;
        System.out.println("the largest number " + largestNumber);

        /*Write a Java program that accept a String and a number from the user,then print the character in the given index .
*/
        System.out.println("enter  the string");
        String str=input.next();
        System.out.println("enter  the number");
        int number=input.nextInt();
       if(number>0&&number<str.length()) {
           char character = str.charAt(number);
           System.out.println("the character in the  index = " + character);
       }else
           System.out.println("invalid" );

        /*

 Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
         */
        System.out.println("Enter the number");
        int count=input.nextInt();
        int sum=0;
        for (int i = 0; i <count ; i++) {
            System.out.println("Enter the number");
            int num4=input.nextInt();
            sum+=num4;}
        System.out.println("the sum =" + sum);

        /*
        Write a Java program to find positive and negative numbers of a given array:

  -  Original Array:
      [10, -21 , 30, 31, -25]

         */
int [] numbers = {10,-21,30,31,-25};
        System.out.println("positive numbers in the array" );
        for(int number5:numbers){
            if (number5>0){
            System.out.println(number5 );

        }
}
        System.out.println("negative numbers in the array" );
        for(int number5:numbers){
            if (number5<0) {
                System.out.println(number5);

            }}
/*
Write a Java program to find a shortest word of a given array:
- Original Array:
    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]

 */
        String [] words= {"Tuwaiq","Bootcamp","Student","JAVA"};
        String  shortestWord= words[0];
        for(int i=1; i< words.length;i++){
            if (words[i].length()<shortestWord.length()){
                shortestWord= words[i] ;}}

        System.out.println("The shortest word of a  array:"+ shortestWord);

        }}




