
Financial Forecasting Tool - Java Implementation

📁 Project Structure:
FinancialForecasting/
├── Main.java
├── model/
│   └── ForecastInput.java
├── service/
│   └── ForecastCalculator.java
├── util/
│   └── Validator.java
├── analysis/
│   └── ComplexityAnalysis.java

▶️ How to Compile:
From inside the FinancialForecasting directory:

javac Main.java model/*.java service/*.java util/*.java analysis/*.java

▶️ How to Run:

java Main

📌 Example Input:
Enter current value: 1000
Enter annual growth rate: 0.1
Enter number of years: 5

📌 Example Output:
Future Value (Recursive): 1610.51
Future Value (Memoized): 1610.51

🧠 Time Complexity:
- Recursive: O(n), where n is the number of years
- Memoized: O(n), avoids redundant computations using caching

📎 Notes:
- Java must be installed and configured in your system path.
- Input validation ensures safe and realistic values.
- Easily extensible for GUI, charts, or CSV export later.
