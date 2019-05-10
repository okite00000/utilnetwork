package json;



import org.json.JSONArray;
import org.json.JSONObject;

public class json2 {
	public static void main(String[] args) {
		NetworkUtil util = new NetworkUtil();
		String result = 
		util.get("http://ggoreb.com/json2.jsp");
		System.out.println(result);
		
		JSONArray arr = new JSONArray(result);
		for(int i = 0; i<arr.length();i++) {
			JSONObject obj = arr.getJSONObject(i);
			int age = obj.getInt("age");
			String name = obj.getString("name");
			System.out.printf("%s %s\n",age,name);
			//모르는 상태라면? 활용이 안됨
			//서버연동 규격서라는 것이 있다
			
		}		
	}
}