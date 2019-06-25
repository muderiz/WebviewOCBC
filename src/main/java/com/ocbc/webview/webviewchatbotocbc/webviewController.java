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

    @GetMapping("/pendidikan")
    public String pendidikan() {

        return "pendidikan";
    }

//    private List<String> getMobilDinamis(String url, String jsonName, String key) {
//        List<String> result = new ArrayList<>();
//        try {
//            OkHttpUtil okHttpUtil = new OkHttpUtil();
//            okHttpUtil.init(true);
//            Request request = new Request.Builder().url(url).get().build();
//            Response response = okHttpUtil.getClient().newCall(request).execute();
//
//            String res = "{\"" + jsonName + "\":" + response.body().string() + "}";
//
//            JSONObject jsonObject = new JSONObject(res);
//            JSONArray jSONArray = jsonObject.getJSONArray(jsonName);
//            for (int i = 0; i < jSONArray.length(); i++) {
//                JSONObject obj = (JSONObject) jSONArray.get(i);
//                result.add(obj.getString(key));
//            }
//        } catch (Exception e) {
//
//        }
//        return result;
//    }
    @RequestMapping(value = {"/greeting/{Investment_Type}/{Investment_Amount}/{Tenor}"}, method = {RequestMethod.GET})
    @GetMapping
    public String halo(@PathVariable String Investment_Type, @PathVariable String Investment_Amount, @PathVariable String Tenor, Model model) {

        model.addAttribute("Investment_Type", Investment_Type);
        model.addAttribute("Investment_Amount", Investment_Amount);
        model.addAttribute("Tenor", Tenor);

        return "greeting";
    }

    @RequestMapping(value = {"/growth/{Investment_Type}/{Investment_Amount}/{Tenor}"}, method = {RequestMethod.GET})
    @GetMapping
    public String growth(@PathVariable String Investment_Type, @PathVariable String Investment_Amount, @PathVariable String Tenor, Model model) {
        try {
            OkHttpUtil okHttpUtil = new OkHttpUtil();
            okHttpUtil.init(true);
            String url = "";
            Request request = new Request.Builder().url(url).get().build();
            Response response = okHttpUtil.getClient().newCall(request).execute();

            JSONObject jsonObject = new JSONObject(response);
            int RC = jsonObject.getInt("RC");
            String Rate = jsonObject.getString("Rate");
            String Result = jsonObject.getString("Result");
        } catch (Exception e) {

        }

        model.addAttribute("Investment_Type", Investment_Type);
        model.addAttribute("Investment_Amount", Investment_Amount);
        model.addAttribute("Tenor", Tenor);
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
