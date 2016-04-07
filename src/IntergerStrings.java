import java.util.Scanner;

public class IntergerStrings 
{
private int number_values;
private int[] int_values;
private double average;

public IntergerStrings(int number_values)
    {
    this.number_values = number_values;
    }
public void values()
    {
    String value_string = null;
    int int_value = 0,a;
    Scanner number = null;
    a = 0;
    int_values = new int [number_values];

while (a < number_values)
    {
    try{
        number = new Scanner(System.in);
        System.out.print("Please enter a value:");

        value_string = number.nextLine();

        int_value = Integer.parseInt(value_string);

        int_values[a++] = int_value;
        } 
    catch (NumberFormatException ex)
            {
            System.out.print("This is an invalid input. Please renter another number:");
            continue;
            }
    }
}
public void printValues()
{
	System.out.println("The values are:");

    for (int a = 0; a < number_values; a++)
    {
        int i = 0;
		System.out.println("Number - " + (a + 1) + " = " + int_values[i]);

    }
}
public double get_average()
{
int sum = 0;

for(int a = 0; a < number_values; a++)
    {
    sum += int_values[a];
    }
average = (double) sum / number_values;
return (average);
}
public static void main(String[] args)
{
    IntergerStrings a = new IntergerStrings(10);
    a.values();
    a.printValues();
    System.out.println("Average = " + a.get_average());

}
}