import logo from "./logo.svg";
import "./App.css";
import BusFare from "./components/BusFare";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h5>Bus Ticket Fare Calculator</h5>
        <BusFare />
      </header>
    </div>
  );
}

export default App;
