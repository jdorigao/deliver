export type Order = {
    id: number;
    address: string;
    latitude: number;
    longitude: number;
    moment: string;
    status: string;
    products: Products[];
    total: number;
}

export type Products = {
    id: number;
    name: string;
    price: number;
    desciption: string;
    imageUri: string;
}