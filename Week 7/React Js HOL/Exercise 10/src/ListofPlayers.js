import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Player 1", score: 50 },
    { name: "Player 2", score: 80 },
    { name: "Player 3", score: 30 },
    { name: "Player 4", score: 90 },
    { name: "Player 5", score: 60 },
    { name: "Player 6", score: 75 },
    { name: "Player 7", score: 20 },
    { name: "Player 8", score: 85 },
    { name: "Player 9", score: 40 },
    { name: "Player 10", score: 95 },
    { name: "Player 11", score: 55 },
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>Players with score below 70</h2>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
