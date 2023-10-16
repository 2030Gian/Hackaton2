package com.example.demo.Application;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupRepository groupRepository; 

  
    @GetMapping
    public List<Group> getAllGroups() {
        return groupRepository.getAllGroups();
    }

    
    @GetMapping("/{groupId}")
    public Group getGroupById(@PathVariable int groupId) {
        return groupRepository.getGroupById(groupId);
    }

   

}
