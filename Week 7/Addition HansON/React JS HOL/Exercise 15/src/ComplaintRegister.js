import React, { useState } from 'react'

function ComplaintRegister() {
  const [name, setName] = useState('')
  const [complaint, setComplaint] = useState('')

  const handleSubmit = (e) => {
    e.preventDefault()
    const reference = 'REF' + Math.floor(Math.random() * 1000000)
    alert('Complaint submitted. Reference Number: ' + reference)
    setName('')
    setComplaint('')
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Employee Name:
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} required />
      </label>
      <br />
      <label>
        Complaint:
        <textarea value={complaint} onChange={(e) => setComplaint(e.target.value)} required />
      </label>
      <br />
      <button type="submit">Submit</button>
    </form>
  )
}

export default ComplaintRegister
