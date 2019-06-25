/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocbc.webview.webviewchatbotocbc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Deka
 */
@Controller
public class webviewController {

    @GetMapping("/pendidikan")
    public String pendidikan() {
        return "pendidikan";
    }

    @GetMapping("/growth")
    public String halo() {

        return "growth";
    }

    @GetMapping("/etc")
    public String etc() {

        return "etc";
    }

    @GetMapping("/product")
    public String product() {

        return "product";
    }

   

}
