package builder;

import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 13:55 2018/3/3.
 */
public class BenzBuilder  extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    /**
     * @Author: LiangTao
     * @Date: 14:34 2018/3/3
     * @Description:处理奔驰车依据传入序列进行宝马车的处理逻辑，
     * @Params: * @param null
     * @Return: a     * @Exception:
     */
    @Override
    public void buildProcess(List<String> sequenceList) {
//        '''''''''
        //  定义奔驰处理逻辑
        this.benzModel.setSequenceList(sequenceList);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
