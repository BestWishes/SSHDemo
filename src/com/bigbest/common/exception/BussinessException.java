package com.bigbest.common.exception;

public class BussinessException extends RuntimeException {

	private static final long serialVersionUID = -5908373940572229967L;

	public BussinessException(String frdMessage)  
    {  
        super(createFriendlyErrMsg(frdMessage));  
    }  
  
    public BussinessException(Throwable throwable)  
    {  
        super(throwable);  
    }  
  
    public BussinessException(Throwable throwable, String frdMessage)  
    {  
        super(throwable);  
    }  
  
    private static String createFriendlyErrMsg(String msgBody)  
    {  
        String prefixStr = "��Ǹ��";  
        String suffixStr = " ���Ժ����Ի������Ա��ϵ��";  
  
        StringBuffer friendlyErrMsg = new StringBuffer("");  
  
        friendlyErrMsg.append(prefixStr);  
  
        friendlyErrMsg.append(msgBody);  
  
        friendlyErrMsg.append(suffixStr);  
  
        return friendlyErrMsg.toString();  
    }  
}
