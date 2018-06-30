package strategy;

/**
 * @Author:LiangTao
 * @Description:策略枚举
 *
 *
 * 缺点：
 * 受枚举类型的限制，每个枚举项都是final,扩展性受到一定约束，所以策略枚举一般担当不经常变化的角色
 *
 *
 *
 * @Date: Created in 15:25 2018/6/13.
 */
public enum  StrategyEnum {
    Add(){
        @Override
        public void exec(int a ,int b ) {
            System.out.println("Add------exec():"+(a+b));
        }
    },
    Sub(){
        @Override
        public void exec(int a, int b) {
            System.out.println("Sub------exec():"+(a-b));
        }
    };

    public abstract void exec(int a ,int b);
}


//枚举不能被继承 ，被final修饰
//enum StrategyEnum1 extends StrategyEnum{}