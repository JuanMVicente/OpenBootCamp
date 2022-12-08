

export class ContactClass {
    name = "";
    lastName = "";
    email = "";
    conencted = false;

    constructor(name, lastName, email, connected){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.connected = connected;
    }

    setConected(connected)
    {
        this.connected = connected;
    }
}