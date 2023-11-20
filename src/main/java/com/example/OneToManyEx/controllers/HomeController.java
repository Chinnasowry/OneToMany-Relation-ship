package com.example.OneToManyEx.controllers;

import com.example.OneToManyEx.model.Blogs;
import com.example.OneToManyEx.model.Owner;
import com.example.OneToManyEx.repository.BlogsRepo;
import com.example.OneToManyEx.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    BlogsRepo blogsRepo;

    @Autowired
    OwnerRepo ownerRepo;

    @PostMapping
    public Owner savedata(@RequestBody Owner owner) {
        return ownerRepo.save(owner);
    }

    @GetMapping("/owner/{id}")
    public Owner getdata(@PathVariable Long id){
        return ownerRepo.findById(id).get();
    }

    @GetMapping("/blog/{id}")
    public Blogs getBlogsdata(@PathVariable Long id) {
        return blogsRepo.findById(id).get();
    }
}
