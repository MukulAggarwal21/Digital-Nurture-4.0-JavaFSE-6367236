import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore name="Mukul" school="KIET" total={450} goal={500} />
    </div>
  );
}

export default App;
