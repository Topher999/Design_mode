package proxy.generalProxy;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 16:51 2018/3/3.
 */
public class GamePlayer implements IGamePlayer {

    public GamePlayer(IGamePlayer _gamePlayer) throws Exception {
        //�˴�Ҳ���ԶԲ����������Ƿ��Ǵ�����֤�����Ƿ��׺��proxy��
        if(_gamePlayer==null) {
            throw new Exception("��ֹ������ʵ����ֻ�ܴ�������");
        }
    }

    @Override
    public void login() {
        System.out.println("����   ��½�ɹ�");
    }

    @Override
    public void killBoss() {
        System.out.println("����   ɱ��");
    }

    @Override
    public void upgrade() {
        System.out.println("����   ������");
    }
}
