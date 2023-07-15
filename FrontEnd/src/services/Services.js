import { ENDPOINT } from "../config/Config";
import { client } from "./Axios";

export const getFareData = (data) => {
  console.log("data inside service::", data);
  return client
    .get(ENDPOINT.get_fare + "/" + data.startStopsId + "/" + data.endStopsId, {
      headers: {},
    })
    .then((res) => {
      console.log(res.data);
      return res;
    })
    .catch((err) => {
      throw err;
    });
};
