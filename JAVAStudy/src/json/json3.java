package json;


import java.lang.reflect.Array;

import org.json.JSONArray;
import org.json.JSONObject;

public class json3 {
	public static void main(String[] args) {
		NetworkUtil util = new NetworkUtil();
		String result = 
		util.get("http://ggoreb.com/json3.jsp");
		System.out.println(result);
		
		JSONArray arr = new JSONArray(result);
		for(int i = 0; i<arr.length();i++) {
			JSONObject obj = arr.getJSONObject(i);
			JSONArray address = obj.getJSONArray("address");
			int age = obj.getInt("age");
			String name = obj.getString("name");
			for(int j = 0; j<address.length();j++) {
				String value = address.getString(j);
				System.out.printf("%s ", value);
			}
			System.out.printf("%s %s %s\n",address,age,name);
			//모르는 상태라면? 활용이 안됨
			//서버연동 규격서라는 것이 있다
			
		}
		
	}
}

