/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocbc.webview.webviewchatbotocbc;

import com.ocbc.webview.util.OkHttpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Deka
 */
@Controller
public class webviewController {

    @RequestMapping(value = {"/pendidikan/{customer_name}/{usia_anak}/{negara}/{dana_tersedia}"}, method = {RequestMethod.GET})
    @GetMapping
    public String pendidikan(@PathVariable String customer_name, @PathVariable String usia_anak, @PathVariable String negara, @PathVariable String dana_tersedia, Model model) {
//        try {
//            OkHttpUtil okHttpUtil = new OkHttpUtil();
//            okHttpUtil.init(true);
//            String url = "";
//            Request request = new Request.Builder().url(url).get().build();
//            Response response = okHttpUtil.getClient().newCall(request).execute();
//
//            JSONObject jsonObject = new JSONObject(response);
//            int RC = jsonObject.getInt("RC");
//            String Rate = jsonObject.getString("Rate");
//            String Result = jsonObject.getString("Result");
//        } catch (Exception e) {
//        }

        model.addAttribute("customer_name", customer_name);
        model.addAttribute("usia_anak", usia_anak);
        model.addAttribute("negara", negara);
        model.addAttribute("dana_tersedia", dana_tersedia);

        return "pendidikan";
    }

    @RequestMapping(value = {"/growth/{Investment_Type}/{Investment_Amount}/{Tenor}"}, method = {RequestMethod.GET})
    @GetMapping
    public String growth(@PathVariable String Investment_Type, @PathVariable String Investment_Amount, @PathVariable String Tenor, Model model) {
//        try {
//            OkHttpUtil okHttpUtil = new OkHttpUtil();
//            okHttpUtil.init(true);
//            String url = "";
//            Request request = new Request.Builder().url(url).get().build();
//            Response response = okHttpUtil.getClient().newCall(request).execute();
//
//            JSONObject jsonObject = new JSONObject(response);
//            int RC = jsonObject.getInt("RC");
//            String Rate = jsonObject.getString("Rate");
//            String Result = jsonObject.getString("Result");
//        } catch (Exception e) {
//        }

        model.addAttribute("Investment_Type", Investment_Type);
        model.addAttribute("Investment_Amount", Investment_Amount);
        model.addAttribute("Tenor", Tenor);

        return "growth";
    }

    @RequestMapping(value = {"/etc/{customer_name}/{target_dana}/{dana_sekarang}/{jangka_waktu}"}, method = {RequestMethod.GET})
    @GetMapping
    public String etc(@PathVariable String customer_name, @PathVariable String target_dana, @PathVariable String dana_sekarang, 
            @PathVariable String jangka_waktu, Model model) {
//        try {
//            OkHttpUtil okHttpUtil = new OkHttpUtil();
//            okHttpUtil.init(true);
//            String url = "";
//            Request request = new Request.Builder().url(url).get().build();
//            Response response = okHttpUtil.getClient().newCall(request).execute();
//
//            JSONObject jsonObject = new JSONObject(response);
//            int RC = jsonObject.getInt("RC");
//            String Rate = jsonObject.getString("Rate");
//            String Result = jsonObject.getString("Result");
//        } catch (Exception e) {
//        }

        model.addAttribute("customer_name", customer_name);
        model.addAttribute("target_dana", target_dana);
        model.addAttribute("dana_sekarang", dana_sekarang);
        model.addAttribute("jangka_waktu", jangka_waktu);

        return "etc";
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
