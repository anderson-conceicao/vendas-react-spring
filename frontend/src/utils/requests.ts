import axios from 'axios';
export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? 'https://vendas-anderson.herokuapp.com';

export const api = axios.create({
  baseURL: BASE_URL
});