
public class Swag {
	enum STYLE{
		CROSS{
			String applyStyle(String txt) {
				StringBuilder mynewString = new StringBuilder();
				for(int i=0;i<txt.length();i++) {
					if(i<txt.length()-1) {
						mynewString.append(txt.charAt(i).append("+"));
						
					}
				
					else{
						mynewString.append(txt.charAt(i));
					}
					return mynewString.toString();
				}
			}
		},
		KIKOU{
			String applyStyle(String txt) {
				StringBuilder mynewString = new StringBuilder();
				for(int i=0;i<txt.length();i++) {
					if(i%2==0) {
						mynewString.append(Character.toUpperCase(txt.charAt(i)));
						
					}
				
					else{
						mynewString.append(txt.charAt(i));
					}
					return mynewString.toString();
				}
			}
		}
	}
	abstract String applyStyle(String txt);
}


