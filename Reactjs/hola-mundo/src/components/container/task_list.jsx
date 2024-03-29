import React from 'react';
import { LEVELS } from '../../models/models.enum';
import { Task } from '../../models/task.class';
import TaskComponent from '../pure/task';


const TaskListComponent = () => {

    const defaultTask = new Task('Example','Default description', false,LEVELS.NORMAL);

    return (
        <div>
            <div>
                Your Tasks:
            </div>
            {/* TODO Aplicar un For/Map para renderizar una lista */}
            <TaskComponent task={ defaultTask }></TaskComponent>
        </div>
    );
};



export default TaskListComponent;
