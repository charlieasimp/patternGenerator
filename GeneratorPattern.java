//  Class author:  Charlie Simpson
//  Date created:  10/30/26
//  General description: a brief summary of what this particular class does.


//  Pre-condition: row input must be greater than 0
//  Post-condition: input is the amount of rows that will print and each row
// is asterisks increasing by 2 each time, with a half pyramid shape.

public static void stars (int rows){
int count = 0;
String asterHolder = "*";
    while (count < rows){
        
        System.out.println(asterHolder);
        asterHolder += "**";

        count ++;
    }
}

public static void triangle(int rows){
int count = 0;
int numHolder = 1;
String stringHolder = "";
    while (count < rows)
{
        while (stringHolder.length() < numHolder)
        {
            stringHolder += numHolder;
        }
System.out.println(stringHolder);
count++;
stringHolder = "";
numHolder++;
}

}

public static void odds(int start)
{
String stringing = "";
int numberHolder = start;
if (start % 2 == 0)
{
    start -= 1;
    numberHolder = start;
}
    for (int i = 0; i < start; start-=2)
    {
        for (int i = 1; i < numberHolder; i++)
        {
            
        }
        
            System.out.println();
    }
{

}
}



public static void main (String args[]){
    stars(5);
    triangle(5);
    

}