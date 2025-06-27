import java.util.Arrays;
import java.util.Scanner;

public class ECommerceSearchPlatform {
    private Product[] products;
    private Product[] sortedProducts;
    private Scanner scanner;
    
    public ECommerceSearchPlatform() {
        this.scanner = new Scanner(System.in);
        initializeProducts();
    }
 
    private void initializeProducts() {
        products = new Product[] {
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
        
        sortedProducts = Arrays.copyOf(products, products.length);
        SearchAlgorithms.sortProductsById(sortedProducts);
        
        System.out.println("E-Commerce Search Platform Initialized!");
        System.out.println("Total Products: " + products.length);
    }
    

    public void displayProducts() {
        System.out.println("\n=== ALL PRODUCTS ===");
        System.out.println("Unsorted Array (for Linear Search):");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
        
        System.out.println("\nSorted Array (for Binary Search):");
        for (int i = 0; i < sortedProducts.length; i++) {
            System.out.println((i + 1) + ". " + sortedProducts[i]);
        }
    }
 
    public void searchMenu() {
        while (true) {
            System.out.println("\n=== E-COMMERCE SEARCH MENU ===");
            System.out.println("1. Linear Search by Product ID");
            System.out.println("2. Binary Search by Product ID");
            System.out.println("3. Linear Search by Product Name");
            System.out.println("4. Performance Comparison");
            System.out.println("5. Display All Products");
            System.out.println("6. Algorithm Analysis");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    performLinearSearchById();
                    break;
                case 2:
                    performBinarySearchById();
                    break;
                case 3:
                    performLinearSearchByName();
                    break;
                case 4:
                    performanceComparison();
                    break;
                case 5:
                    displayProducts();
                    break;
                case 6:
                    displayAlgorithmAnalysis();
                    break;
                case 7:
                    System.out.println("Thank you for using E-Commerce Search Platform!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
    
    private void performLinearSearchById() {
        System.out.print("Enter Product ID to search: ");
        int productId = scanner.nextInt();
        
        long startTime = System.nanoTime();
        int result = SearchAlgorithms.linearSearchById(products, productId);
        long endTime = System.nanoTime();
        
        if (result != -1) {
            System.out.println("Product found: " + products[result]);
        } else {
            System.out.println("Product not found!");
        }
        System.out.println("Search time: " + (endTime - startTime) + " nanoseconds");
    }
    
    private void performBinarySearchById() {
        System.out.print("Enter Product ID to search: ");
        int productId = scanner.nextInt();
        
        long startTime = System.nanoTime();
        int result = SearchAlgorithms.binarySearchById(sortedProducts, productId);
        long endTime = System.nanoTime();
        
        if (result != -1) {
            System.out.println("Product found: " + sortedProducts[result]);
        } else {
            System.out.println("Product not found!");
        }
        System.out.println("Search time: " + (endTime - startTime) + " nanoseconds");
    }
    
    private void performLinearSearchByName() {
        System.out.print("Enter Product Name to search: ");
        String productName = scanner.nextLine();
        
        long startTime = System.nanoTime();
        int result = SearchAlgorithms.linearSearchByName(products, productName);
        long endTime = System.nanoTime();
        
        if (result != -1) {
            System.out.println("Product found: " + products[result]);
        } else {
            System.out.println("Product not found!");
        }
        System.out.println("Search time: " + (endTime - startTime) + " nanoseconds");
    }
    
    private void performanceComparison() {
        System.out.print("Enter Product ID for performance comparison: ");
        int productId = scanner.nextInt();
        
        SearchAlgorithms.compareSearchPerformance(products, sortedProducts, productId);
    }

    private void displayAlgorithmAnalysis() {
        System.out.println("\n=== ALGORITHM ANALYSIS ===");
        
        System.out.println("\n1. BIG O NOTATION:");
        System.out.println("Big O notation describes the upper bound of algorithm complexity.");
        System.out.println("It helps us understand how algorithm performance scales with input size.");
        System.out.println("Common complexities: O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ)");
        
        System.out.println("\n2. LINEAR SEARCH ANALYSIS:");
        System.out.println("Time Complexity: O(n)");
        System.out.println("- Best Case: O(1) - Element found at first position");
        System.out.println("- Average Case: O(n/2) ≈ O(n) - Element found in middle");
        System.out.println("- Worst Case: O(n) - Element at end or not found");
        System.out.println("Space Complexity: O(1) - Only uses constant extra space");
        System.out.println("Advantage: Works on unsorted arrays");
        System.out.println("Disadvantage: Slow for large datasets");
        
        System.out.println("\n3. BINARY SEARCH ANALYSIS:");
        System.out.println("Time Complexity: O(log n)");
        System.out.println("- Best Case: O(1) - Element found at middle position");
        System.out.println("- Average Case: O(log n) - Element found after log n comparisons");
        System.out.println("- Worst Case: O(log n) - Element at extremes or not found");
        System.out.println("Space Complexity: O(1) for iterative, O(log n) for recursive");
        System.out.println("Advantage: Very fast for large sorted datasets");
        System.out.println("Disadvantage: Requires sorted array");
        
        System.out.println("\n4. PERFORMANCE COMPARISON:");
        System.out.println("For 1,000 elements:");
        System.out.println("- Linear Search: Up to 1,000 comparisons");
        System.out.println("- Binary Search: Up to 10 comparisons (log₂ 1000 ≈ 10)");
        
        System.out.println("\nFor 1,000,000 elements:");
        System.out.println("- Linear Search: Up to 1,000,000 comparisons");
        System.out.println("- Binary Search: Up to 20 comparisons (log₂ 1,000,000 ≈ 20)");
        
        System.out.println("\n5. WHEN TO USE WHICH:");
        System.out.println("Linear Search:");
        System.out.println("- Small datasets (< 100 elements)");
        System.out.println("- Unsorted data");
        System.out.println("- When sorting cost > search benefit");
        
        System.out.println("Binary Search:");
        System.out.println("- Large datasets (> 100 elements)");
        System.out.println("- Data is already sorted or can be sorted once");
        System.out.println("- Multiple searches on same dataset");
    }
    
    public static void main(String[] args) {
        ECommerceSearchPlatform platform = new ECommerceSearchPlatform();
        platform.searchMenu();
    }
}