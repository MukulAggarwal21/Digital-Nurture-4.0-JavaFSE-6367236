import React from "react";

function UserPage({ onLogout }) {
  return (
    <div style={{ padding: "20px" }}>
      <h1>Welcome User</h1>
      <p>You can now book your tickets.</p>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}

export default UserPage;
