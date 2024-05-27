
import java.util.HashMap;
import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        HashMap <Character,Integer> map = new HashMap<>();

        //Construction of Hashmap
        //key - unique CHaracter in the string
        //value - frequency of each character

        for (int i=0; i<str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }
            else{
                map.put (str.charAt(i),1);
            }
        }
        //Scan the entire hashmapm and get the index of non repeating character
        int result = -1;
        for(int i = 0; i<str.length(); i++){
            if (map.get(str.charAt(i)) == 1){
            System.out.println("Fistrt non repeating Character is "+ i);
            result = 1;
            break;
            }  
        }
        if (result == -1){
            System.out.println(" no non repeating element is present");
        }
    } 
}
