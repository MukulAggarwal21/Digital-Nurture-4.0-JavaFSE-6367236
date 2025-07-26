import React from 'react'
import EmployeeCard from './EmployeeCard'

function EmployeesList() {
  const employees = [
    { id: 1, name: 'Alice', role: 'Developer' },
    { id: 2, name: 'Bob', role: 'Designer' },
    { id: 3, name: 'Charlie', role: 'Manager' }
  ]

  return (
    <div>
      {employees.map(emp => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  )
}

export default EmployeesList
