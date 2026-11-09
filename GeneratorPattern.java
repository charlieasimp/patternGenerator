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
int counting = 0;
int numHolder = 1;
String stringHolder = "";
    while (counting < rows)
{
        while (stringHolder.length() < numHolder)
        {
            stringHolder += numHolder;
        }
System.out.println(stringHolder);
counting++;
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
}
    for (int i = 0; i < start;)
    {
        for (int counts = 0; counts < numberHolder; counts++)
            {
                numberHolder = start;
                stringing += numberHolder;
            }
        
            System.out.println(stringing);
            stringing = "";
            start -= 2;
    }
{

}
}

public static void eo(int maxE)
{
int upN = maxE;
int downN = maxE;
String letterOutput = "";

for (int x = 1; x <= maxE; x++)
{
    if (upN % 2 == 0)
    {
        letterOutput = "O";
    }
    else 
    {
        letterOutput = "E";
    }
    upN--;
    System.out.println(letterOutput.repeat(x));
}
for (int y = maxE - 1; y >= 1; y--)
{
    if (downN % 2 == 0)
    {
        letterOutput = "O";
    }
    else
    {
        letterOutput = "E";
    }
    downN--;
    System.out.println(letterOutput.repeat(y));
}

}




public static void pyramid(int rows)
{
int countering = 0;
int temp = 1;
    while (countering < rows)
    {
        String numHoldering = "";
        int number = temp;
        int spaces = 0;
        while (spaces < temp - 1)
        {
            numHoldering += " ";
            spaces++;
        }
        while (numHoldering.length() < ((temp - 1) + (2 * (rows - temp) + 1)))
        {
            numHoldering += number;
        }
        System.out.println(numHoldering);
        countering++;
        temp++;
        
    }
}

public static void main (String args[]){
    
    eo(6);
    

}