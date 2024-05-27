import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        // Input array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Input the target element
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        
        // Create a HashMap to store the array values and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(array[i], i);
        }
        
        // Array to store the result indices
        int[] result = new int[2];
        boolean found = false;
        
        // Check for two sum
        for (int i = 0; i < n; i++) {
            int complement = target - array[i];
            
            if (map.containsKey(complement) && map.get(complement) != i) {
                result[0] = i;
                result[1] = map.get(complement);
                found = true;
                break;
            }
        }
        
        // Display the result
        if (found) {
            System.out.println("Indices: " + result[0] + " , " + result[1]);
        } else {
            System.out.println("No two sum solution found");
        }
        
        sc.close();
    }
}
