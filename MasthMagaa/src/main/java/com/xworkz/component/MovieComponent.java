package com.xworkz.component;

import com.xworkz.dto.MovieDTO;
import com.xworkz.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class MovieComponent {

    @Autowired
    private MovieService movieService;

    public MovieComponent(){
        System.out.println("The Movie Component is create.");
    }

    @RequestMapping("/movie")
    public String movie(Model model, @Valid MovieDTO movieDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println("There is validation error, please fit the error.");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationError",errors);
            model.addAttribute("movieDTO",movieDTO);
        }else {
            System.out.println("There is no validation error, please execute the service" );
            model.addAttribute("movieMessage","The movie is created.");
            System.out.println("The movie---->"+movieDTO);
            this.movieService.saveAndValidate(movieDTO);
        }

        return "Movie.jsp";
    }
}
