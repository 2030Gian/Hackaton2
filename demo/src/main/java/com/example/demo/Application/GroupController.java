package com.example.demo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupRepository groupRepository; // Suponiendo que tienes un repositorio llamado GroupRepository

    // Obtener todas las personas en un grupo específico
    @GetMapping("/{groupId}/persons")
    public List<Person> getPersonsInGroup(@PathVariable Long groupId) {
        Group group = groupRepository.findById(groupId).orElse(null);
        if (group != null) {
            return group.getMembers();
        } else {
            // Manejar el caso en que no se encuentre el grupo
            return Collections.emptyList();
        }
    }
}
