package json;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class YOUTUBE {
	public static void main(String[] args) throws UnsupportedEncodingException {
		NetworkUtil util = new NetworkUtil();
		String result = 
		util.get("https://www.googleapis.com/youtube/v3/search?part=snippet&key=AIzaSyA05CJLU0WyOVh6ISGTKIEx9DflQTCij-U&q=ppap&maxResults=10");
	
//		String url = "https://www.googleapis.com/youtube/v3/search";
//		String param = "?part=snippet&key=AIzaSyA05CJLU0WyOVh6ISGTKIEx9DflQTCij-U&maxResults=10";
//		url = url + param + "ppap";
//		
//		System.out.println(result);
//		
//		String result = util.get(url);
		JSONObject obj = new JSONObject(result);
		
		JSONArray items = obj.getJSONArray("items");
		
		for(int i = 0; i<items.length();i++) {
			JSONObject item = items.getJSONObject(i);
			JSONObject id = item.getJSONObject("id");
			String videoId = id.getString("videoId");
			System.out.println(videoId);
			
			String title = item.getJSONObject("snippet").getString("title");
			System.out.println(title);
		}
		
		
	}
}
		
//		String ti =
//				obj.getString("title");
//		
//		String id =
//				obj.getString("videoId");
//		
//		System.out.printf("%s,%s", ti,id);
//		
//		}		
//		
//	}
//
//
