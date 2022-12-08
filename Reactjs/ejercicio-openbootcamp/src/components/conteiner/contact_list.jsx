import React from 'react';
import ContactClass from '../models/contact.class';
import ContactComponent from '../pure/contact';



const ContactList = () => {

    const contact = new ContactClass('Juan Martín','Vicente','j_m_vicente@yahoo.com.ar',false);

    return (
        <div>
            <div>
                Contacts:
            </div>
            {/* Aplicar ciclos para escribir una lista */}
            <ContactComponent task= { contact }></ContactComponent>
        </div>
    );
};



export default ContactList;
