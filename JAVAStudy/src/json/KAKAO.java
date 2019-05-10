package json;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class KAKAO {
	public static void main(String[] args) throws UnsupportedEncodingException {
		NetworkUtil util = new NetworkUtil();
		String result = 
		util.get("https://kapi.kakao.com/v1/translation/translate" + 
				"?src_lang=kr&target_lang=en&query="
						+ URLEncoder.encode("호로로롤로로","utf-8"));
		System.out.println(result);
		
		JSONObject obj = new JSONObject(result);
		JSONArray translated_text =
				obj.getJSONArray("translated_text");
		System.out.println(translated_text);
		
		JSONArray arr0 = translated_text.getJSONArray(0);
		System.out.println(arr0);
		
		String data = arr0.getString(0);
		System.out.println(data);
		
		}		
		
	}


