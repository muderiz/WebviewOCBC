/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocbc.webview.webviewchatbotocbc;

import com.ocbc.webview.util.OkHttpUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import okhttp3.Request;
import okhttp3.Response;
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

//    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
//    private JSONObject GeneralExecuteAPI(String link) {
//        JSONObject jsonobj = null;
//        try {
//            OkHttpUtil okHttpUtil = new OkHttpUtil();
//            okHttpUtil.init(true);
//            Request request = new Request.Builder().url(link).get().build();
//            Response response = okHttpUtil.getClient().newCall(request).execute();
//            String res = response.body().string();
//            jsonobj = new JSONObject(res);
//        } catch (Exception e) {
//        }
//
//        return jsonobj;
//    }
    @RequestMapping(value = {"/growth"}, method = {RequestMethod.GET})
    @GetMapping
    public String growth() {
//    public String growth(@PathVariable String Investment_Type, @PathVariable String Investment_Amount, @PathVariable String Tenor,
//            String RC, String ExtReffId, String Rate, String Result, String idWebchat, String Title, String Payload, Model model) {

//        int ChannelId = 0;
//        int RC = 0;
//        String ExtReffId = "";
//        String RC_Desc = "";
//        String Rate = "";
//        BigDecimal Result = null;
//        try {
//            OkHttpUtil okHttpUtil = new OkHttpUtil();
//            okHttpUtil.init(true);
//            String URLJsonFutureValue = "https://api.myjson.com/bins/6gjuh";
//
//            Request request = new Request.Builder().url(URLJsonFutureValue).get().build();
//            Response response = okHttpUtil.getClient().newCall(request).execute();
//            JSONArray jsonArray = new JSONArray(response.body().string());
//
//            JSONObject jsonObject = jsonArray.getJSONObject(0);
//            String message = jsonObject.getString("body");
//
//            RC = jsonObject.getString("RC");
//            ExtReffId = jsonObject.getString("Ext_Reff_ID");
//            Rate = jsonObject.getString("Rate");
//            Result = jsonObject.getString("Result");
//        } catch (Exception e) {
//
//        }
//        idWebchat = "7347dc6b3243f75c08f9d14699a25a8f";
//        Title = "Ini Title Test";
//        Payload = "4000&20&20&20";
//
//        model.addAttribute("Investment_Type", Investment_Type);
//        model.addAttribute("Investment_Amount", Investment_Amount);
//        model.addAttribute("Tenor", Tenor);
//        model.addAttribute("RC", RC);
//        model.addAttribute("Ext_Reff_ID", ExtReffId);
//        model.addAttribute("Rate", Rate);
//        model.addAttribute("Result", Result);
//        model.addAttribute("idWebchat", idWebchat);
//        model.addAttribute("Title", Title);
//        model.addAttribute("Payload", Payload);
        return "growth";
    }

    @RequestMapping(value = {"/pendidikan"}, method = {RequestMethod.GET})
//    @RequestMapping(value = {"/pendidikan/{customer_name}/{usia_anak}/{negara}/{dana_tersedia}"}, method = {RequestMethod.GET})
//    @GetMapping("/pendidikan")
    @GetMapping
    public String pendidikan() {
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

//        model.addAttribute("customer_name", customer_name);
//        model.addAttribute("usia_anak", usia_anak);
//        model.addAttribute("negara", negara);
//        model.addAttribute("dana_tersedia", dana_tersedia);
        return "pendidikan";
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

    @GetMapping("/product")
    public String product() {

        return "product";
    }

}
