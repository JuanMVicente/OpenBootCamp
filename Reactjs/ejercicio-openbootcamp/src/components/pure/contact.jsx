import React from 'react';
import PropTypes from 'prop-types';
import { ContactClass } from '../../models/contact.class';


const ContactComponent = ({contact}) => {
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
                Status: { contact.conected ? 'Conected': 'disconnected' }
            </h4>
        </div>
    );
};


ContactComponent.propTypes = {
    contact: PropTypes.instanceOf(ContactClass),
};


export default ContactComponent;
