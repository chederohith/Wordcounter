import java.util.Scanner;
import java.util.Arrays;
class wordcounter{
 public static void main(String args[]){
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the text"); 
 String str=obj.nextLine();
 String[] words = str.split(" ");
 System.out.println(Arrays.toString(words));
 int counter=0;
for(String s1:words){
 counter++;
}
 System.out.println("total word counts : "+counter);
}
 } 
