package com.example.esl_ble_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class MemCartRequest extends StringRequest {

    final static private String URL = "http://ec2-13-124-52-74.ap-northeast-2.compute.amazonaws.com/mem_cart_app.php";
    private Map<String, String> map;

    public MemCartRequest(String userID, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID",userID);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}