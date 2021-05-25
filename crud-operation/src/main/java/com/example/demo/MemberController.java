package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/getAllMembers")
    public List<Members> getAllMembers() {
        return memberRepository.findAll();
    }

    @GetMapping("/getMember/{id}")
    public Optional<Members> getMemberId(@PathVariable(name="id") Long id){
        return memberRepository.findById(id);
    }
}
