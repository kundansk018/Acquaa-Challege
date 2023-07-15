import React, { useState } from "react";
import { Button } from "react-bootstrap";
import { ArrowRight, Eye } from "react-bootstrap-icons";
import { getFareData } from "../services/Services";

export default function BusFare() {
  const [startStopsId, setStartStopId] = useState("");
  const [endStopsId, setEndStopId] = useState("");
  const [result, setResult] = useState("");

  const stops = [
    { distance: 0, name: "H.S.R. Layout" },
    { distance: 5, name: "Madiwala" },
    { distance: 11, name: "Forum" },
    { distance: 15, name: "Shanthinagara" },
    { distance: 18, name: "Richmond Circle" },
    { distance: 23, name: "Chancery Pavillion" },
    { distance: 25, name: "Bowring Institute" },
    { distance: 27, name: "Bangalore Club" },
    { distance: 29, name: "Indian Express" },
    { distance: 30, name: "Vasantanagara" },
    { distance: 33, name: "RM Guttahalli" },
    { distance: 35, name: "Mekhri Circle" },
    { distance: 37, name: "Hebbala" },
    { distance: 62, name: "BIAL" },
  ];

  let distance = [0, 5, 11, 15, 18, 23, 25, 27, 29, 30, 33, 35, 37, 62];

  const onHandleChange = () => {
    console.log("onHandle Change called");
    let data = {
      startStopsId,
      endStopsId,
    };
    getFareData(data)
      .then((res) => {
        console.log("data in get fare page", res.data);
        setResult(res.data);
      })
      .catch((error) => {
        console.log("error inside catch in bus fare page", error);
        throw error;
      });
  };

  return (
    <>
      <div className="d-flex justify-between">
        <div>
          <select onChange={(e) => setStartStopId(e.target.value)}>
            {stops.map((element, index) => (
              <option value={index + 1}>
                {index + 1 + ". " + element.name + "  |  " + element.distance}
              </option>
            ))}
          </select>
        </div>
        <div>
          <ArrowRight style={{ marginLeft: "20px", marginRight: "20px" }} />{" "}
        </div>
        <div>
          <select onChange={(e) => setEndStopId(e.target.value)}>
            {stops.map((element, index) => (
              <option value={index + 1}>
                {index + 1 + ". " + element.name + "  |  " + element.distance}
              </option>
            ))}
          </select>
        </div>

        <div>
          <span
            style={{
              width: "10px",
              height: "10px",
              marginLeft: "10px",
              marginRight: "10px",
            }}
          >
            =
          </span>
        </div>

        <div>
          <Button onClick={onHandleChange}>Get - Fare</Button>
        </div>
      </div>
      <div>
        <h1>Fare Is :: {result} Rs. </h1>
        <h1>
          {stops.map((element, index) =>
            console.log(startStopsId == index ? element : "")
          )}
        </h1>
      </div>
    </>
  );
}
