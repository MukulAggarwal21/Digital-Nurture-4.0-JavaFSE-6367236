import React from "react";

function GuestPage({ onLogin }) {
  return (
    <div style={{ padding: "20px" }}>
      <h1>Welcome Guest</h1>
      <p>Flight Details:</p>
      <ul>
        <li>Flight: AI202</li>
        <li>From: Delhi</li>
        <li>To: Mumbai</li>
        <li>Time: 10:00 AM</li>
      </ul>
      <button onClick={onLogin}>Login to Book Tickets</button>
    </div>
  );
}

export default GuestPage;
