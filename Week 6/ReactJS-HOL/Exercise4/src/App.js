import React from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    const { isLoggedIn } = this.state;
    let content;

    if (isLoggedIn) {
      content = <UserPage onLogout={this.handleLogout} />;
    } else {
      content = <GuestPage onLogin={this.handleLogin} />;
    }

    return <div>{content}</div>;
  }
}

export default App;
