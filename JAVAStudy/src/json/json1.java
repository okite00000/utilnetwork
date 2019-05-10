package json;

import java.util.HashMap;

import org.json.JSONObject;

public class json1 {
	public static void main(String[] args) {
		HashMap<String, Object> map =  new HashMap<>();
		map.put("key1","value1");
		map.put("key2",2323);
		map.put("key3",true);
		
		System.out.println(map);
		
		JSONObject obj = new JSONObject(map);
		String json = obj.toString();
		System.out.println(json);
		
		JSONObject obj2 = new JSONObject(json);
		String key1 = obj2.getString("key1");
		int key2 = obj2.getInt("key2");
		boolean key3 =  obj2.getBoolean("key3");
		System.out.printf("%s %s %s", key1, key2, key3);
		
		NetworkUtil util = new NetworkUtil();
		String result = 
		util.get("http://ggoreb.com/ajax/json1.jsp");
		System.out.println(result);
		
		JSONObject obj3 = new JSONObject(result);
		String id = obj3.getString("id");
		String pw = obj3.getString("pw");
		System.out.printf("%s ,%s", id,pw);
	}
}

