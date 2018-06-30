package dutyChain;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 11:46 2018/6/6.
 */
public class Response {
    private String respMessage;

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }

    public Response(String respMessage) {
        this.respMessage = respMessage;
    }


    @Override
    public String toString() {
        return "Response{" +
                "respMessage='" + respMessage + '\'' +
                '}';
    }
}
