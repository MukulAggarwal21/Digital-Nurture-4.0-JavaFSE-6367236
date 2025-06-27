
public class SearchDemo {
    
    public static void main(String[] args) {
        System.out.println("=== E-COMMERCE SEARCH FUNCTIONALITY DEMO ===\n");
        
        Product[] products = createSampleProducts();
        Product[] sortedProducts = new Product[products.length];
        System.arraycopy(products, 0, sortedProducts, 0, products.length);
        SearchAlgorithms.sortProductsById(sortedProducts);
        
        displayProductArrays(products, sortedProducts);
        
        demonstrateSearchScenarios(products, sortedProducts);
        
        performanceAnalysis(products, sortedProducts);
        
        explainBigONotation();
    }
    
    private static Product[] createSampleProducts() {
        return new Product[] {
            new Product(105, "Wireless Headphones", "Electronics", 79.99),
            new Product(102, "Gaming Mouse", "Electronics", 45.50),
            new Product(108, "Coffee Maker", "Appliances", 129.99),
            new Product(101, "Laptop Stand", "Accessories", 35.00),
            new Product(110, "Bluetooth Speaker", "Electronics", 89.99),
            new Product(103, "Desk Chair", "Furniture", 199.99),
            new Product(107, "Phone Case", "Accessories", 15.99),
            new Product(104, "Monitor", "Electronics", 299.99),
            new Product(109, "Table Lamp", "Furniture", 49.99),
            new Product(106, "Mechanical Keyboard", "Electronics", 119.99)
        };
    }
    
    private static void displayProductArrays(Product[] unsorted, Product[] sorted) {
        System.out.println("UNSORTED ARRAY (for Linear Search):");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println((i + 1) + ". " + unsorted[i]);
        }
        
