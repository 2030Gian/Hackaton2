package com.example.demo.Application;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupRepository groupRepository; // Suponiendo que tengas un repositorio llamado GroupRepository

    // Endpoint para obtener todos los grupos
    @GetMapping
    public List<Group> getAllGroups() {
        return groupRepository.getAllGroups();
    }

    // Endpoint para obtener un grupo por ID
    @GetMapping("/{groupId}")
    public Group getGroupById(@PathVariable int groupId) {
        return groupRepository.getGroupById(groupId);
    }

    // Otros métodos relacionados con grupos, como crear, actualizar y eliminar, pueden agregarse aquí según sea necesario.

}
