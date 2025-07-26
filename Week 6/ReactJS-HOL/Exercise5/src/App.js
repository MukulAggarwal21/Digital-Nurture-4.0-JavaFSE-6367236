import React from "react";

const offices = [
  { Name: "DBS", Rent: 50000, Address: "Chennai", Image: "https://via.placeholder.com/300x200?text=DBS" },
  { Name: "WeWork", Rent: 65000, Address: "Bangalore", Image: "https://via.placeholder.com/300x200?text=WeWork" },
  { Name: "Regus", Rent: 40000, Address: "Mumbai", Image: "https://via.placeholder.com/300x200?text=Regus" }
];

function App() {
  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space , at Affordable Range</h1>
      {offices.map((item, index) => {
        const rentStyle = {
          color: item.Rent <= 60000 ? "red" : "green"
        };
        return (
          <div key={index} style={{ marginBottom: "30px" }}>
            <img src={item.Image} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {item.Name}</h1>
            <h3 style={rentStyle}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
