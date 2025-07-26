import React from 'react'

class Getuser extends React.Component {
  constructor(props) {
    super(props)
    this.state = {
      title: '',
      firstname: '',
      image: ''
    }
  }

  async componentDidMount() {
    const res = await fetch('https://api.randomuser.me/')
    const data = await res.json()
    const user = data.results[0]
    this.setState({
      title: user.name.title,
      firstname: user.name.first,
      image: user.picture.large
    })
  }

  render() {
    return (
      <div>
        <h2>{this.state.title} {this.state.firstname}</h2>
        <img src={this.state.image} alt="User" />
      </div>
    )
  }
}

export default Getuser
