package com.sasha.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askNickname")
    public String askCandidateNickname(){
        return "address-the-candidate-second-view";
    }

// information for about-company-third-view extract from address-the-candidate-second-view
//    @RequestMapping("/aboutCompany")
//    public String presentationOfCompany(){
//        return "about-company-third-view";
//    }


// information for about-company-third-view extract from Model
//1) with HttpServletRequest
//    @RequestMapping("/aboutCompany")
//    public String presentationOfCompany(HttpServletRequest request, Model model){
//        // get candidateCall from address-the-candidate-second-view
//        String candCall = request.getParameter("candidateCall");
//        // change candidateCall in about-company-third-view
//        candCall = "Dear "+ candCall;
//        // add to model
//        model.addAttribute("nameAttribute1", candCall);
//        model.addAttribute("nameAttribute2", "please press the button to continue");
//
//        return "about-company-third-view";
//    }

//2) with annotation @RequestParam
    @RequestMapping("/aboutCompany")
    public String presentationOfCompany(@RequestParam("candidateCall") String candCall, Model model){  // get candidateCall from address-the-candidate-second-view
        // change candidateCall in show-candidate-details-view
        candCall = "Dear "+ candCall;
        // add to model
        model.addAttribute("nameAttribute1", candCall);
        model.addAttribute("nameAttribute2", "please press the button to continue");

        return "about-company-third-view";
    }


}
