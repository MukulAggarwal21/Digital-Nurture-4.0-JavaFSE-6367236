import React from "react";

class CurrencyConvertor extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: "",
      euro: ""
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const euroValue = (this.state.rupees / 90).toFixed(2);
    this.setState({ euro: euroValue });
  };

  render() {
    return (
      <div>
        <h2>Currency Convertor</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            placeholder="Enter INR"
          />
          <button type="submit">Convert</button>
        </form>
        <h3>Euro: {this.state.euro}</h3>
      </div>
    );
  }
}

export default CurrencyConvertor;
