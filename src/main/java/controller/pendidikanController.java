/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Deka
 */
@Controller
public class pendidikanController {
    @GetMapping("/pendidikan")
    public String greeting() {
        return "pendidikan";
    }
    
    @GetMapping("/halo")
    public String halo(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        
        return "halo";
    }
}
