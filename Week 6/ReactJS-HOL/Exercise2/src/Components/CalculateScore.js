import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = ((props.total / props.goal) * 100).toFixed(2);
  return (
    <div className="score-box">
      <h2>Student Score Report</h2>
      <p>Name: {props.name}</p>
      <p>School: {props.school}</p>
      <p>Total Marks: {props.total}</p>
      <p>Goal Marks: {props.goal}</p>
      <p>Average Score: {average}%</p>
    </div>
  );
}

export default CalculateScore;
