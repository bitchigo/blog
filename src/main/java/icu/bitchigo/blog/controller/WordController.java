package icu.bitchigo.blog.controller;

import icu.bitchigo.blog.pojo.vo.WordView;
import icu.bitchigo.blog.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("{id}")
    public WordView getWord(@PathVariable("id") int id){
        return wordService.getWord(id);
    }
}
