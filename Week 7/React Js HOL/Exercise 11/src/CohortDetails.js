import React from "react";
import styles from "./CohortDetails.module.css";

function CohortDetails({ name, duration, status, startDate, endDate }) {
  const statusStyle = {
    color: status === "ongoing" ? "green" : "blue",
  };

  return (
    <div className={styles.box}>
      <h3 style={statusStyle}>{name}</h3>
      <dl>
        <dt>Duration:</dt>
        <dd>{duration}</dd>
        <dt>Status:</dt>
        <dd>{status}</dd>
        <dt>Start Date:</dt>
        <dd>{startDate}</dd>
        <dt>End Date:</dt>
        <dd>{endDate}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
