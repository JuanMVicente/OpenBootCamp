import React from 'react';
import { ContactClass } from '../../models/contact.class';
import ContactComponent from '../pure/contact_component';



const ContactList = () => {

    const contact = new ContactClass('Juan Martín','Vicente','j_m_vicente@yahoo.com.ar',true);


    return (
        <div>
            <div>
                <h1>
                    Contacts List:
                </h1>
            </div>
            {/* Aplicar ciclos para escribir una lista */}
            <ContactComponent contact= { contact }></ContactComponent>
        </div>
    );
};



export default ContactList;
