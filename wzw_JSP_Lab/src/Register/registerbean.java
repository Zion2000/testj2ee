package Register;

import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
public class registerbean {

	//register所有的成员
	private String username ;
	private String userpwd;
	private String cf_pwd;
	private String userage ;
	private String useremail;
	private Map    error;
	
	//无参构造函数
	public registerbean() {
		super();
		this.username = "";
		this.userpwd = "";
		this.cf_pwd = "";
		this.userage = "";
		this.useremail = "";
		this.error = new HashMap();
	}
	

	public boolean isValidate(){
	boolean	flag=true;
	if (!this.username.matches("\\w{3,12}")) {//验证name是否合法
		flag =false;//修改标志位
		this.username = "";//清空错误信息
		this.error.put("errname", "用户名是3-12位");//保存错误信息
	}		
		if(!this.useremail.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")){
			flag=false;
			this.useremail = "";//清空错误信息
			this.error.put("errormail", "邮箱地址格式不对");
		}
		if(!this.userage.matches("[0-9]+")){
			flag=false;
			this.userage = "";//清空错误信息
			this.error.put("errorage", "年龄格式不对");
		}
		
		if(this.username.equals("") ){
			flag=false;
			this.username = "";//清空错误信息
			this.error.put("namenullerror", "姓名不能为空");
		}
		
		if(this.userpwd.equals("")){
			flag=false;
			this.userpwd = "";//清空错误信息
			this.error.put("pwdnullerror", "密码不能为空");
		}
		if(this.cf_pwd.equals("")){
			flag=false;
			this.userpwd = "";//清空错误信息
			this.error.put("emnullerror", "确认密码不能为空");
		}
		
		if(!(this.cf_pwd.equals(this.userpwd))){
			flag=false;
			this.userpwd = "";//清空错误信息
			this.cf_pwd = "";
			this.error.put("errorcf", "两次密码不一致");
		}
		return flag;
	}
	
	
	
	public String getErrorMsg(String key){
	String	value = (String) this.error.get(key);
	return  (value==null?"":value); 		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "registerbean [username=" + username + ", userpwd=" + userpwd
				+ ", userage=" + userage + ", useremail=" + useremail
				+ ", error=" + error + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUserage() {
		return userage;
	}
	public void setUserage(String userage) {
		this.userage = userage;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getCf_pwd() {
		return cf_pwd;
	}

	public void setCf_pwd(String cf_pwd) {
		this.cf_pwd = cf_pwd;
	}

	
}
