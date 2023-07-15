import axios from "axios";
import { Config } from "../config/Config";

export const client = axios.create({
  baseURL: Config.BASE_URL,
});
