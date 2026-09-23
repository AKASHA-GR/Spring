package com.xworkz.component;

import com.xworkz.dto.MovieDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MovieComponent {

    public MovieComponent(){
        System.out.println("The Movie Component is create.");
    }

    @RequestMapping("/movie")
    public String movie(Model model, MovieDTO movieDTO){
        model.addAttribute("movieMessage","The movie is created.");
        System.out.println("The movie---->"+movieDTO);
        return "Movie.jsp";
    }
}
