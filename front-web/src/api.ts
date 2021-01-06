import axios from "axios";

const API_URL = 'https://api-deliver.herokuapp.com';

export function fetchProducts(){
    return axios(`${API_URL}/products`)
}