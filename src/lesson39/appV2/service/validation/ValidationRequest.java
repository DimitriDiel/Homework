package lesson39.appV2.service.validation;


import lesson39.appV2.dto.ClientRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidationRequest {

    public boolean checkRequest(ClientRequest request){

        /*
        id > 0, < 100
        name > != null, length > 5 && < 15
        description > != null, length > 5 && < 30

         */

        List<String> errors = new ArrayList<>();

        if ((request.getId() < 0) || request.getId() > 100) errors.add("Id must be between 0 and 100 \n");

        if (request.getName().isBlank()) errors.add("Task name must be not null \n");
        if ((request.getName().length() < 5) || (request.getName().length() > 15)) errors.add("Task name length must be between 5 and 15 \n");

        if (request.getDescription().isBlank()) errors.add("Task description must be not null \n");
        if ((request.getDescription().length() < 5) || (request.getDescription().length() > 30)) errors.add("Task description length must be between 5 and 30 \n");

        if (!errors.isEmpty()) throw new ValidationException(errors.toString());

        return true;
    }

    public boolean checkRequestAdd(ClientRequest request){

        /*
        name > != null, length > 5 && < 15
        description > != null, length > 5 && < 30

         */

        List<String> errors = new ArrayList<>();

        if (request.getName().isBlank()) errors.add("Task name must be not null \n");
        if ((request.getName().length() < 5) || (request.getName().length() > 15)) errors.add("Task name length must be between 5 and 15 \n");

        if (request.getDescription().isBlank()) errors.add("Task description must be not null \n");
        if ((request.getDescription().length() < 5) || (request.getDescription().length() > 30)) errors.add("Task description length must be between 5 and 30 \n");

        if (!errors.isEmpty()) throw new ValidationException(errors.toString());

        return true;
    }
}
