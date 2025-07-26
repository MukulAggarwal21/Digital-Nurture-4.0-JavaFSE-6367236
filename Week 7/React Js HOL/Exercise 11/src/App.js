import React from "react";
import CohortDetails from "./CohortDetails";

function App() {
  return (
    <div>
      <CohortDetails
        name="React Bootcamp"
        duration="6 Weeks"
        status="ongoing"
        startDate="2025-07-01"
        endDate="2025-08-15"
      />
      <CohortDetails
        name="Node.js Advanced"
        duration="4 Weeks"
        status="completed"
        startDate="2025-06-01"
        endDate="2025-06-30"
      />
    </div>
  );
}

export default App;
