import java.util.Arrays;


public class SearchAlgorithms {
    
  
    public static int linearSearchById(Product[] products, int targetId) {
        int comparisons = 0;
        
        for (int i = 0; i < products.length; i++) {
            comparisons++;
            if (products[i].getProductId() == targetId) {
                System.out.println("Linear Search - Comparisons made: " + comparisons);
                return i;
            }
        }
        
        System.out.println("Linear Search - Comparisons made: " + comparisons);
        return -1;
    }
    
   
    public static int linearSearchByName(Product[] products, String targetName) {
        int comparisons = 0;
        
        for (int i = 0; i < products.length; i++) {
            comparisons++;
            if (products[i].getProductName().equalsIgnoreCase(targetName)) {
                System.out.println("Linear Search (Name) - Comparisons made: " + comparisons);
                return i;
            }
        }
        
        System.out.println("Linear Search (Name) - Comparisons made: " + comparisons);
        return -1;
    }
    
  
    public static int binarySearchById(Product[] sortedProducts, int targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;
        int comparisons = 0;
        
        while (left <= right) {
            comparisons++;
            int mid = left + (right - left) / 2;
            
            int midProductId = sortedProducts[mid].getProductId();
            
            if (midProductId == targetId) {
                System.out.println("Binary Search - Comparisons made: " + comparisons);
                return mid;
            }
            
            if (midProductId < targetId) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        
        System.out.println("Binary Search - Comparisons made: " + comparisons);
        return -1; 
    }
    
 
    public static int binarySearchRecursive(Product[] sortedProducts, int targetId, int left, int right, int comparisons) {
        if (left > right) {
            System.out.println("Binary Search (Recursive) - Comparisons made: " + comparisons);
            return -1;
        }
        
        comparisons++;
        int mid = left + (right - left) / 2;
        int midProductId = sortedProducts[mid].getProductId();
        
        if (midProductId == targetId) {
            System.out.println("Binary Search (Recursive) - Comparisons made: " + comparisons);
            return mid;
        }
        
        if (midProductId < targetId) {
            return binarySearchRecursive(sortedProducts, targetId, mid + 1, right, comparisons);
        } else {
            return binarySearchRecursive(sortedProducts, targetId, left, mid - 1, comparisons);
        }
    }
    

    public static void sortProductsById(Product[] products) {
        Arrays.sort(products);
    }
    
  
    public static void compareSearchPerformance(Product[] unsortedProducts, Product[] sortedProducts, int targetId) {
        System.out.println("\n=== PERFORMANCE COMPARISON ===");
        System.out.println("Searching for Product ID: " + targetId);
        System.out.println("Array size: " + unsortedProducts.length + " products");
        
        long startTime = System.nanoTime();
        int linearResult = linearSearchById(unsortedProducts, targetId);
        long linearTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        int binaryResult = binarySearchById(sortedProducts, targetId);
        long binaryTime = System.nanoTime() - startTime;
        
        System.out.println("\nResults:");
        System.out.println("Linear Search: " + (linearResult != -1 ? "Found at index " + linearResult : "Not found"));
        System.out.println("Binary Search: " + (binaryResult != -1 ? "Found at index " + binaryResult : "Not found"));
        
        System.out.println("\nExecution Time:");
        System.out.println("Linear Search: " + linearTime + " nanoseconds");
        System.out.println("Binary Search: " + binaryTime + " nanoseconds");
        System.out.println("Binary search is " + (linearTime > binaryTime ? (linearTime/binaryTime) : 1) + "x faster");
    }
}