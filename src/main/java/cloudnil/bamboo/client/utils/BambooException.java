package cloudnil.bamboo.client.utils;
/**
 * <p>ClassName: BambooException</p>
 * <p>Description: 异常封装类</p>
 * @author 史绍虎
 * <p>Date: 2015-11-16 下午5:31:06</p>
 */
public class BambooException extends Exception {
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	
	public BambooException(int status, String message) {
		this.status = status;
		this.message = message;
	}
    public int getStatus() {
        return status;
    }

    @Override
	public String getMessage() {
		return message + " (Http 状态: " + status + ")";
	}

	@Override
	public String toString() {
		return message + " (Http 状态: " + status + ")";
	}
}
