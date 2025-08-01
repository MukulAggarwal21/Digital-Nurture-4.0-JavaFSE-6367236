import React, { useState } from 'react'

function Register() {
  const [name, setName] = useState('')
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const [errors, setErrors] = useState({})

  const validate = () => {
    const newErrors = {}
    if (name.length < 5) newErrors.name = 'Name must be at least 5 characters'
    if (!email.includes('@') || !email.includes('.')) newErrors.email = 'Invalid email'
    if (password.length < 8) newErrors.password = 'Password must be at least 8 characters'
    return newErrors
  }

  const handleSubmit = (e) => {
    e.preventDefault()
    const formErrors = validate()
    if (Object.keys(formErrors).length === 0) {
      alert('Registered Successfully')
      setName('')
      setEmail('')
      setPassword('')
      setErrors({})
    } else {
      setErrors(formErrors)
    }
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Name:
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
        <div>{errors.name}</div>
      </label>
      <br />
      <label>
        Email:
        <input type="text" value={email} onChange={(e) => setEmail(e.target.value)} />
        <div>{errors.email}</div>
      </label>
      <br />
      <label>
        Password:
        <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
        <div>{errors.password}</div>
      </label>
      <br />
      <button type="submit">Register</button>
    </form>
  )
}

export default Register
