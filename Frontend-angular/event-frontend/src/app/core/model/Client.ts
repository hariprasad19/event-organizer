export interface Client {
    clientId?: number; // Optional, as it's generated by the backend
    name: string; // Client's name
    email: string; // Client's email address
    phoneNumber: string; // Client's phone number
    userId: number; // ID of the user associated with the client
    events: number[]; // Array of event IDs that the client is associated with
  }
  