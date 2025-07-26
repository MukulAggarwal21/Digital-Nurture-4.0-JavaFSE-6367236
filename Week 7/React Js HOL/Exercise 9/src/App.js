import React from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }));
    this.sayHello();
  };

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  };

  sayHello = () => {
    alert("Hello! This is a static message.");
  };

  sayWelcome = (msg) => {
    alert("Welcome Message: " + msg);
  };

  onPress = (e) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h1>Counter: {this.state.count}</h1>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to Event Handling!")}>Say Welcome</button>
        <br /><br />
        <button onClick={this.onPress}>Click Me (Synthetic Event)</button>
        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
