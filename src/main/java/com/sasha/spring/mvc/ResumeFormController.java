package com.sasha.spring.mvc;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class ResumeFormController {

    @RequestMapping("/askDetails")
    public String askCandidateDetails(Model model) {
        // if we want to set default value in ask-candidate-details-view:
//        Candidate cand = new Candidate();
//        cand.setName("Ivan");
//        model.addAttribute ("candidate", cand);
        model.addAttribute("candidate", new Candidate());
        return "ask-candidate-details-view";
    }


    @RequestMapping("/showDetails")
    public String showCandidateDetails(@Valid @ModelAttribute("candidate") Candidate cand,
                                       BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-candidate-details-view";
        } else {
 //        if we want change value in show-candidate-details-view:
            String name = cand.getName();
            cand.setName(name.substring(0,1).toUpperCase() + name.substring(1));
            String surname = cand.getSurname();
            cand.setSurname(surname.substring(0,1).toUpperCase() + surname.substring(1));
            return "show-candidate-details-view";
        }
       // return "show-candidate-details-view"
    }
}
