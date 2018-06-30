package proxy.simpleProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:13 2018/3/3.
 */
public class SubjectProxy implements ISubject {

    private ISubject subject;
    public SubjectProxy(ISubject subject) {
        this.subject=subject;
    }

    @Override
    public void request() {
        this.subject.request();
    }
}
