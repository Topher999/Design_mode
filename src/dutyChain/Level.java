package dutyChain;

/**
 * @Author:LiangTao
 * @Description:
 * @Date: Created in 15:17 2018/6/6.
 */
public class Level {
    private int levelNumber;

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Level)){ return false;}
        return (((Level)obj).getLevelNumber())==this.getLevelNumber();
    }


    public Level(int levelNumber) {
        this.levelNumber = levelNumber;
    }
}
