/*WAP to store any two integers and store their sum, then display all the values int the variable with relevant message.
 * 
 * 
 * Hints: To store integer literal, we need a variavle.
 *        To create variable, we need data type.
 *        As we are dealing with integers, the better choice of data type is 'int'.
 * we need three variables.
 * 1. for 1st number.
 * 2. for second no.
 * 3. sore sum
 * To display we use  'output statement'----> System.out.println
 */


class SumOfTwo {
public static void main(String[] args) {
    int num1 = 20;
    int num2 = 10;
    int sum = num1+num2;
    System.out.println("First number stored : "+num1);
    System.out.println("Second number stored : "+num2);
    System.out.println("The sum of "+ num1 + " and "+ num2 + " is : " + sum);
}
    
}