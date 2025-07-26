import React, { useContext } from 'react'
import ThemeContext from './ThemeContext'

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext)

  return (
    <div>
      <h3>{employee.name}</h3>
      <p>{employee.role}</p>
      <button className={theme === 'dark' ? 'btn-dark' : 'btn-light'}>
        View
      </button>
    </div>
  )
}

export default EmployeeCard
