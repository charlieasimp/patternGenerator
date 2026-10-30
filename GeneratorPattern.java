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
    do {
    System.out.println();

    numHolder += 1;
}while(count < rows);

}

public static void main (String args[]){
    stars(7);

}