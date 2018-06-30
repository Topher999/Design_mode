package builder;

import java.util.List;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 13:55 2018/3/3.
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    /**
     * @Author: LiangTao
     * @Date: 14:34 2018/3/3
     * @Description:处理宝马车依据传入序列进行宝马车的处理逻辑
     * @Params: * @param null
     * @Return: a     * @Exception:
     */
    @Override
    public void buildProcess(List<String> sequenceList) {
//        '''''''''
        // 定义宝马处理逻辑
        this.bmwModel.setSequenceList(sequenceList);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
