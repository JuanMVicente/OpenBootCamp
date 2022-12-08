import React from 'react';
import PropTypes from 'prop-types';
import { ContactClass } from '../../models/contact.class';


const ContactComponent = ({contact}) => {


    const changeState = () => {
        var state = true;
        if (contact.connected){
            state = false;
        }
        contact.setConected(state);     
    }

    return (
        <div>
            <h2>
                Contact info:
            </h2>
            <h4>
                Name: { contact.name }
            </h4>
            <h4>
                Last Name: { contact.name }
            </h4>
            <h4>
                e-mail: { contact.email }
            </h4>
            <h4>
                Status: { contact.connected ? 'Conected': 'disconnected' }<br></br>
                <button onClick={ changeState }>Change State</button>
            </h4>
        </div>
    );
};


ContactComponent.propTypes = {
    contact: PropTypes.instanceOf(ContactClass),
};


export default ContactComponent;
