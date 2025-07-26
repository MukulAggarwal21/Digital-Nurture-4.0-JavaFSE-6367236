import React, { useState } from 'react'
import ThemeContext from './ThemeContext'
import EmployeesList from './EmployeesList'

function App() {
  const [theme, setTheme] = useState('light')

  return (
    <ThemeContext.Provider value={theme}>
      <div className="App">
        <h1>Employee Management</h1>
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  )
}

export default App