        System.out.println("\nSORTED ARRAY (for Binary Search):");
        for (int i = 0; i < sorted.length; i++) {
            System.out.println((i + 1) + ". " + sorted[i]);
        }
        System.out.println();
    }
    
    private static void demonstrateSearchScenarios(Product[] products, Product[] sortedProducts) {
        System.out.println("=== SEARCH SCENARIOS DEMONSTRATION ===\n");
        
        System.out.println("SCENARIO 1: Best Case Search");
        System.out.println("Searching for Product ID: 105 (first in unsorted array)");
        
        int result1 = SearchAlgorithms.linearSearchById(products, 105);
        System.out.println("Linear Search Result: " + (result1 != -1 ? "Found at index " + result1 : "Not found"));
        
        int result2 = SearchAlgorithms.binarySearchById(sortedProducts, 105);
        System.out.println("Binary Search Result: " + (result2 != -1 ? "Found at index " + result2 : "Not found"));
        
        System.out.println("\nSCENARIO 2: Average Case Search");
        System.out.println("Searching for Product ID: 107 (middle of unsorted array)");
        
        int result3 = SearchAlgorithms.linearSearchById(products, 107);
        System.out.println("Linear Search Result: " + (result3 != -1 ? "Found at index " + result3 : "Not found"));
        
        int result4 = SearchAlgorithms.binarySearchById(sortedProducts, 107);
        System.out.println("Binary Search Result: " + (result4 != -1 ? "Found at index " + result4 : "Not found"));
        
        System.out.println("\nSCENARIO 3: Worst Case Search");
        System.out.println("Searching for Product ID: 999 (doesn't exist)");
        
        int result5 = SearchAlgorithms.linearSearchById(products, 999);
        System.out.println("Linear Search Result: " + (result5 != -1 ? "Found at index " + result5 : "Not found"));
        
        int result6 = SearchAlgorithms.binarySearchById(sortedProducts, 999);
        System.out.println("Binary Search Result: " + (result6 != -1 ? "Found at index " + result6 : "Not found"));
        
        System.out.println("\nSCENARIO 4: Search by Product Name");
        System.out.println("Searching for Product Name: 'Gaming Mouse'");
        
        int result7 = SearchAlgorithms.linearSearchByName(products, "Gaming Mouse");
        System.out.println("Linear Search by Name Result: " + (result7 != -1 ? "Found at index " + result7 : "Not found"));
        
        System.out.println();
    }
    
    private static void performanceAnalysis(Product[] products, Product[] sortedProducts) {
        System.out.println("=== PERFORMANCE ANALYSIS ===\n");
        
        int[] testIds = {101, 105, 108, 999}; 
        
        for (int testId : testIds) {
            SearchAlgorithms.compareSearchPerformance(products, sortedProducts, testId);
            System.out.println();
        }
        
        System.out.println("=== LARGE DATASET SIMULATION ===");
        Product[] largeDataset = createLargeDataset(1000);
        Product[] largeSortedDataset = new Product[largeDataset.length];
        System.arraycopy(largeDataset, 0, largeSortedDataset, 0, largeDataset.length);
        SearchAlgorithms.sortProductsById(largeSortedDataset);
        
        System.out.println("Testing with 1000 products:");
        SearchAlgorithms.compareSearchPerformance(largeDataset, largeSortedDataset, 500);
        System.out.println();
    }
    
    private static Product[] createLargeDataset(int size) {
        Product[] largeDataset = new Product[size];
        String[] categories = {"Electronics", "Clothing", "Books", "Home", "Sports"};
        
        for (int i = 0; i < size; i++) {
            largeDataset[i] = new Product(
                i + 1,
                "Product " + (i + 1),
                categories[i % categories.length],
                Math.random() * 500 + 10
            );
        }
        return largeDataset;
    }
    
    private static void explainBigONotation() {
        System.out.println("=== BIG O NOTATION EXPLANATION ===\n");
        
        System.out.println("Big O notation describes the WORST-CASE time complexity of algorithms.");
        System.out.println("It shows how the algorithm's performance scales with input size (n).\n");
        
        System.out.println("Common Big O complexities (from best to worst):");
        System.out.println("1. O(1) - Constant time: Same time regardless of input size");
        System.out.println("2. O(log n) - Logarithmic time: Time increases slowly with input size");
        System.out.println("3. O(n) - Linear time: Time increases proportionally with input size");
        System.out.println("4. O(n log n) - Linearithmic time: Common in efficient sorting algorithms");
        System.out.println("5. O(n²) - Quadratic time: Time increases with square of input size");
        System.out.println("6. O(2ⁿ) - Exponential time: Time doubles with each additional input\n");
        
        System.out.println("SEARCH ALGORITHM ANALYSIS:");
        System.out.println("\nLinear Search - O(n):");
        System.out.println("- Must check each element sequentially");
        System.out.println("- Best case: O(1) - element is first");
        System.out.println("- Average case: O(n/2) ≈ O(n) - element is in middle");
        System.out.println("- Worst case: O(n) - element is last or doesn't exist");
        
        System.out.println("\nBinary Search - O(log n):");
        System.out.println("- Eliminates half the search space in each step");
        System.out.println("- Best case: O(1) - element is in middle");
        System.out.println("- Average case: O(log n) - requires log n divisions");
        System.out.println("- Worst case: O(log n) - element at extremes or doesn't exist");
        
        System.out.println("\nPRACTICAL IMPLICATIONS:");
        System.out.println("For 1,000,000 elements:");
        System.out.println("- Linear Search: Up to 1,000,000 operations");
        System.out.println("- Binary Search: Up to 20 operations (log₂ 1,000,000 ≈ 20)");
        System.out.println("Binary search is ~50,000 times faster for large datasets!");
        
        System.out.println("\nWHY ASYMPTOTIC ANALYSIS MATTERS:");
        System.out.println("1. Predicts algorithm behavior with large datasets");
        System.out.println("2. Helps choose the right algorithm for the problem");
        System.out.println("3. Identifies performance bottlenecks");
        System.out.println("4. Enables scalable software design");
        System.out.println("5. Critical for e-commerce platforms handling millions of products");
    }
}