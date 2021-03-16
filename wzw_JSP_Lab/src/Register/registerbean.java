package Register;

import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
public class registerbean {

	//register���еĳ�Ա
	private String username ;
	private String userpwd;
	private String cf_pwd;
	private String userage ;
	private String useremail;
	private Map    error;
	
	//�޲ι��캯��
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
	if (!this.username.matches("\\w{3,12}")) {//��֤name�Ƿ�Ϸ�
		flag =false;//�޸ı�־λ
		this.username = "";//��մ�����Ϣ
		this.error.put("errname", "�û�����3-12λ");//���������Ϣ
	}		
		if(!this.useremail.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")){
			flag=false;
			this.useremail = "";//��մ�����Ϣ
			this.error.put("errormail", "�����ַ��ʽ����");
		}
		if(!this.userage.matches("[0-9]+")){
			flag=false;
			this.userage = "";//��մ�����Ϣ
			this.error.put("errorage", "�����ʽ����");
		}
		
		if(this.username.equals("") ){
			flag=false;
			this.username = "";//��մ�����Ϣ
			this.error.put("namenullerror", "��������Ϊ��");
		}
		
		if(this.userpwd.equals("")){
			flag=false;
			this.userpwd = "";//��մ�����Ϣ
			this.error.put("pwdnullerror", "���벻��Ϊ��");
		}
		if(this.cf_pwd.equals("")){
			flag=false;
			this.userpwd = "";//��մ�����Ϣ
			this.error.put("emnullerror", "ȷ�����벻��Ϊ��");
		}
		
		if(!(this.cf_pwd.equals(this.userpwd))){
			flag=false;
			this.userpwd = "";//��մ�����Ϣ
			this.cf_pwd = "";
			this.error.put("errorcf", "�������벻һ��");
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
