//  Class author:  Charlie Simpson
//  Date created:  10/30/26
//  General description: a brief summary of what this particular class does.

public static void stars (int rows){
int count = 0;
String asterHolder = "*";
    while (count < rows){
        
        System.out.println(asterHolder);
        asterHolder += "**";

        count ++;
    }
}

public static void main (String args[]){
    stars(7);

}